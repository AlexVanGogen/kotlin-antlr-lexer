// Generated from /Users/alexvangogen/SPbAU/FL/lexer_github/kotlin-antlr-lexer/kotlin-antlr-lexer/src/main/resources/ru.spbau.mit.fl.grammar/LParser.g4 by ANTLR 4.7
package ru.spbau.mit.fl.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LParser}.
 */
public interface LParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(LParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(LParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadStatement}
	 * labeled alternative in {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(LParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadStatement}
	 * labeled alternative in {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(LParser.ReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteStatement}
	 * labeled alternative in {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(LParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteStatement}
	 * labeled alternative in {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(LParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopStatement}
	 * labeled alternative in {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(LParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopStatement}
	 * labeled alternative in {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(LParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BranchStatement}
	 * labeled alternative in {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBranchStatement(LParser.BranchStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BranchStatement}
	 * labeled alternative in {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBranchStatement(LParser.BranchStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BranchStatementWithElse}
	 * labeled alternative in {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBranchStatementWithElse(LParser.BranchStatementWithElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BranchStatementWithElse}
	 * labeled alternative in {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBranchStatementWithElse(LParser.BranchStatementWithElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullaryFunctionDeclaration}
	 * labeled alternative in {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNullaryFunctionDeclaration(LParser.NullaryFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullaryFunctionDeclaration}
	 * labeled alternative in {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNullaryFunctionDeclaration(LParser.NullaryFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NaryFunctionDeclaration}
	 * labeled alternative in {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNaryFunctionDeclaration(LParser.NaryFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NaryFunctionDeclaration}
	 * labeled alternative in {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNaryFunctionDeclaration(LParser.NaryFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnExpression}
	 * labeled alternative in {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpression(LParser.ReturnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnExpression}
	 * labeled alternative in {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpression(LParser.ReturnExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OneLineExpression}
	 * labeled alternative in {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterOneLineExpression(LParser.OneLineExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OneLineExpression}
	 * labeled alternative in {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitOneLineExpression(LParser.OneLineExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableAssignment}
	 * labeled alternative in {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(LParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableAssignment}
	 * labeled alternative in {@link LParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(LParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionExpression}
	 * labeled alternative in {@link LParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionExpression(LParser.ConditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionExpression}
	 * labeled alternative in {@link LParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionExpression(LParser.ConditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopBody}
	 * labeled alternative in {@link LParser#loop_body}.
	 * @param ctx the parse tree
	 */
	void enterLoopBody(LParser.LoopBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopBody}
	 * labeled alternative in {@link LParser#loop_body}.
	 * @param ctx the parse tree
	 */
	void exitLoopBody(LParser.LoopBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueBody}
	 * labeled alternative in {@link LParser#true_body}.
	 * @param ctx the parse tree
	 */
	void enterTrueBody(LParser.TrueBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueBody}
	 * labeled alternative in {@link LParser#true_body}.
	 * @param ctx the parse tree
	 */
	void exitTrueBody(LParser.TrueBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseBody}
	 * labeled alternative in {@link LParser#false_body}.
	 * @param ctx the parse tree
	 */
	void enterFalseBody(LParser.FalseBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseBody}
	 * labeled alternative in {@link LParser#false_body}.
	 * @param ctx the parse tree
	 */
	void exitFalseBody(LParser.FalseBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NestedExpression}
	 * labeled alternative in {@link LParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNestedExpression(LParser.NestedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NestedExpression}
	 * labeled alternative in {@link LParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNestedExpression(LParser.NestedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryAddingOperation}
	 * labeled alternative in {@link LParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryAddingOperation(LParser.BinaryAddingOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryAddingOperation}
	 * labeled alternative in {@link LParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryAddingOperation(LParser.BinaryAddingOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullaryFunction}
	 * labeled alternative in {@link LParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNullaryFunction(LParser.NullaryFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullaryFunction}
	 * labeled alternative in {@link LParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNullaryFunction(LParser.NullaryFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExponentialOperation}
	 * labeled alternative in {@link LParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExponentialOperation(LParser.BinaryExponentialOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExponentialOperation}
	 * labeled alternative in {@link LParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExponentialOperation(LParser.BinaryExponentialOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanComparingOperation}
	 * labeled alternative in {@link LParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanComparingOperation(LParser.BooleanComparingOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanComparingOperation}
	 * labeled alternative in {@link LParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanComparingOperation(LParser.BooleanComparingOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueHolder}
	 * labeled alternative in {@link LParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValueHolder(LParser.ValueHolderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueHolder}
	 * labeled alternative in {@link LParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValueHolder(LParser.ValueHolderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NaryFunction}
	 * labeled alternative in {@link LParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNaryFunction(LParser.NaryFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NaryFunction}
	 * labeled alternative in {@link LParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNaryFunction(LParser.NaryFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanEqualityOperation}
	 * labeled alternative in {@link LParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanEqualityOperation(LParser.BooleanEqualityOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanEqualityOperation}
	 * labeled alternative in {@link LParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanEqualityOperation(LParser.BooleanEqualityOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryMultiplicationOperation}
	 * labeled alternative in {@link LParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryMultiplicationOperation(LParser.BinaryMultiplicationOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryMultiplicationOperation}
	 * labeled alternative in {@link LParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryMultiplicationOperation(LParser.BinaryMultiplicationOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLogicalOperation}
	 * labeled alternative in {@link LParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLogicalOperation(LParser.BooleanLogicalOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLogicalOperation}
	 * labeled alternative in {@link LParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLogicalOperation(LParser.BooleanLogicalOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanConstant}
	 * labeled alternative in {@link LParser#value_holder}.
	 * @param ctx the parse tree
	 */
	void enterBooleanConstant(LParser.BooleanConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanConstant}
	 * labeled alternative in {@link LParser#value_holder}.
	 * @param ctx the parse tree
	 */
	void exitBooleanConstant(LParser.BooleanConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericConstant}
	 * labeled alternative in {@link LParser#value_holder}.
	 * @param ctx the parse tree
	 */
	void enterNumericConstant(LParser.NumericConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericConstant}
	 * labeled alternative in {@link LParser#value_holder}.
	 * @param ctx the parse tree
	 */
	void exitNumericConstant(LParser.NumericConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link LParser#value_holder}.
	 * @param ctx the parse tree
	 */
	void enterVariable(LParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link LParser#value_holder}.
	 * @param ctx the parse tree
	 */
	void exitVariable(LParser.VariableContext ctx);
}