package cool.ast;

import cool.parser.CoolParser;
import cool.parser.CoolParserBaseVisitor;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.LinkedList;
import java.util.List;

public abstract class ASTNode implements ASTVisitable {

    protected final Token token;

    public static abstract class DefinitionNode extends ASTNode {
        DefinitionNode(Token token) {
            super(token);
        }
    }

    public static abstract class ExprNode extends ASTNode {
        public ExprNode(Token token) {
            super(token);
        }
    }

    public static class ProgramNode extends DefinitionNode {

        private final IdNode id;
        private final List<CoolClassNode> coolClasses;

        public ProgramNode(Token token, IdNode id, List<CoolClassNode> coolClasses) {
            super(token);
            this.id = id;
            this.coolClasses = coolClasses;

        }

        @Override
        public <T> T accept(ASTVisitor<T> visitor) {
            return visitor.visit(this);
        }

        public IdNode getId() {
            return id;
        }
        public List<CoolClassNode> getCoolClasses() {
            return coolClasses;
        }
    }

    public static class CoolClassNode extends DefinitionNode {

        private final IdNode id;
        private final TypeNode parentClass;
        private final List<FeatureNode> features;

        public CoolClassNode(Token token, IdNode id, TypeNode parentClass, List<FeatureNode> features) {
            super(token);
            this.id = id;
            this.parentClass = parentClass;
            this.features = features;
        }

        public CoolClassNode(Token token, IdNode id, List<FeatureNode> features) {
            this(token, id, null, features);
        }

        @Override
        public <T> T accept(ASTVisitor<T> visitor) {
            return visitor.visit(this);
        }

        public IdNode getId() {
            return id;
        }
        public TypeNode getParentClass() {
            return parentClass;
        }
        public List<FeatureNode> getFeatures() {
            return features;
        }
    }

    public static abstract class FeatureNode extends DefinitionNode {
        public FeatureNode(Token token) {
            super(token);
        }
    }

    public static class AttributeNode extends FeatureNode {

        private final IdNode id;
        private final TypeNode type;
        private final ExprNode value;

        public AttributeNode(Token token, IdNode id, TypeNode type, ExprNode value) {
            super(token);
            this.id = id;
            this.type = type;
            this.value = value;
        }

        public AttributeNode(Token token, IdNode id, TypeNode type) {
            this(token, id, type, null);
        }

        @Override
        public <T> T accept(ASTVisitor<T> visitor) {
            return visitor.visit(this);
        }

        public IdNode getId() {
            return id;
        }
        public TypeNode getType() {
            return type;
        }
        public ExprNode getValue() {
            return value;
        }
    }

    public static class MethodNode extends FeatureNode {

        private final IdNode id;
        private final List<FormalNode> parameters;
        private final TypeNode returnType;
        private final ExprNode body;

        public MethodNode(Token token, IdNode id, List<FormalNode> parameters, TypeNode returnType, ExprNode body) {
            super(token);
            this.id = id;
            this.parameters = parameters;
            this.returnType = returnType;
            this.body = body;
        }

        @Override
        public <T> T accept(ASTVisitor<T> visitor) {
            return visitor.visit(this);
        }

        public IdNode getId() {
            return id;
        }
        public List<FormalNode> getParameters() {
            return parameters;
        }
        public TypeNode getReturnType() {
            return returnType;
        }
        public ExprNode getBody() {
            return body;
        }
    }

    public static class FormalNode extends DefinitionNode {

        private final IdNode id;
        private final TypeNode type;

        public FormalNode(Token token, IdNode id, TypeNode type) {
            super(token);
            this.id = id;
            this.type = type;
        }

        @Override
        public <T> T accept(ASTVisitor<T> visitor) {
            return visitor.visit(this);
        }

        public IdNode getId() {
            return id;
        }
        public TypeNode getType() {
            return type;
        }
    }

    public static class IfNode extends ExprNode {

        private final ExprNode cond;
        private final ExprNode thenBr;
        private final ExprNode elseBr;

