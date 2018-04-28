parser grammar LParser;

options { tokenVocab=LLexer; }

program : lines=line+ EOF ;

line : statement ;

statement : READ LPAREN ID RPAREN SEP                                               # ReadStatement
          | WRITE LPAREN expression RPAREN SEP                                      # WriteStatement
          | WHILE expression DO LFIG statement* RFIG                                # LoopStatement
          | IF expression THEN LFIG statement* RFIG                                 # BranchStatement
          | IF expression THEN LFIG statement* RFIG ELSE LFIG statement* RFIG       # BranchStatementWithElse
          | FUNCDECL ID LPAREN RPAREN FUNCBODY LFIG statement* RFIG                 # NullaryFunctionDeclaration
          | FUNCDECL ID LPAREN ID (COMMA ID)* RPAREN FUNCBODY LFIG statement* RFIG  # NaryFunctionDeclaration
          | RETURN expression SEP                                                   # ReturnExpression
          | expression SEP                                                          # OneLineExpression
          | ID ASSIGN expression SEP                                                # VariableAssignment ;

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

//boolean_expr : boolean_expr AND boolean_expr    # AndOperation
//             | boolean_expr OR boolean_expr     # OrOperation
//             | comparison_expr                  # ComparisonExpression
//             | LPAREN boolean_expr RPAREN       # NestedBooleanExpression
//             | boolean_variable                 # BooleanHolder ;
//
//comparison_expr : comparison_operand comparison_operator comparison_operand # ComparisonOperation
//                | LPAREN comparison_expr RPAREN                             # NestedComparisonExpression ;
//
//comparison_operand : arithmetic_expr ;
//
//comparison_operator : EQ | NEQ | LT | LEQ | GT | GEQ ;
//
//arithmetic_expr : arithmetic_expr POW arithmetic_expr       # PowerOperation
//                | arithmetic_expr MULT arithmetic_expr      # MultOperation
//                | arithmetic_expr DIV arithmetic_expr       # DivOperation
//                | arithmetic_expr MOD arithmetic_expr       # ModOperation
//                | arithmetic_expr PLUS arithmetic_expr      # PlusOperation
//                | arithmetic_expr MINUS arithmetic_expr     # MinusOperation
//                | LPAREN arithmetic_expr RPAREN             # NestedArithmeticExpression
//                | arithmetic_variable                       # ArithmeticHolder ;
//
//arithmetic_variable : NUMBER    # ArithmeticConstant
//                    | ID        # ArithmeticVariable ;
//
//boolean_variable : TRUE | FALSE # BooleanConstant
//                 | ID           # BooleanVariable ;