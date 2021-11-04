package cool.ast;

public interface ASTVisitor<T> {
    T visit(ProgramNode node);
    T visit(CoolClassNode node);
    T visit(FeatureNode node);
    T visit(AttributeNode node);
    T visit(MethodNode node);
    T visit(FormalNode node);
    T visit(IfNode node);
    T visit(WhileNode node);
    T visit(LetNode node);
    T visit(LocalVariableNode node);
    T visit(CaseNode node);
    T visit(CaseBranchNode node);
    T visit(BlockNode node);
    T visit(DispatchNode node);
    T visit(OperationNode node);
    T visit(NewNode node);
    T visit(IdNode node);
    T visit(TypeNode node);
    T visit(ConstantNode node);
    T visit(IntNode node);
    T visit(StringNode node);
    T visit(BoolNode node);
}
