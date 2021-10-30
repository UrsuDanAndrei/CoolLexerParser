package cool.ast;

import org.antlr.v4.runtime.Token;

import java.util.List;

public abstract class ASTNode {
    Token token;

    public ASTNode(Token token) {
        this.token = token;
    }
}

class ProgramNode extends ASTNode {
    private List<CoolClassNode> coolClasses;

    public ProgramNode(Token token, List<CoolClassNode> coolClasses) {
        super(token);

        if (coolClasses.isEmpty()) {
            throw new RuntimeException("A program node must have at least one class!");
        } else {
            this.coolClasses = coolClasses;
        }
    }

    public List<CoolClassNode> getCoolClasses() {
        return coolClasses;
    }

    public void setCoolClasses(List<CoolClassNode> coolClasses) {
        this.coolClasses = coolClasses;
    }
}

class CoolClassNode extends ASTNode {
    private CoolClassNode parentClass;
    private List<FeatureNode> features;

    public CoolClassNode(Token token, List<FeatureNode> features, CoolClassNode parentClass) {
        super(token);
        this.parentClass = parentClass;
        this.features = features;
    }

    public CoolClassNode(Token token, List<FeatureNode> features) {
        this(token,  features, null);
    }

    public CoolClassNode getParentClass() {
        return parentClass;
    }

    public void setParentClass(CoolClassNode parentClass) {
        this.parentClass = parentClass;
    }

    public List<FeatureNode> getFeatures() {
        return features;
    }

    public void setFeatures(List<FeatureNode> features) {
        this.features = features;
    }
}

abstract class FeatureNode extends ASTNode {
    public FeatureNode(Token token) {
        super(token);
    }
}

class AttributeNode extends FeatureNode {
    private Token type;
    private ExprNode value;

    public AttributeNode(Token token, Token type, ExprNode value) {
        super(token);
        this.type = type;
        this.value = value;
    }

    public AttributeNode(Token token, Token type) {
        this(token, type, null);
    }

    public Token getType() {
        return type;
    }

    public void setType(Token type) {
        this.type = type;
    }

    public ExprNode getValue() {
        return value;
    }

    public void setValue(ExprNode value) {
        this.value = value;
    }
}

class MethodNode extends FeatureNode {
    private List<FormalNode> parameters;
    private Token returnType;
    private ExprNode body;

    public MethodNode(Token token, List<FormalNode> parameters, Token returnType, ExprNode body) {
        super(token);
        this.parameters = parameters;
        this.returnType = returnType;
        this.body = body;
    }

    public List<FormalNode> getParameters() {
        return parameters;
    }

    public void setParameters(List<FormalNode> parameters) {
        this.parameters = parameters;
    }

    public Token getReturnType() {
        return returnType;
    }

    public void setReturnType(Token returnType) {
        this.returnType = returnType;
    }

    public ExprNode getBody() {
        return body;
    }

    public void setBody(ExprNode body) {
        this.body = body;
    }
}

class FormalNode extends FeatureNode {
    private Token type;

    public FormalNode(Token token, Token type) {
        super(token);
        this.type = type;
    }

    public Token getType() {
        return type;
    }

    public void setType(Token type) {
        this.type = type;
    }
}

abstract class ExprNode extends ASTNode {
    public ExprNode(Token token) {
        super(token);
    }
}

class IdNode extends ExprNode {
    private ExprNode cond;
    private ExprNode thenBr;
    private ExprNode elseBr;

    public IdNode(Token token, ExprNode cond, ExprNode thenBr, ExprNode elseBr) {
        super(token);
        this.cond = cond;
        this.thenBr = thenBr;
        this.elseBr = elseBr;
    }

    public ExprNode getCond() {
        return cond;
    }

    public void setCond(ExprNode cond) {
        this.cond = cond;
    }

    public ExprNode getThenBr() {
        return thenBr;
    }

    public void setThenBr(ExprNode thenBr) {
        this.thenBr = thenBr;
    }

    public ExprNode getElseBr() {
        return elseBr;
    }

    public void setElseBr(ExprNode elseBr) {
        this.elseBr = elseBr;
    }
}

class WhileNode extends ExprNode {
    private ExprNode cond;
    private ExprNode body;

    public WhileNode(Token token, ExprNode cond, ExprNode body) {
        super(token);
        this.cond = cond;
        this.body = body;
    }

