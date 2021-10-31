package cool.ast;

import cool.parser.CoolParser;
import cool.parser.CoolParserBaseVisitor;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

/**
 * All classes that extends ASTNode should add their children to the inherited children list.
 */
public abstract class ASTNode implements ASTVisitable {
    protected final Token token;
    protected final List<ASTNode> children;

    public ASTNode(Token token) {
        this.token = token;
        children = new ArrayList<>();
    }

    public static ASTNode fromParseTree(ParseTree tree) {
        var astNodeBuilderVisitor = new CoolParserBaseVisitor<ASTNode>() {
            @Override
            public ASTNode visitProgram(CoolParser.ProgramContext ctx) {
                List<CoolClassNode> coolClassNodes = new ArrayList<>();
                for (var coolClass : ctx.coolClass()) {
                    coolClassNodes.add((CoolClassNode) visitCoolClass(coolClass));
                }

                return new ProgramNode(ctx.EOF().getSymbol(), coolClassNodes);
            }

            @Override
            public ASTNode visitCoolClass(CoolParser.CoolClassContext ctx) {
                List<FeatureNode> featureNodes = new ArrayList<>();
                for (var feature : ctx.feature()) {
                    featureNodes.add((FeatureNode) visitFeature(feature));
                }

                List<TerminalNode> types = ctx.TYPE();
                Token parentClass = null;

                if (types.size() == 2) {
                    parentClass = types.get(1).getSymbol();
                }

                return new CoolClassNode(ctx.CLASS().getSymbol(), featureNodes, parentClass);
            }

            @Override
            public ASTNode visitAttribute(CoolParser.AttributeContext ctx) {
                return new AttributeNode(
                        ctx.ID().getSymbol(),
                        ctx.TYPE().getSymbol(),
                        (ExprNode) visitExpr(ctx.expr()));
            }

            @Override
            public ASTNode visitMethod(CoolParser.MethodContext ctx) {
                List<FormalNode> parameters = new ArrayList<>();
                for (var formal : ctx.formal()) {
                    parameters.add((FormalNode) visitFormal(formal));
                }

                return new MethodNode(
                        ctx.ID().getSymbol(),
                        parameters,
                        ctx.TYPE().getSymbol(),
                        (ExprNode) visitExpr(ctx.expr()));
            }

            @Override
            public ASTNode visitFormal(CoolParser.FormalContext ctx) {
                return new FormalNode(ctx.ID().getSymbol(), ctx.TYPE().getSymbol());
            }

            @Override
            public ASTNode visitNew(CoolParser.NewContext ctx) {
                return new New;
            }

            @Override
            public ASTNode visitParens(CoolParser.ParensContext ctx) {
                return super.visitParens(ctx);
            }

            @Override
            public ASTNode visitPlusMinus(CoolParser.PlusMinusContext ctx) {
                return super.visitPlusMinus(ctx);
            }

            @Override
            public ASTNode visitCompare(CoolParser.CompareContext ctx) {
                return super.visitCompare(ctx);
            }

            @Override
            public ASTNode visitString(CoolParser.StringContext ctx) {
                return super.visitString(ctx);
            }

            @Override
            public ASTNode visitBool(CoolParser.BoolContext ctx) {
                return super.visitBool(ctx);
            }

            @Override
            public ASTNode visitIsvoid(CoolParser.IsvoidContext ctx) {
                return super.visitIsvoid(ctx);
            }

            @Override
            public ASTNode visitWhile(CoolParser.WhileContext ctx) {
                return super.visitWhile(ctx);
            }

            @Override
            public ASTNode visitImplicitDispatch(CoolParser.ImplicitDispatchContext ctx) {
                return super.visitImplicitDispatch(ctx);
            }

            @Override
            public ASTNode visitInt(CoolParser.IntContext ctx) {
                return super.visitInt(ctx);
            }

            @Override
            public ASTNode visitNeg(CoolParser.NegContext ctx) {
                return super.visitNeg(ctx);
            }

            @Override
            public ASTNode visitNot(CoolParser.NotContext ctx) {
                return super.visitNot(ctx);
            }

            @Override
            public ASTNode visitMultDiv(CoolParser.MultDivContext ctx) {
                return super.visitMultDiv(ctx);
            }

            @Override
            public ASTNode visitExplicitDispatch(CoolParser.ExplicitDispatchContext ctx) {
                return super.visitExplicitDispatch(ctx);
            }

            @Override
            public ASTNode visitLet(CoolParser.LetContext ctx) {
                return super.visitLet(ctx);
            }

            @Override
            public ASTNode visitBlock(CoolParser.BlockContext ctx) {
                return super.visitBlock(ctx);
            }

            @Override
            public ASTNode visitId(CoolParser.IdContext ctx) {
                return super.visitId(ctx);
            }

            @Override
            public ASTNode visitIf(CoolParser.IfContext ctx) {
                return super.visitIf(ctx);
            }

            @Override
            public ASTNode visitCase(CoolParser.CaseContext ctx) {
                return super.visitCase(ctx);
            }

            private ASTNode visitFeature(CoolParser.FeatureContext ctx) {
                if (ctx == null) {
                    return null;
                } else  if (ctx instanceof CoolParser.AttributeContext) {
                    return visitAttribute((CoolParser.AttributeContext) ctx);
                } else { // if (ctx instanceof CoolParser.MethodContext)
                    return visitMethod((CoolParser.MethodContext) ctx);
                }
            }

            private ASTNode visitExpr(CoolParser.ExprContext ctx) {
                if (ctx == null) {
                    return null;
                } else if (ctx instanceof CoolParser.NewContext) {
                    return visitNew((CoolParser.NewContext) ctx);
                } else if (ctx instanceof CoolParser.ParensContext) {
                    return visitParens((CoolParser.ParensContext) ctx);
                } else if (ctx instanceof CoolParser.PlusMinusContext) {
                    return visitPlusMinus((CoolParser.PlusMinusContext) ctx);
                } else if (ctx instanceof CoolParser.CompareContext) {
                    return visitCompare((CoolParser.CompareContext) ctx);
                } else if (ctx instanceof CoolParser.StringContext) {
                    return visitString((CoolParser.StringContext) ctx);
                } else if (ctx instanceof CoolParser.BoolContext) {
                    return visitBool((CoolParser.BoolContext) ctx);
                } else if (ctx instanceof CoolParser.IsvoidContext) {
                    return visitIsvoid((CoolParser.IsvoidContext) ctx);
                } else if (ctx instanceof CoolParser.WhileContext) {
                    return visitWhile((CoolParser.WhileContext) ctx);
                } else if (ctx instanceof CoolParser.ImplicitDispatchContext) {
                    return visitImplicitDispatch((CoolParser.ImplicitDispatchContext) ctx);
                } else if (ctx instanceof CoolParser.IntContext) {
                    return visitInt((CoolParser.IntContext) ctx);
                } else if (ctx instanceof CoolParser.NegContext) {
                    return visitNeg((CoolParser.NegContext) ctx);
                } else { // if (ctx instanceof CoolParser.NotContext)
                    return visitNot((CoolParser.NotContext) ctx);
                }
            }
        };

        return null;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public final Token getToken() {
        return token;
    }

    public final List<ASTNode> getChildren() {
        return children;
    }
}

class ProgramNode extends ASTNode {
    private final List<CoolClassNode> coolClasses;