        public IfNode(Token token, ExprNode cond, ExprNode thenBr, ExprNode elseBr) {
            super(token);
            this.cond = cond;
            this.thenBr = thenBr;
            this.elseBr = elseBr;
        }

        @Override
        public <T> T accept(ASTVisitor<T> visitor) {
            return visitor.visit(this);
        }

        public ExprNode getCond() {
            return cond;
        }
        public ExprNode getThenBr() {
            return thenBr;
        }
        public ExprNode getElseBr() {
            return elseBr;
        }
    }

    public static class WhileNode extends ExprNode {

        private final ExprNode cond;
        private final ExprNode body;

        public WhileNode(Token token, ExprNode cond, ExprNode body) {
            super(token);
            this.cond = cond;
            this.body = body;
        }

        @Override
        public <T> T accept(ASTVisitor<T> visitor) {
            return visitor.visit(this);
        }

        public ExprNode getCond() {
            return cond;
        }
        public ExprNode getBody() {
            return body;
        }
    }

    public static class LetNode extends ExprNode {

        private final List<LocalVariableNode> localVars;
        private final ExprNode body;

        public LetNode(Token token, List<LocalVariableNode> localVars, ExprNode body) {
            super(token);
            this.localVars = localVars;
            this.body = body;
        }

        @Override
        public <T> T accept(ASTVisitor<T> visitor) {
            return visitor.visit(this);
        }

        public List<LocalVariableNode> getLocalVars() {
            return localVars;
        }

        public ExprNode getBody() {
            return body;
        }
    }

    public static class LocalVariableNode extends DefinitionNode {

        private final IdNode id;
        private final TypeNode type;
        private final ExprNode value;

        public LocalVariableNode(Token token, IdNode id, TypeNode type, ExprNode value) {
            super(token);
            this.id = id;
            this.type = type;
            this.value = value;
        }

        @Override
        public <T> T accept(ASTVisitor<T> visitor) {
            return visitor.visit(this);
        }

        public IdNode getId() {
            return id;
        }
        public TypeNode getType() {
            return type;
        }
        public ExprNode getValue() {
            return value;
        }
    }

    public static class CaseNode extends ExprNode {

        private final ExprNode toEvaluate;
        private final List<CaseBranchNode> branches;

        public CaseNode(Token token, ExprNode toEvaluate, List<CaseBranchNode> branches) {
            super(token);
            this.toEvaluate = toEvaluate;
            this.branches = branches;
        }

        @Override
        public <T> T accept(ASTVisitor<T> visitor) {
            return visitor.visit(this);
        }

        public ExprNode getToEvaluate() {
            return toEvaluate;
        }
        public List<CaseBranchNode> getBranches() {
            return branches;
        }
    }

    public static class CaseBranchNode extends ExprNode {

        private final IdNode id;
        private final TypeNode type;
        private final ExprNode body;

        public CaseBranchNode(Token token, IdNode id, TypeNode type, ExprNode body) {
            super(token);
            this.id = id;
            this.type = type;
            this.body = body;
        }

        @Override
        public <T> T accept(ASTVisitor<T> visitor) {
            return visitor.visit(this);
        }

        public IdNode getId() {
            return id;
        }
        public TypeNode getType() {
            return type;
        }
        public ExprNode getBody() {
            return body;
        }
    }

    public static class BlockNode extends ExprNode {

        private final List<ExprNode> exprs;

        public BlockNode(Token token, List<ExprNode> exprs) {
            super(token);
            this.exprs = exprs;
        }

        @Override
        public <T> T accept(ASTVisitor<T> visitor) {
            return visitor.visit(this);
        }

        public List<ExprNode> getExprs() {
            return exprs;
        }
    }

    public static class DispatchNode extends ExprNode {

        private final IdNode id;
        private final ExprNode callerObject;
        private final TypeNode classContext;
        private final List<ExprNode> args;
        private final boolean implicit;

        public DispatchNode(Token token, IdNode id, ExprNode callerObject, TypeNode classContext, List<ExprNode> args) {
            super(token);
            this.id = id;
            this.callerObject = callerObject;
            this.classContext = classContext;
            this.args = args;
            this.implicit = callerObject == null;
        }

