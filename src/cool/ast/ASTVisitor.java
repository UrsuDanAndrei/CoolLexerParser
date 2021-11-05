package cool.ast;

public interface ASTVisitor<T> {
    T visit(ASTNode.ProgramNode node);
    T visit(ASTNode.CoolClassNode node);
    T visit(ASTNode.AttributeNode node);
    T visit(ASTNode.MethodNode node);
    T visit(ASTNode.FormalNode node);
    T visit(ASTNode.IfNode node);
    T visit(ASTNode.WhileNode node);
    T visit(ASTNode.LetNode node);
    T visit(ASTNode.LocalVariableNode node);
    T visit(ASTNode.CaseNode node);
    T visit(ASTNode.CaseBranchNode node);
    T visit(ASTNode.BlockNode node);
    T visit(ASTNode.DispatchNode node);
    T visit(ASTNode.OperationNode node);
    T visit(ASTNode.NewNode node);
    T visit(ASTNode.IdNode node);
    T visit(ASTNode.TypeNode node);
    T visit(ASTNode.IntNode node);
    T visit(ASTNode.StringNode node);
    T visit(ASTNode.BoolNode node);
}
