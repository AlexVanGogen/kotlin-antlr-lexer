package ru.spbau.mit.fl.grammar

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import java.io.File
import java.nio.file.Paths

internal class ParserTest {

    @Test
    internal fun testProgramWithSimpleArithmeticExpressions() {
        val programName = "simple_arithmetic"
        val codeLocation = "src/test/resources/ru.spbau.mit.fl.grammar/parser"
        val codeFile = Paths.get("$codeLocation/$programName.l").normalize().toFile().absolutePath;
        val codeTree = Paths.get("$codeLocation/trees/$programName.txt").normalize().toFile().absolutePath;
        val parseTree = File(codeTree).readText()

        val result = toParseTree(PParser.fromFile(codeFile)).multilineString()
        assertEquals(parseTree, result)
    }

    @Test
    internal fun testProgramWithSimpleBooleanExpressions() {
        val programName = "simple_boolean"
        val codeLocation = "src/test/resources/ru.spbau.mit.fl.grammar/parser"
        val codeFile = Paths.get("$codeLocation/$programName.l").normalize().toFile().absolutePath;
        val codeTree = Paths.get("$codeLocation/trees/$programName.txt").normalize().toFile().absolutePath;
        val parseTree = File(codeTree).readText()

        val result = toParseTree(PParser.fromFile(codeFile)).multilineString()
        assertEquals(parseTree, result)
    }

    @Test
    internal fun testProgramWithLeftAssociativeExpressions() {
        val programName = "left_associative"
        val codeLocation = "src/test/resources/ru.spbau.mit.fl.grammar/parser"
        val codeFile = Paths.get("$codeLocation/$programName.l").normalize().toFile().absolutePath;
        val codeTree = Paths.get("$codeLocation/trees/$programName.txt").normalize().toFile().absolutePath;
        val parseTree = File(codeTree).readText()

        val result = toParseTree(PParser.fromFile(codeFile)).multilineString()
        assertEquals(parseTree, result)
    }

    @Test
    internal fun testProgramWithDifferentPrioritiesExpressions() {
        val programName = "different_priorities"
        val codeLocation = "src/test/resources/ru.spbau.mit.fl.grammar/parser"
        val codeFile = Paths.get("$codeLocation/$programName.l").normalize().toFile().absolutePath;
        val codeTree = Paths.get("$codeLocation/trees/$programName.txt").normalize().toFile().absolutePath;
        val parseTree = File(codeTree).readText()

        val result = toParseTree(PParser.fromFile(codeFile)).multilineString()
        assertEquals(parseTree, result)
    }

    @Test
    internal fun testProgramWithStatementsExpressions() {
        val programName = "statements"
        val codeLocation = "src/test/resources/ru.spbau.mit.fl.grammar/parser"
        val codeFile = Paths.get("$codeLocation/$programName.l").normalize().toFile().absolutePath;
        val codeTree = Paths.get("$codeLocation/trees/$programName.txt").normalize().toFile().absolutePath;
        val parseTree = File(codeTree).readText()

        val result = toParseTree(PParser.fromFile(codeFile)).multilineString()
        assertEquals(parseTree, result)
    }

    @Test
    internal fun testProgramWithFunctionsExpressions() {
        val programName = "functions"
        val codeLocation = "src/test/resources/ru.spbau.mit.fl.grammar/parser"
        val codeFile = Paths.get("$codeLocation/$programName.l").normalize().toFile().absolutePath;
        val codeTree = Paths.get("$codeLocation/trees/$programName.txt").normalize().toFile().absolutePath;
        val parseTree = File(codeTree).readText()

        val result = toParseTree(PParser.fromFile(codeFile)).multilineString()
        assertEquals(parseTree, result)
    }

    @Test
    internal fun testUnparseablePrograms() {
        val programNames = (1..10).map { i -> "unparseable$i" }

        for (programName in programNames) {
            val codeLocation = "src/test/resources/ru.spbau.mit.fl.grammar/parser/bad"
            val codeFile = Paths.get("$codeLocation/$programName.l").normalize().toFile().absolutePath;

            assertThrows(ParserException::class.java, { toParseTree(PParser.fromFile(codeFile)).multilineString() } )
        }
    }
}