        public DispatchNode(Token token, IdNode id, ExprNode callerObject, List<ExprNode> args) {
            this(token, id, callerObject, null, args);
        }

        public DispatchNode(Token token, IdNode id, List<ExprNode> args) {
            this(token, id, null, args);
        }

        @Override
        public <T> T accept(ASTVisitor<T> visitor) {
            return visitor.visit(this);
        }

        public IdNode getId() {
            return id;
        }
        public ExprNode getCallerObject() {
            return callerObject;
        }
        public TypeNode getClassContext() {
            return classContext;
        }
        public List<ExprNode> getArgs() {
            return args;
        }
        public boolean isImplicit() {
            return implicit;
        }
    }

    public static class OperationNode extends ExprNode {

        private final IdNode operation;
        private final ExprNode leftOperand;
        private final ExprNode rightOperand;

        public OperationNode(Token token, IdNode operation, ExprNode leftOperand, ExprNode rightOperand) {
            super(token);
            this.operation = operation;
            this.leftOperand = leftOperand;
            this.rightOperand = rightOperand;
        }


        public OperationNode(Token token, IdNode operation, ExprNode leftOperand) {
            this(token, operation, leftOperand, null);
        }

        @Override
        public <T> T accept(ASTVisitor<T> visitor) {
            return visitor.visit(this);
        }

        public IdNode getOperation() {
            return operation;
        }
        public ExprNode getLeftOperand() {
            return leftOperand;
        }
        public ExprNode getRightOperand() {
            return rightOperand;
        }
    }

    public static class NewNode extends ExprNode {
        private final TypeNode type;

        public NewNode(Token token, TypeNode type) {
            super(token);
            this.type = type;
        }

        @Override
        public <T> T accept(ASTVisitor<T> visitor) {
            return visitor.visit(this);
        }

        public TypeNode getType() {
            return type;
        }
    }

    public static class IdNode extends ExprNode {
        public IdNode(Token token) {
            super(token);
        }

        @Override
        public <T> T accept(ASTVisitor<T> visitor) {
            return visitor.visit(this);
        }
    }

    public static class TypeNode extends ExprNode {
        public TypeNode(Token token) {
            super(token);
        }

        @Override
        public <T> T accept(ASTVisitor<T> visitor) {
            return visitor.visit(this);
        }
    }

    public static abstract class ConstantNode extends ExprNode {
        public ConstantNode(Token token) {
            super(token);
        }
    }

    public static class IntNode extends ConstantNode {
        public IntNode(Token token) {
            super(token);
        }

        @Override
        public <T> T accept(ASTVisitor<T> visitor) {
            return visitor.visit(this);
        }
    }

    public static class StringNode extends ConstantNode {
        public StringNode(Token token) {
            super(token);
        }

        @Override
        public <T> T accept(ASTVisitor<T> visitor) {
            return visitor.visit(this);
        }
    }

    public static class BoolNode extends ConstantNode {
        public BoolNode(Token token) {
            super(token);
        }

        @Override
        public <T> T accept(ASTVisitor<T> visitor) {
            return visitor.visit(this);
        }
    }

    public ASTNode(Token token) {
        this.token = token;
    }

