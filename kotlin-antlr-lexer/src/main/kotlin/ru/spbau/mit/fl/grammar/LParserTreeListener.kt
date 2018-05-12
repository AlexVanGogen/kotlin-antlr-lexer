package ru.spbau.mit.fl.grammar

import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ErrorNode
import org.antlr.v4.runtime.tree.TerminalNode

class LParserTreeListener: LParserListener {
    var indentationInTabs = 1

    override fun exitProgram(ctx: LParser.ProgramContext?) {
        println("End of program")
    }

    override fun enterConditionExpression(ctx: LParser.ConditionExpressionContext?) {
        printWithIndent("Condition")
        indentationInTabs++
    }

    override fun exitConditionExpression(ctx: LParser.ConditionExpressionContext?) {
        indentationInTabs--
    }

    override fun enterLoopBody(ctx: LParser.LoopBodyContext?) {
        printWithIndent("Body")
        indentationInTabs++
    }

    override fun exitLoopBody(ctx: LParser.LoopBodyContext?) {
        indentationInTabs--
    }

    override fun enterTrueBody(ctx: LParser.TrueBodyContext?) {
        printWithIndent("True branch")
        indentationInTabs++
    }

    override fun exitTrueBody(ctx: LParser.TrueBodyContext?) {
        indentationInTabs--
    }

    override fun enterFalseBody(ctx: LParser.FalseBodyContext?) {
        printWithIndent("False branch")
        indentationInTabs++
    }

    override fun exitFalseBody(ctx: LParser.FalseBodyContext?) {
        indentationInTabs--
    }

    override fun enterOnelineNullaryFunctionDeclaration(ctx: LParser.OnelineNullaryFunctionDeclarationContext?) {
        printWithIndent("Function declaration")
        indentationInTabs++
        printWithIndent("Function name: ${ctx?.ID()}")
        printWithIndent("Function body")
        indentationInTabs++
        printWithIndent("Return")
        indentationInTabs++
    }

    override fun exitOnelineNullaryFunctionDeclaration(ctx: LParser.OnelineNullaryFunctionDeclarationContext?) {
        indentationInTabs -= 3
    }

    override fun enterOnelineNaryFunctionDeclaration(ctx: LParser.OnelineNaryFunctionDeclarationContext?) {
        printWithIndent("Function declaration")
        indentationInTabs++
        printWithIndent("Function name: ${ctx?.ID(0)}")
        val args: List<String> = ctx?.ID()?.drop(1)?.map { it.text }!!
        printWithIndent("Arguments: ${args.joinToString(", ")}")
        indentationInTabs++
        printWithIndent("Return")
        indentationInTabs++
    }

    override fun exitOnelineNaryFunctionDeclaration(ctx: LParser.OnelineNaryFunctionDeclarationContext?) {
        indentationInTabs -= 3
    }

    override fun enterTrueExpression(ctx: LParser.TrueExpressionContext?) {
        printWithIndent("True branch")
        indentationInTabs++
    }

    override fun exitTrueExpression(ctx: LParser.TrueExpressionContext?) {
        indentationInTabs--
    }

    override fun enterFalseExpression(ctx: LParser.FalseExpressionContext?) {
        printWithIndent("False branch")
        indentationInTabs++
    }

    override fun exitFalseExpression(ctx: LParser.FalseExpressionContext?) {
        indentationInTabs--
    }

    override fun enterBranchedExpression(ctx: LParser.BranchedExpressionContext?) {
        printWithIndent("Branched expression")
        indentationInTabs++
    }

    override fun exitBranchedExpression(ctx: LParser.BranchedExpressionContext?) {
        indentationInTabs--
    }

    override fun enterLine(ctx: LParser.LineContext?) {}

    override fun enterReadStatement(ctx: LParser.ReadStatementContext?) {
        printWithIndent("Read")
        printWithIndent("To variable: ${ctx?.ID()}", indentationInTabs + 1)
    }

