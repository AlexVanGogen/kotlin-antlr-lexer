parser grammar LParser;

options { tokenVocab=LLexer; }

program : lines=line* EOF ;

line : statement ;

statement : READ LPAREN ID RPAREN SEP                                                # ReadStatement
          | WRITE LPAREN expression RPAREN SEP                                       # WriteStatement
          | WHILE expression DO LFIG statement* RFIG                                 # LoopStatement
          | IF expression THEN LFIG statement* RFIG                                  # BranchStatement
          | IF expression THEN LFIG statement* RFIG ELSE LFIG statement* RFIG        # BranchStatementWithElse
          | FUNCDECL ID LPAREN RPAREN FUNCBODY LFIG statement* RFIG                  # NullaryFunctionDeclaration
          | FUNCDECL ID LPAREN ID (COMMA ID)* RPAREN FUNCBODY? LFIG statement* RFIG  # NaryFunctionDeclaration
          | RETURN expression SEP                                                    # ReturnExpression
          | expression SEP                                                           # OneLineExpression
          | ID ASSIGN expression SEP                                                 # VariableAssignment ;

expression : LPAREN expression RPAREN                                      # NestedExpression
           | value_holder                                                # ValueHolder
           | ID LPAREN RPAREN                                            # NullaryFunction
           | ID LPAREN expression (COMMA expression)* RPAREN             # NaryFunction
           | left=expression operator=POW right=expression               # BinaryExponentialOperation
           | left=expression operator=(MULT | DIV | MOD) right=expression  # BinaryMultiplicationOperation
           | left=expression operator=(PLUS | MINUS) right=expression    # BinaryAddingOperation
           | left=expression operator=(GT | GEQ | LT | LEQ) right=expression # BooleanComparingOperation
           | left=expression operator=(EQ | NEQ) right=expression # BooleanEqualityOperation
           | left=expression operator=(AND | OR) right=expression # BooleanLogicalOperation ;

value_holder : BOOL         # BooleanConstant
             | NUMBER       # NumericConstant
             | ID           # Variable ;