    public ProgramNode(Token token, List<CoolClassNode> coolClasses) {
        super(token);
        this.coolClasses = coolClasses;

        children.addAll(coolClasses);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public List<CoolClassNode> getCoolClasses() {
        return coolClasses;
    }
}

class CoolClassNode extends ASTNode {
    private final Token parentClass;
    private final List<FeatureNode> features;

    public CoolClassNode(Token token, List<FeatureNode> features, Token parentClass) {
        super(token);
        this.parentClass = parentClass;
        this.features = features;

        children.addAll(features);
    }

    public CoolClassNode(Token token, List<FeatureNode> features) {
        this(token,  features, null);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Token getParentClass() {
        return parentClass;
    }

    public List<FeatureNode> getFeatures() {
        return features;
    }
}

abstract class FeatureNode extends ASTNode {
    public FeatureNode(Token token) {
        super(token);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class AttributeNode extends FeatureNode {
    private final Token type;
    private final ExprNode value;

    public AttributeNode(Token token, Token type, ExprNode value) {
        super(token);
        this.type = type;
        this.value = value;

        children.add(value);
    }

    public AttributeNode(Token token, Token type) {
        this(token, type, null);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Token getType() {
        return type;
    }

    public ExprNode getValue() {
        return value;
    }
}

class MethodNode extends FeatureNode {
    private final List<FormalNode> parameters;
    private final Token returnType;
    private final ExprNode body;

    public MethodNode(Token token, List<FormalNode> parameters, Token returnType, ExprNode body) {
        super(token);
        this.parameters = parameters;
        this.returnType = returnType;
        this.body = body;

        children.addAll(parameters);
        children.add(body);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public List<FormalNode> getParameters() {
        return parameters;
    }

    public Token getReturnType() {
        return returnType;
    }

    public ExprNode getBody() {
        return body;
    }
}

class FormalNode extends ASTNode {
    private final Token type;

    public FormalNode(Token token, Token type) {
        super(token);
        this.type = type;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Token getType() {
        return type;
    }
}

abstract class ExprNode extends ASTNode {
    public ExprNode(Token token) {
        super(token);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class IfNode extends ExprNode {
    private final ExprNode cond;
    private final ExprNode thenBr;
    private final ExprNode elseBr;

    public IfNode(Token token, ExprNode cond, ExprNode thenBr, ExprNode elseBr) {
        super(token);
        this.cond = cond;
        this.thenBr = thenBr;
        this.elseBr = elseBr;

        children.add(cond);
        children.add(thenBr);
        children.add(elseBr);
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

class WhileNode extends ExprNode {
    private final ExprNode cond;
    private final ExprNode body;

    public WhileNode(Token token, ExprNode cond, ExprNode body) {
        super(token);
        this.cond = cond;
        this.body = body;

        children.add(cond);
        children.add(body);
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

class LetNode extends ExprNode {
    private final List<LocalVariableNode> localVars;
    private final ExprNode body;

    public LetNode(Token token, List<LocalVariableNode> localVars, ExprNode body) {
        super(token);
        this.localVars = localVars;
        this.body = body;

        children.addAll(localVars);
        children.add(body);
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

class LocalVariableNode extends ASTNode {
    private final Token type;
    private final ExprNode value;

    public LocalVariableNode(Token token, Token type, ExprNode value) {
        super(token);
        this.type = type;
        this.value = value;

        children.add(value);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Token getType() {
        return type;
    }

    public ExprNode getValue() {
        return value;
    }
}

class CaseNode extends ExprNode {
    private final ExprNode toEvaluate;
    private final List<CaseBranchNode> branches;

    public CaseNode(Token token, ExprNode toEvaluate, List<CaseBranchNode> branches) {
        super(token);
        this.toEvaluate = toEvaluate;
        this.branches = branches;

        children.add(toEvaluate);
        children.addAll(branches);
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

class CaseBranchNode extends ASTNode {
    private final Token type;
    private final ExprNode body;

    public CaseBranchNode(Token token, Token type, ExprNode body) {
        super(token);
        this.type = type;
        this.body = body;

        children.add(body);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Token getType() {
        return type;
    }

    public ExprNode get() {
        return body;
    }
}

class BlockNode extends ExprNode {
    private final List<ExprNode> exprs;

    public BlockNode(Token token, List<ExprNode> exprs) {
        super(token);
        this.exprs = exprs;

        children.addAll(exprs);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public List<ExprNode> getExprs() {
        return exprs;
    }
}

class DispatchNode extends ExprNode {
    private final ExprNode caller;
    private final Token classContext;
    private final List<ExprNode> args;

    public DispatchNode(Token token, List<ExprNode> args, ExprNode caller, Token classContext) {
        super(token);
        this.caller = caller;
        this.classContext = classContext;
        this.args = args;

        children.add(caller);
        children.addAll(args);
    }

    public DispatchNode(Token token, List<ExprNode> args, ExprNode caller) {
        this(token, args, caller, null);
    }

    public DispatchNode(Token token, List<ExprNode> args) {
        this(token, args, null);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ExprNode getCaller() {
        return caller;
    }

    public Token getClassContext() {
        return classContext;
    }

    public List<ExprNode> getArgs() {
        return args;
    }
}

class OperationNode extends ExprNode {
    private final ExprNode leftOperand;
    private final ExprNode rightOperand;

    public OperationNode(Token token, ExprNode leftOperand, ExprNode rightOperand) {
        super(token);
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;

        children.add(leftOperand);
        children.add(rightOperand);
    }

    public OperationNode(Token token, ExprNode leftOperand) {
        this(token, leftOperand, null);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ExprNode getLeftOperand() {
        return leftOperand;
    }

    public ExprNode getRightOperand() {
        return rightOperand;
    }
}

class IdNode extends ExprNode {
    public IdNode(Token token) {
        super(token);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class ConstantNode extends ExprNode {
    public ConstantNode(Token token) {
        super(token);
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