    override fun exitReadStatement(ctx: LParser.ReadStatementContext?) {}

    override fun exitWriteStatement(ctx: LParser.WriteStatementContext?) {
        indentationInTabs--
    }

    override fun enterBranchStatement(ctx: LParser.BranchStatementContext?) {
        indentationInTabs--
    }

    override fun enterBranchStatementWithElse(ctx: LParser.BranchStatementWithElseContext?) {
        printWithIndent("Branch")
        indentationInTabs++
    }

    override fun enterNullaryFunctionDeclaration(ctx: LParser.NullaryFunctionDeclarationContext?) {
        printWithIndent("Function declaration")
        indentationInTabs++
        printWithIndent("Function name: ${ctx?.ID()}")
        printWithIndent("Function body")
        indentationInTabs++
    }

    override fun enterNaryFunctionDeclaration(ctx: LParser.NaryFunctionDeclarationContext?) {
        printWithIndent("Function declaration")
        indentationInTabs++
        printWithIndent("Function name: ${ctx?.ID(0)}")
        val args: List<String> = ctx?.ID()?.drop(1)?.map { it.text }!!
        printWithIndent("Arguments: ${args.joinToString(", ")}")
        indentationInTabs++
    }

    override fun exitNaryFunctionDeclaration(ctx: LParser.NaryFunctionDeclarationContext?) {
        indentationInTabs -= 2
    }

    override fun exitOneLineExpression(ctx: LParser.OneLineExpressionContext?) {}

    override fun enterNestedExpression(ctx: LParser.NestedExpressionContext?) {}

    override fun enterBinaryAddingOperation(ctx: LParser.BinaryAddingOperationContext?) {
        printWithIndent("Additive operation")
        indentationInTabs++
        printWithIndent("Operation: ${ctx?.operator?.text}")
    }

    override fun exitBinaryExponentialOperation(ctx: LParser.BinaryExponentialOperationContext?) {
        indentationInTabs--
    }

    override fun enterBooleanComparingOperation(ctx: LParser.BooleanComparingOperationContext?) {
        printWithIndent("Comparing operation")
        indentationInTabs++
        printWithIndent("Operation: ${ctx?.operator?.text}")
    }

    override fun exitBooleanComparingOperation(ctx: LParser.BooleanComparingOperationContext?) {
        indentationInTabs--
    }

    override fun enterValueHolder(ctx: LParser.ValueHolderContext?) {
        printWithIndent("Value: ${ctx?.value_holder()?.text}")
    }

    override fun exitValueHolder(ctx: LParser.ValueHolderContext?) {}

    override fun exitNaryFunction(ctx: LParser.NaryFunctionContext?) {
        indentationInTabs -= 2
    }

    override fun enterBooleanEqualityOperation(ctx: LParser.BooleanEqualityOperationContext?) {
        printWithIndent("Comparing operation")
        indentationInTabs++
        printWithIndent("Operation: ${ctx?.operator?.text}")
    }

    override fun enterBinaryMultiplicationOperation(ctx: LParser.BinaryMultiplicationOperationContext?) {
        printWithIndent("Multiplication operation")
        indentationInTabs++
        printWithIndent("Operation: ${ctx?.operator?.text}")
    }

    override fun exitBooleanLogicalOperation(ctx: LParser.BooleanLogicalOperationContext?) {
        indentationInTabs--
    }

    override fun enterBooleanConstant(ctx: LParser.BooleanConstantContext?) {}

    override fun exitBooleanConstant(ctx: LParser.BooleanConstantContext?) {}

    override fun exitVariable(ctx: LParser.VariableContext?) {}

    override fun visitErrorNode(node: ErrorNode?) {}

    override fun enterEveryRule(ctx: ParserRuleContext?) {}

    override fun exitEveryRule(ctx: ParserRuleContext?) {}

