parser grammar CoolParser;

options {
    tokenVocab = CoolLexer;
}

@header{
    package cool.parser;
}

program : (coolClass SEMI)+ EOF;

coolClass : CLASS id=TYPE (INHERITS parentClass=TYPE)? LBRACE (feature SEMI)* RBRACE;

feature
    : id=ID COLON type=TYPE (ASSIGN value=expr)?                                                                # attribute
    | id=ID LPAREN ( | formal (COMMA formal)*) RPAREN COLON returnType=TYPE LBRACE body=expr RBRACE             # method
    ;

formal : id=ID COLON type=TYPE;

expr
    : IF cond=expr THEN thenBr=expr ELSE elseBr=expr FI                                                         # if
    | WHILE cond=expr LOOP body=expr POOL                                                                       # while
    | LET localVariable (COMMA localVariable)* IN body=expr                                                     # let
    | CASE toEvaluated=expr OF (caseBranch SEMI)+ ESAC                                                          # case

    | LBRACE (expr SEMI)+ RBRACE                                                                                # block

    | caller=expr (AT classContext=TYPE)? DOT id=ID LPAREN ( | args+=expr (COMMA args+=expr)*) RPAREN           # explicitDispatch
    | id=ID LPAREN ( | args+=expr (COMMA args+=expr)*) RPAREN                                                   # implicitDispatch

    | LPAREN expr RPAREN                                                                                        # parens
    | operation=NEG operand=expr                                                                                # neg
    | operation=ISVOID operand=expr                                                                             # isvoid
    | leftOperand=expr operation=(MULT | DIV) rightOperand=expr                                                 # multDiv
    | leftOperand=expr operation=(PLUS | MINUS) rightOperand=expr                                               # plusMinus
    | leftOperand=expr operation=(EQUAL | LT | LE) rightOperand=expr                                            # compare
    | operation=NOT operand=expr                                                                                # not

    | NEW type=TYPE                                                                                             # new
    | ID                                                                                                        # id
    | INT                                                                                                       # int
    | STRING                                                                                                    # string
    | BOOL                                                                                                      # bool
    ;

localVariable : id=ID COLON type=TYPE (ASSIGN value=expr)?;

caseBranch : id=ID COLON type=TYPE CONNECTOR body=expr;
