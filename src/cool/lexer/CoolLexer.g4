lexer grammar CoolLexer;

tokens { ERROR } 

@header{
    package cool.lexer;
}

@members{    
    private void raiseError(String msg) {
        setText(msg);
        setType(ERROR);
    }
}

// helper fragments
fragment DIGIT : [0-9];
fragment UPPER_LETTER : [A-Z];
fragment LOWER_LETTER : [a-z];
fragment DIGITS : DIGIT+;
fragment NEW_LINE : '\r'? '\n';

fragment A : 'a' | 'A';
fragment C : 'c' | 'C';
fragment D : 'd' | 'D';
fragment E : 'e' | 'E';
fragment F : 'f' | 'F';
fragment H : 'h' | 'H';
fragment I : 'i' | 'I';
fragment L : 'l' | 'L';
fragment N : 'n' | 'N';
fragment O : 'o' | 'O';
fragment P : 'p' | 'P';
fragment R : 'r' | 'R';
fragment S : 's' | 'S';
fragment T : 't' | 'T';
fragment U : 'u' | 'U';
fragment V : 'v' | 'V';
fragment W : 'w' | 'W';
fragment Y : 'y' | 'Y';


// separators
SEMI : ';';
COMMA : ',';

// parenthesis
LPAREN : '(';
RPAREN : ')';

// braces
LBRACE : '{';
RBRACE : '}';

// arithmethic operations
TILDE: '~';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';

// logical operations
EQUAL : '==';
NOT: 'not';
LT : '<';
LE : '<=';
ISVOID : I S V O I D;

// miscellaneous operators
DOT: '.';
AT: '@';
ASSIGN : '<-';


// if expression keywords
IF : I F;
THEN : T H E N;
ELSE : E L S E;
FI : F I;

// while expression keywords
WHILE : W H I L E;
LOOP : L O O P;
POOL : P O O L;

// case expression keywords
CASE : C A S E;
OF : O F;
CONNECTOR : '=>';
ESAC : E S A C;

// let expression keywords
LET : L E T;
IN : I N;

// OOP keywords
CLASS : C L A S S;
INHERITS : I N H E R I T S;
NEW : N E W;


// constants
INT : DIGIT+;
BOOL : ('t' R U E) | ('f' A L S E);

// TODO parse the string as they want you to
STRING : '"' ('\\"' | .)*? '"' {

};


// type
TYPE : UPPER_LETTER (UPPER_LETTER | LOWER_LETTER | DIGIT | '_')*;

// identifiers
SELF: 'self';
SELF_TYPE: 'SELF_TYPE';

ID : LOWER_LETTER (UPPER_LETTER | LOWER_LETTER | DIGIT | '_')*;


// comments
LINE_COMMENT : '--' .*? (NEW_LINE | EOF) -> skip;
BLOCK_COMMENT : '(*' (BLOCK_COMMENT | .)*? '*)' -> skip;

// whitespaces
WS : [ \n\f\r\t]+ -> skip;