    override fun enterProgram(ctx: LParser.ProgramContext?) {
        println("Start of program")
    }

    override fun exitLine(ctx: LParser.LineContext?) {}

    override fun enterWriteStatement(ctx: LParser.WriteStatementContext?) {
        printWithIndent("Write")
        indentationInTabs++
    }

    override fun enterLoopStatement(ctx: LParser.LoopStatementContext?) {
        printWithIndent("Loop")
        indentationInTabs++
    }

    override fun exitLoopStatement(ctx: LParser.LoopStatementContext?) {
        indentationInTabs--
    }

    override fun exitBranchStatement(ctx: LParser.BranchStatementContext?) {
        indentationInTabs--
    }

    override fun exitBranchStatementWithElse(ctx: LParser.BranchStatementWithElseContext?) {
        indentationInTabs--
    }

    override fun exitNullaryFunctionDeclaration(ctx: LParser.NullaryFunctionDeclarationContext?) {
        indentationInTabs -= 2
    }

    override fun enterReturnExpression(ctx: LParser.ReturnExpressionContext?) {
        printWithIndent("Return")
        indentationInTabs++
    }

    override fun exitReturnExpression(ctx: LParser.ReturnExpressionContext?) {
        indentationInTabs--
    }

    override fun enterOneLineExpression(ctx: LParser.OneLineExpressionContext?) {}

    override fun enterVariableAssignment(ctx: LParser.VariableAssignmentContext?) {
        printWithIndent("Assignment")
        indentationInTabs++
        val ids: List<String> = ctx?.ID()?.map { it.text }!!
        ids.forEach {
            printWithIndent("To variable: $it")
        }
    }

    override fun exitVariableAssignment(ctx: LParser.VariableAssignmentContext?) {
        indentationInTabs--
    }

    override fun exitNestedExpression(ctx: LParser.NestedExpressionContext?) {}

    override fun exitBinaryAddingOperation(ctx: LParser.BinaryAddingOperationContext?) {
        indentationInTabs--
    }

    override fun enterNullaryFunction(ctx: LParser.NullaryFunctionContext?) {
        printWithIndent("Function invocation")
        indentationInTabs++
        printWithIndent("Function name: ${ctx?.ID()}")
        indentationInTabs++
    }

    override fun exitNullaryFunction(ctx: LParser.NullaryFunctionContext?) {
        indentationInTabs -= 2
    }

    override fun enterBinaryExponentialOperation(ctx: LParser.BinaryExponentialOperationContext?) {
        printWithIndent("Exponential operation")
        indentationInTabs++
        printWithIndent("Operation: ${ctx?.operator?.text}")
    }

    override fun enterNaryFunction(ctx: LParser.NaryFunctionContext?) {
        printWithIndent("Function invocation")
        indentationInTabs++
        printWithIndent("Function name: ${ctx?.ID()}")
        printWithIndent("Arguments:")
        indentationInTabs++
    }

    override fun exitBooleanEqualityOperation(ctx: LParser.BooleanEqualityOperationContext?) {
        indentationInTabs--
    }

    override fun exitBinaryMultiplicationOperation(ctx: LParser.BinaryMultiplicationOperationContext?) {
        indentationInTabs--
    }

    override fun enterBooleanLogicalOperation(ctx: LParser.BooleanLogicalOperationContext?) {
        printWithIndent("Logical operation")
        indentationInTabs++
        printWithIndent("Operation: ${ctx?.operator?.text}")
    }

    override fun enterNumericConstant(ctx: LParser.NumericConstantContext?) {}

    override fun enterVariable(ctx: LParser.VariableContext?) {}

    override fun visitTerminal(node: TerminalNode?) {}

    override fun exitNumericConstant(ctx: LParser.NumericConstantContext?) {}

    private fun printWithIndent(s: String, indent: Int = indentationInTabs) {
        println("\t".repeat(indent) + s)
    }
}