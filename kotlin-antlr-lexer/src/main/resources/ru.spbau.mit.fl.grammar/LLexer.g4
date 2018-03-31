lexer grammar LLexer;

@lexer::members {
    public Token nextToken() {
        while (true) {
            state.token = null;
            state.channel = Token.DEFAULT_CHANNEL;
            state.tokenStartCharIndex = input.index();
            state.tokenStartCharPositionInLine = input.getCharPositionInLine();
            state.tokenStartLine = input.getLine();
            state.text = null;
            if ( input.LA(1)==CharStream.EOF ) {
                return Token.EOF_TOKEN;
            }
            try {
                mTokens();
                if ( state.token==null ) {
                    emit();
                }
                else if ( state.token==Token.SKIP_TOKEN ) {
                    continue;
                }
                return state.token;
            }
            catch (RecognitionException re) {
                reportError(re);
                throw new RuntimeException("Bailing out!"); // or throw Error
            }
        }
    }
}

NEWLINE         : '\r\n' | '\r' | '\n' {skip();};
SPACE           : [\t ]+ -> skip;

// One-line comments
COMMENT         : '//' ~[\r\n]* ;

// Keywords
WRITE           : 'write' ;
READ            : 'read' ;
WHILE           : 'while' ;
DO              : 'do' ;
IF              : 'if' ;
THEN            : 'then' ;
ELSE            : 'else' ;
FUNCDECL        : 'fun' ;
RETURN          : 'return';

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
FUNCBODY        : '<-' ;


// Other symbols
SEP             : ';' ;
LPAREN          : '(' ;
RPAREN          : ')' ;
LFIG            : '{' ;
RFIG            : '}' ;
COMMA           : ',' ;

NUMBER          : [0-9]+('.'[0-9]*)?;
BOOL            : 'true' | 'false';

// Identifiers
ID              : [_]*[a-z][a-z0-9_]* ;