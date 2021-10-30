parser grammar CoolParser;

options {
    tokenVocab = CoolLexer;
}

@header{
    package cool.parser;
}

program : (coolClass SEMI)+ EOF;

coolClass : CLASS TYPE (INHERITS TYPE)? LBRACE (feature SEMI)* RBRACE;

feature
    : ID COLON TYPE (ASSIGN expr)?                                                  # attribute
    | ID LPAREN ( | formal (COMMA formal)*) RPAREN COLON TYPE LBRACE expr RBRACE    # method
    ;

formal : ID COLON TYPE;

expr
    : IF cond=expr THEN thenBr=expr ELSE elseBr=expr FI                                         # if
    | WHILE cond=expr LOOP body=expr POOL                                                       # while
    | LET ID COLON TYPE (ASSIGN expr)? (COMMA ID COLON TYPE (ASSIGN expr)?)* IN body=expr       # let
    | CASE toEvaluated=expr OF (ID COLON TYPE CONNECTOR expr SEMI)+ ESAC                        # case

    | LBRACE (expr SEMI)+ RBRACE                                                                # block

    | caller=expr (AT TYPE)? DOT ID LPAREN ( | expr (COMMA expr)*) RPAREN                       # explicitDispatch
    | ID LPAREN ( | expr (COMMA expr)*) RPAREN                                                  # implicitDispatch

    | LPAREN expr RPAREN                                                                        # parens
    | NEG expr                                                                                  # neg
    | ISVOID expr                                                                               # isvoid
    | left=expr (MULT | DIV) right=expr                                                         # multDiv
    | left=expr (PLUS | MINUS) right=expr                                                       # plusMinus
    | left=expr (EQUAL LT LE) right=expr                                                        # compare
    | NOT expr                                                                                  # not

    | NEW TYPE                                                                                  # new
    | ID                                                                                        # id
    | INT                                                                                       # int
    | STRING                                                                                    # string
    | BOOL                                                                                      # bool
    ;
