parser grammar LParser;

options { tokenVocab=LLexer; }

program : lines=line* EOF ;

line : statement ;

statement : READ LPAREN ID RPAREN SEP                                                # ReadStatement
          | WRITE LPAREN expression RPAREN SEP                                       # WriteStatement
          | WHILE condition DO LFIG loop_body RFIG                                   # LoopStatement
          | IF condition THEN LFIG true_body RFIG                                    # BranchStatement
          | IF condition THEN LFIG true_body RFIG ELSE LFIG false_body RFIG          # BranchStatementWithElse
          | FUNCDECL ID LPAREN RPAREN LFIG statement* RFIG                           # NullaryFunctionDeclaration
          | FUNCDECL ID LPAREN ID (COMMA ID)* RPAREN LFIG statement* RFIG            # NaryFunctionDeclaration
          | FUNCDECL ID LPAREN RPAREN FUNCBODY expression SEP                        # OnelineNullaryFunctionDeclaration
          | FUNCDECL ID LPAREN ID (COMMA ID)* RPAREN FUNCBODY expression SEP         # OnelineNaryFunctionDeclaration
          | RETURN expression SEP                                                    # ReturnExpression
          | expression SEP                                                           # OneLineExpression
          | ID ASSIGN (ID ASSIGN)* expression SEP                                    # VariableAssignment ;

condition : expression                                                               # ConditionExpression ;
loop_body : statement*                                                               # LoopBody ;
true_body : statement*                                                               # TrueBody ;
false_body : statement*                                                              # FalseBody ;
true_expression : expression                                                         # TrueExpression ;
false_expression : expression                                                        # FalseExpression ;

expression : IF condition THEN true_expression ELSE false_expression     # BranchedExpression
           | LPAREN expression RPAREN                                    # NestedExpression
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