    public static ASTNode fromParseTree(ParseTree tree) {
        var astNodeBuilderVisitor = new CoolParserBaseVisitor<ASTNode>() {
            @Override
            public ASTNode visitProgram(CoolParser.ProgramContext ctx) {
                var firstClassId = ctx.coolClass(0).id;
                List<CoolClassNode> coolClassNodes = new LinkedList<>();

                for (var coolClass : ctx.coolClass()) {
                    coolClassNodes.add((CoolClassNode) visitCoolClass(coolClass));
                }

                return new ProgramNode(
                        firstClassId,
                        new IdNode(firstClassId),
                        coolClassNodes);
            }

            @Override
            public ASTNode visitCoolClass(CoolParser.CoolClassContext ctx) {
                // TODO check what happens if there are no features
                List<FeatureNode> featureNodes = new LinkedList<>();
                for (var feature : ctx.feature()) {
                    featureNodes.add((FeatureNode) feature.accept(this));
                }

                return new CoolClassNode(
                        ctx.CLASS().getSymbol(),
                        new IdNode(ctx.id),
                        ctx.parentClass == null ? null : new TypeNode(ctx.parentClass),
                        featureNodes);
            }

            @Override
            public ASTNode visitAttribute(CoolParser.AttributeContext ctx) {
                return new AttributeNode(
                        ctx.id,
                        new IdNode(ctx.id),
                        new TypeNode(ctx.type),
                        ctx.value == null ? null : (ExprNode) ctx.value.accept(this));
            }

            @Override
            public ASTNode visitMethod(CoolParser.MethodContext ctx) {
                // TODO check what happens if there are no formal params
                List<FormalNode> parameters = new LinkedList<>();
                for (var formal : ctx.formal()) {
                    parameters.add((FormalNode) visitFormal(formal));
                }

                return new MethodNode(
                        ctx.id,
                        new IdNode(ctx.id),
                        parameters,
                        new TypeNode(ctx.returnType),
                        (ExprNode) ctx.expr().accept(this));
            }

            @Override
            public ASTNode visitFormal(CoolParser.FormalContext ctx) {
                return new FormalNode(
                        ctx.id,
                        new IdNode(ctx.id),
                        new TypeNode(ctx.type));
            }

            @Override
            public ASTNode visitNew(CoolParser.NewContext ctx) {
                return new NewNode(
                        ctx.NEW().getSymbol(),
                        new TypeNode(ctx.type));
            }

            @Override
            public ASTNode visitParens(CoolParser.ParensContext ctx) {
                return ctx.expr().accept(this);
            }

            @Override
            public ASTNode visitPlusMinus(CoolParser.PlusMinusContext ctx) {
                return new OperationNode(
                        ctx.operation,
                        new IdNode(ctx.operation),
                        (ExprNode) ctx.leftOperand.accept(this),
                        (ExprNode) ctx.rightOperand.accept(this));
            }

            @Override
            public ASTNode visitCompare(CoolParser.CompareContext ctx) {
                return new OperationNode(
                        ctx.operation,
                        new IdNode(ctx.operation),
                        (ExprNode) ctx.leftOperand.accept(this),
                        (ExprNode) ctx.rightOperand.accept(this));
            }

            @Override
            public ASTNode visitString(CoolParser.StringContext ctx) {
                return new StringNode(ctx.STRING().getSymbol());
            }

            @Override
            public ASTNode visitBool(CoolParser.BoolContext ctx) {
                return new BoolNode(ctx.BOOL().getSymbol());
            }

            @Override
            public ASTNode visitIsvoid(CoolParser.IsvoidContext ctx) {
                return new OperationNode(
                        ctx.operation,
                        new IdNode(ctx.operation),
                        (ExprNode) ctx.operand.accept(this));
            }

            @Override
            public ASTNode visitWhile(CoolParser.WhileContext ctx) {
                return new WhileNode(
                        ctx.WHILE().getSymbol(),
                        (ExprNode) ctx.cond.accept(this),
                        (ExprNode) ctx.body.accept(this));
            }

            @Override
            public ASTNode visitImplicitDispatch(CoolParser.ImplicitDispatchContext ctx) {
                // TODO check what happens if there a re no args
                List<ExprNode> argNodes = new LinkedList<>();
                for (var arg : ctx.args) {
                    argNodes.add((ExprNode) arg.accept(this));
                }

                return new DispatchNode(
                        ctx.id,
                        new IdNode(ctx.id),
                        argNodes);
            }

            @Override
            public ASTNode visitInt(CoolParser.IntContext ctx) {
                return new IntNode(ctx.INT().getSymbol());
            }

            @Override
            public ASTNode visitNeg(CoolParser.NegContext ctx) {
                return new OperationNode(
                        ctx.operation,
                        new IdNode(ctx.operation),
                        (ExprNode) ctx.operand.accept(this));
            }

            @Override
            public ASTNode visitNot(CoolParser.NotContext ctx) {
                return new OperationNode(
                        ctx.operation,
                        new IdNode(ctx.operation),
                        (ExprNode) ctx.operand.accept(this));
            }

            @Override
            public ASTNode visitAssign(CoolParser.AssignContext ctx) {
                return new OperationNode(
                        ctx.operation,
                        new IdNode(ctx.operation),
                        new IdNode(ctx.leftOperand),
                        (ExprNode) ctx.rightOperand.accept(this));
            }

            @Override
            public ASTNode visitMultDiv(CoolParser.MultDivContext ctx) {
                return new OperationNode(
                        ctx.operation,
                        new IdNode(ctx.operation),
                        (ExprNode) ctx.leftOperand.accept(this),
                        (ExprNode) ctx.rightOperand.accept(this));
            }

            @Override
            public ASTNode visitExplicitDispatch(CoolParser.ExplicitDispatchContext ctx) {
                // TODO check what happens if the args are null
                List<ExprNode> argNodes = new LinkedList<>();
                for (var arg : ctx.args) {
                    argNodes.add((ExprNode) arg.accept(this));
                }

                return new DispatchNode(
                        ctx.id,
                        new IdNode(ctx.id),
                        (ExprNode) ctx.caller.accept(this),
                        ctx.classContext == null ? null : new TypeNode(ctx.classContext),
                        argNodes);
            }

            @Override
            public ASTNode visitLet(CoolParser.LetContext ctx) {
                List<LocalVariableNode> localVariableNodes = new LinkedList<>();
                for (var localVariable : ctx.localVariable()) {
                    localVariableNodes.add((LocalVariableNode) visitLocalVariable(localVariable));
                }

                return new LetNode(
                        ctx.LET().getSymbol(),
                        localVariableNodes,
                        (ExprNode) ctx.body.accept(this));
            }

            @Override
            public ASTNode visitBlock(CoolParser.BlockContext ctx) {
                List<ExprNode> exprNodes = new LinkedList<>();
                for (var expr : ctx.expr()) {
                    exprNodes.add((ExprNode) expr.accept(this));
                }

                return new BlockNode(
                        ctx.LBRACE().getSymbol(),
                        exprNodes);
            }

            @Override
            public ASTNode visitId(CoolParser.IdContext ctx) {
                return new IdNode(ctx.ID().getSymbol());
            }

            @Override
            public ASTNode visitIf(CoolParser.IfContext ctx) {
                return new IfNode(
                        ctx.IF().getSymbol(),
                        (ExprNode) ctx.cond.accept(this),
                        (ExprNode) ctx.thenBr.accept(this),
                        (ExprNode) ctx.elseBr.accept(this));
            }

            @Override
            public ASTNode visitCase(CoolParser.CaseContext ctx) {
                List<CaseBranchNode> caseBranchNodes = new LinkedList<>();
                for (var caseBranch : ctx.caseBranch()) {
                    caseBranchNodes.add((CaseBranchNode) visitCaseBranch(caseBranch));
                }

                return new CaseNode(
                        ctx.CASE().getSymbol(),
                        (ExprNode) ctx.toEvaluated.accept(this),
                        caseBranchNodes);
            }

            @Override
            public ASTNode visitLocalVariable(CoolParser.LocalVariableContext ctx) {
                return new LocalVariableNode(
                        ctx.id,
                        new IdNode(ctx.id),
                        new TypeNode(ctx.type),
                        ctx.value == null ? null : (ExprNode) ctx.value.accept(this));
            }

            @Override
            public ASTNode visitCaseBranch(CoolParser.CaseBranchContext ctx) {
                return new CaseBranchNode(
                        ctx.id,
                        new IdNode(ctx.id),
                        new TypeNode(ctx.type),
                        (ExprNode) ctx.body.accept(this));
            }
        };

        return tree.accept(astNodeBuilderVisitor);
    }

    public final Token getToken() {
        return token;
    }
}
