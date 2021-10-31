package cool.ast;

import java.util.List;

/**
 * The default behaviour of all visit methods can be implemented by overriding the visitChildren method.
 *
 * @param <T> the return type of the visit methods
 */
public class ASTBaseVisitor<T> implements ASTVisitor<T> {
    @Override
    public T visit(ASTNode node) {
        return visitChildren(node);
    }

    @Override
    public T visit(ProgramNode node) {
        return visitChildren(node);
    }

    @Override
    public T visit(CoolClassNode node) {
        return visitChildren(node);
    }

    @Override
    public T visit(FeatureNode node) {
        return visitChildren(node);
    }

    @Override
    public T visit(AttributeNode node) {
        return visitChildren(node);
    }

    @Override
    public T visit(MethodNode node) {
        return visitChildren(node);
    }

    @Override
    public T visit(FormalNode node) {
        return visitChildren(node);
    }

    @Override
    public T visit(ExprNode node) {
        return visitChildren(node);
    }

    @Override
    public T visit(IfNode node) {
        return visitChildren(node);
    }

    @Override
    public T visit(WhileNode node) {
        return visitChildren(node);
    }

    @Override
    public T visit(LetNode node) {
        return visitChildren(node);
    }

    @Override
    public T visit(LocalVariableNode node) {
        return visitChildren(node);
    }

    @Override
    public T visit(CaseNode node) {
        return visitChildren(node);
    }

    @Override
    public T visit(CaseBranchNode node) {
        return visitChildren(node);
    }

    @Override
    public T visit(BlockNode node) {
        return visitChildren(node);
    }

    @Override
    public T visit(DispatchNode node) {
        return visitChildren(node);
    }

    @Override
    public T visit(OperationNode node) {
        return visitChildren(node);
    }

    @Override
    public T visit(IdNode node) {
        return visitChildren(node);
    }

    @Override
    public T visit(ConstantNode node) {
        return visitChildren(node);
    }

    public T visitChildren(ASTNode node) {
        return null;
    };
}
