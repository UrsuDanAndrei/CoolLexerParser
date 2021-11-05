package cool.compiler;

import cool.ast.ASTNode;
import cool.ast.ASTVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import cool.lexer.*;
import cool.parser.*;

import java.io.*;
import java.util.List;

public class Compiler {
    // Annotates class nodes with the names of files where they are defined.
    public static ParseTreeProperty<String> fileNames = new ParseTreeProperty<>();

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.err.println("No file(s) given");
            return;
        }
        
        CoolLexer lexer = null;
        CommonTokenStream tokenStream = null;
        CoolParser parser = null;
        ParserRuleContext globalTree = null;
        
        // True if any lexical or syntax errors occur.
        boolean lexicalSyntaxErrors = false;
        
        // Parse each input file and build one big parse tree out of
        // individual parse trees.
        for (var fileName : args) {
            var input = CharStreams.fromFileName(fileName);
            
            // Lexer
            if (lexer == null)
                lexer = new CoolLexer(input);
            else
                lexer.setInputStream(input);

            // Token stream
            if (tokenStream == null)
                tokenStream = new CommonTokenStream(lexer);
            else
                tokenStream.setTokenSource(lexer);

            /**********************************************************************************************************/
            /*
            // Test lexer only.
            tokenStream.fill();
            List<Token> tokens = tokenStream.getTokens();
            tokens.stream().forEach(token -> {
                var text = token.getText();
                var name = CoolLexer.VOCABULARY.getSymbolicName(token.getType());
                
                System.out.println(text + " : " + name);
                //System.out.println(token);
            });

            System.exit(0);
            */
            /**********************************************************************************************************/

            
            // Parser
            if (parser == null)
                parser = new CoolParser(tokenStream);
            else
                parser.setTokenStream(tokenStream);
            
            // Customized error listener, for including file names in error
            // messages.
            var errorListener = new BaseErrorListener() {
                public boolean errors = false;
                
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer,
                                        Object offendingSymbol,
                                        int line, int charPositionInLine,
                                        String msg,
                                        RecognitionException e) {
                    String newMsg = "\"" + new File(fileName).getName() + "\", line " +
                                        line + ":" + (charPositionInLine + 1) + ", ";
                    
                    Token token = (Token)offendingSymbol;
                    if (token.getType() == CoolLexer.ERROR)
                        newMsg += "Lexical error: " + token.getText();
                    else
                        newMsg += "Syntax error: " + msg;
                    
                    System.err.println(newMsg);
                    errors = true;
                }
            };
            
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);
            
            // Actual parsing
            var tree = parser.program();
            if (globalTree == null)
                globalTree = tree;
            else
                // Add the current parse tree's children to the global tree.
                for (int i = 0; i < tree.getChildCount(); i++)
                    globalTree.addAnyChild(tree.getChild(i));
                    
            // Annotate class nodes with file names, to be used later
            // in semantic error messages.
            for (int i = 0; i < tree.getChildCount(); i++) {
                var child = tree.getChild(i);
                // The only ParserRuleContext children of the program node
                // are class nodes.
                if (child instanceof ParserRuleContext)
                    fileNames.put(child, fileName);
            }
            
            // Record any lexical or syntax errors.
            lexicalSyntaxErrors |= errorListener.errors;
        }

        // Stop before semantic analysis phase, in case errors occurred.
        if (lexicalSyntaxErrors) {
            System.err.println("Compilation halted");
            return;
        }

        var astPrintVisitor = new ASTVisitor<Void>() {
            private final int STANDARD_INDENT = 2;
            private int indent = 0;

            @Override
            public Void visit(ASTNode.ProgramNode node) {
                printWithIndent("program");

                indent += STANDARD_INDENT;

                for (var coolClassNode : node.getCoolClasses()) {
                    visit(coolClassNode);
                }

                indent -= STANDARD_INDENT;

                return null;
            }

            @Override
            public Void visit(ASTNode.CoolClassNode node) {
                printWithIndent("class");

                indent += STANDARD_INDENT;

                visit(node.getId());

                if (node.getParentClass() != null) {
                    visit(node.getParentClass());
                }

                for (var feature : node.getFeatures()) {
                    feature.accept(this);
                }

                indent -= STANDARD_INDENT;

                return null;
            }

            @Override
            public Void visit(ASTNode.AttributeNode node) {
                printWithIndent("attribute");

                indent += STANDARD_INDENT;

                visit(node.getId());
                visit(node.getType());

                if (node.getValue() != null) {
                    node.getValue().accept(this);
                }

                indent -= STANDARD_INDENT;

                return null;
            }

            @Override
            public Void visit(ASTNode.MethodNode node) {
                printWithIndent("method");

                indent += STANDARD_INDENT;

                visit(node.getId());

                for (var parameter : node.getParameters()) {
                    visit(parameter);
                }

                visit(node.getReturnType());
                node.getBody().accept(this);

                indent -= STANDARD_INDENT;

                return null;
            }

            @Override
            public Void visit(ASTNode.FormalNode node) {
                printWithIndent("formal");

                indent += STANDARD_INDENT;

                visit(node.getId());
                visit(node.getType());

                indent -= STANDARD_INDENT;

                return null;
            }

            @Override
            public Void visit(ASTNode.IfNode node) {
                printWithIndent("if");

                indent += STANDARD_INDENT;

                node.getCond().accept(this);
                node.getThenBr().accept(this);
                node.getElseBr().accept(this);

                indent -= STANDARD_INDENT;

                return null;
            }

            @Override
            public Void visit(ASTNode.WhileNode node) {
                printWithIndent("while");

                indent += STANDARD_INDENT;

                node.getCond().accept(this);
                node.getBody().accept(this);

                indent -= STANDARD_INDENT;

                return null;
            }

            @Override
            public Void visit(ASTNode.LetNode node) {
                printWithIndent("let");

                indent += STANDARD_INDENT;

                for (var localVariableNode : node.getLocalVars()) {
                    visit(localVariableNode);
                }

                node.getBody().accept(this);

                indent -= STANDARD_INDENT;

                return null;
            }

            @Override
            public Void visit(ASTNode.LocalVariableNode node) {
                printWithIndent("local");

                indent += STANDARD_INDENT;

                visit(node.getId());
                visit(node.getType());

                if (node.getValue() != null) {
                    node.getValue().accept(this);
                }

                indent -= STANDARD_INDENT;

                return null;
            }

            @Override
            public Void visit(ASTNode.CaseNode node) {
                printWithIndent("case");

                indent += STANDARD_INDENT;

                node.getToEvaluate().accept(this);

                for (var caseBranchNode : node.getBranches()) {
                    visit(caseBranchNode);
                }

                indent -= STANDARD_INDENT;

                return null;
            }

            @Override
            public Void visit(ASTNode.CaseBranchNode node) {
                printWithIndent("case branch");

                indent += STANDARD_INDENT;

                visit(node.getId());
                visit(node.getType());
                node.getBody().accept(this);

                indent -= STANDARD_INDENT;

                return null;
            }

            @Override
            public Void visit(ASTNode.BlockNode node) {
                printWithIndent("block");

                indent += STANDARD_INDENT;

                for (var exprNode : node.getExprs()) {
                    exprNode.accept(this);
                }

                indent -= STANDARD_INDENT;

                return null;
            }

            @Override
            public Void visit(ASTNode.DispatchNode node) {
                if (node.isImplicit()) {
                    printWithIndent("implicit dispatch");
                } else {
                    printWithIndent(".");
                }

                indent += STANDARD_INDENT;

                if (node.getCallerObject() != null) {
                    node.getCallerObject().accept(this);
                }

                if (node.getClassContext() != null) {
                    visit(node.getClassContext());
                }

                visit(node.getId());

                for (var arg : node.getArgs()) {
                    arg.accept(this);
                }

                indent -= STANDARD_INDENT;

                return null;
            }

            @Override
            public Void visit(ASTNode.OperationNode node) {
                visit(node.getOperation());

                indent += STANDARD_INDENT;

                node.getLeftOperand().accept(this);

                if (node.getRightOperand() != null) {
                    node.getRightOperand().accept(this);
                }

                indent -= STANDARD_INDENT;

                return null;
            }

            @Override
            public Void visit(ASTNode.NewNode node) {
                printWithIndent("new");

                indent += STANDARD_INDENT;

                visit(node.getType());

                indent -= STANDARD_INDENT;

                return null;
            }

            @Override
            public Void visit(ASTNode.IdNode node) {
                printWithIndent(node.getToken().getText());
                return null;
            }

            @Override
            public Void visit(ASTNode.TypeNode node) {
                printWithIndent(node.getToken().getText());
                return null;
            }

            @Override
            public Void visit(ASTNode.IntNode node) {
                printWithIndent(node.getToken().getText());
                return null;
            }

            @Override
            public Void visit(ASTNode.StringNode node) {
                printWithIndent(node.getToken().getText());
                return null;
            }

            @Override
            public Void visit(ASTNode.BoolNode node) {
                printWithIndent(node.getToken().getText());
                return null;
            }

            private void printWithIndent(String rootAsString) {
                System.out.println(" ".repeat(indent) + rootAsString);
            }
        };

        var astTree = ASTNode.fromParseTree(globalTree);
        astTree.accept(astPrintVisitor);
    }
}
