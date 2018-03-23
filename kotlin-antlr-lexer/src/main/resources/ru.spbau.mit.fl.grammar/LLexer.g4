lexer grammar LLexer;

// Identifiers
ID              : '[_]*[a-zA-Z][a-zA-Z0-9_]*';

// Numbers
NUMBER          : '0|[1-9][0-9]*';

// Operators
PLUS            : '+';
MINUS           : '-';
MULT            : '*';
DIV             : '/';
MOD             : '%';
EQ              : '==';
NEQ             : '!=';
GT              : '>';
GEQ             : '>=';
LT              : '<';
LEQ             : '<=';
AND             : '&&';
OR              : '||';
ASSIGN          : ':=';

// Keywords
WRITE           : 'write\\b';
READ            : 'read\\b';
WHILE           : 'while\\b';
DO              : 'do\\b';
IF              : 'if\\b';
THEN            : 'then\\b';
ELSE            : 'else\\b';