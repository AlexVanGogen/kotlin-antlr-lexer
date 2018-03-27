lexer grammar LLexer;

// Identifiers
ID              : [_]*[a-zA-Z][a-zA-Z0-9_]* ;

// Numbers
NUMBER          : '0'|[1-9][0-9]* ;

// Operators
PLUS            : '+' ;
MINUS           : '-' ;
MULT            : '*' ;
DIV             : '/' ;
MOD             : '%' ;
EQ              : '==' ;
NEQ             : '!=' ;
GT              : '>' ;
GEQ             : '>=' ;
LT              : '<' ;
LEQ             : '<=' ;
AND             : '&&' ;
OR              : '||' ;
ASSIGN          : ':=' ;

// Keywords
WRITE           : 'write' ;
READ            : 'read' ;
WHILE           : 'while' ;
DO              : 'do' ;
IF              : 'if' ;
THEN            : 'then' ;
ELSE            : 'else' ;

// Other symbols
NEWLINE         : '\r\n' | '\r' | '\n' ;
SPACE           : [\t ]+ ;
SEP             : ';' ;
LPAREN          : '(' ;
RPAREN          : ')' ;
LFIG            : '{' ;
RFIG            : '}' ;
