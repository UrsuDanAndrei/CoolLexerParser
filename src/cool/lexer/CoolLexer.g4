lexer grammar CoolLexer;

tokens { ERROR } 

@header{
    package cool.lexer;
    // TODO you might have to import the string builder here
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
fragment ANY_BUT_STAR_RPAREN
                             : '*' ~')'
                             | ~'*'
                             ;
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
COMMA : ',';
COLON : ':';
SEMI : ';';

// parenthesis
LPAREN : '(';
RPAREN : ')';

// braces
LBRACE : '{';
RBRACE : '}';

// arithmethic operations
TILDE : '~';
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
DOT : '.';
AT : '@';
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


// string
STRING_UNTERMINATED : '"' ('\\\\' | '\\"' | ~'"')*? '\n' {
    raiseError("Unterminated string constant");
};

STRING_WITH_NULL : '"' ('\\\\' | '\\"' | ~["\n])*? '\u0000' .*? '"' {
    raiseError("String contains null character");
};

STRING_WITH_EOF : '"' ('\\\\' | '\\"' | ~["\n])*? EOF {
    raiseError("EOF in string constant");
};

STRING : '"' ('\\\\' | '\\"' | ~["\n])*? '"' {
    String text = getText();
    var newText = new StringBuilder();

    // trim the surrounding ""
    text = text.substring(1, text.length() - 1);

    int i = 0;
    int j = text.indexOf('\\');

    while (j != -1) {
        char notEscapedChar = text.charAt(j + 1);
        char escapedChar = switch (notEscapedChar) {
            case 'n' -> '\n';
            case 'b' -> '\b';
            case 't' -> '\t';
            case 'f' -> '\f';
            default -> notEscapedChar; // case '\\' is treated here
        };

        newText.append(text, i, j);
        newText.append(escapedChar);

        i = j + 2;
        j = text.indexOf('\\', i);
    }

    newText.append(text, i, text.length());

    if (newText.length() <= 1024) {
        setText(newText.toString());
    } else {
        raiseError("String constant too long");
    }
};


// type
TYPE : UPPER_LETTER (UPPER_LETTER | LOWER_LETTER | DIGIT | '_')*;

// identifiers
SELF : 'self';
SELF_TYPE : 'SELF_TYPE';

ID : LOWER_LETTER (UPPER_LETTER | LOWER_LETTER | DIGIT | '_')*;


// comments
LINE_COMMENT : '--' .*? (NEW_LINE | EOF) -> skip;

BLOCK_COMMENT_END_WITHOUT_START : '*)' {
    raiseError("Unmatched *)");
};

BLOCK_COMMENT_WITH_EOF : '(*' (BLOCK_COMMENT | ANY_BUT_STAR_RPAREN)* '*'? EOF {
    raiseError("EOF in comment");
};

BLOCK_COMMENT : '(*' (BLOCK_COMMENT | .)*? '*)' -> skip;

// whitespaces
WS : [ \n\f\r\t]+ -> skip;
