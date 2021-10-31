package cool.ast;

public interface ASTVisitable {
    <T> T accept(ASTVisitor<T> visitor);
}