    public ExprNode getCond() {
        return cond;
    }

    public void setCond(ExprNode cond) {
        this.cond = cond;
    }

    public ExprNode getBody() {
        return body;
    }

    public void setBody(ExprNode body) {
        this.body = body;
    }
}

class LetNode extends ExprNode {
    private List<LocalVariableNode> localVars;
    private ExprNode body;

    public LetNode(Token token, List<LocalVariableNode> localVars, ExprNode body) {
        super(token);
        this.localVars = localVars;
        this.body = body;
    }

    public List<LocalVariableNode> getLocalVars() {
        return localVars;
    }

    public void setLocalVars(List<LocalVariableNode> localVars) {
        this.localVars = localVars;
    }

    public ExprNode getBody() {
        return body;
    }

    public void setBody(ExprNode body) {
        this.body = body;
    }
}

class LocalVariableNode extends ASTNode {
    private Token type;
    private ExprNode value;

    public LocalVariableNode(Token token, Token type, ExprNode value) {
        super(token);
        this.type = type;
        this.value = value;
    }

    public Token getType() {
        return type;
    }

    public void setType(Token type) {
        this.type = type;
    }

    public ExprNode getValue() {
        return value;
    }

    public void setValue(ExprNode value) {
        this.value = value;
    }
}

class CaseNode extends ExprNode {
    private ExprNode toEvaluate;
    private List<CaseBranchNode> branches;

    public CaseNode(Token token, ExprNode toEvaluate, List<CaseBranchNode> branches) {
        super(token);
        this.toEvaluate = toEvaluate;
        this.branches = branches;
    }

    public ExprNode getToEvaluate() {
        return toEvaluate;
    }

    public void setToEvaluate(ExprNode toEvaluate) {
        this.toEvaluate = toEvaluate;
    }

    public List<CaseBranchNode> getBranches() {
        return branches;
    }

    public void setBranches(List<CaseBranchNode> branches) {
        this.branches = branches;
    }
}

class CaseBranchNode extends ASTNode {
    private Token type;
    private ExprNode value;

    public CaseBranchNode(Token token, Token type, ExprNode value) {
        super(token);
        this.type = type;
        this.value = value;
    }

    public Token getType() {
        return type;
    }

    public void setType(Token type) {
        this.type = type;
    }

    public ExprNode getValue() {
        return value;
    }

    public void setValue(ExprNode value) {
        this.value = value;
    }
}

class BlockNode extends ExprNode {
    private List<ExprNode> exprs;

    public BlockNode(Token token, List<ExprNode> exprs) {
        super(token);
        this.exprs = exprs;
    }

    public List<ExprNode> getExprs() {
        return exprs;
    }

    public void setExprs(List<ExprNode> exprs) {
        this.exprs = exprs;
    }
}

class DispatchNode extends ExprNode {
    private ExprNode caller;
    private ExprNode classContext;
    private List<ExprNode> args;

    public DispatchNode(Token token, List<ExprNode> args, ExprNode caller, ExprNode classContext) {
        super(token);
        this.caller = caller;
        this.classContext = classContext;
        this.args = args;
    }

    public DispatchNode(Token token, List<ExprNode> args, ExprNode caller) {
        this(token, args, caller, null);
    }

    public DispatchNode(Token token, List<ExprNode> args) {
        this(token, args, null);
    }

    public ExprNode getCaller() {
        return caller;
    }

    public void setCaller(ExprNode caller) {
        this.caller = caller;
    }

    public ExprNode getClassContext() {
        return classContext;
    }

    public void setClassContext(ExprNode classContext) {
        this.classContext = classContext;
    }

    public List<ExprNode> getArgs() {
        return args;
    }

    public void setArgs(List<ExprNode> args) {
        this.args = args;
    }
}

class OperationNode extends ExprNode {
    private ExprNode leftOperand;
    private ExprNode rightOperand;

    public OperationNode(Token token, ExprNode leftOperand, ExprNode rightOperand) {
        super(token);
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public OperationNode(Token token, ExprNode leftOperand) {
        this(token, leftOperand, null);
    }

    public ExprNode getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(ExprNode leftOperand) {
        this.leftOperand = leftOperand;
    }

    public ExprNode getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(ExprNode rightOperand) {
        this.rightOperand = rightOperand;
    }
}
