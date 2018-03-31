package ru.spbau.mit.fl.grammar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.nio.file.Paths

internal class LexerTest {

    val correctIdentifiers: Map<String, TokenRepresentation> = listOf(
            "a", "aba", "abacaba", "a084", "_ab", "__init__",
            "_ab_1", "so_long_snake_case_name_of_identifier"
    ).map { Pair(it, TokenRepresentation("ID", 1, 0, it.length , it)) }.toMap()

    val incorrectIdentifiers: List<String> = listOf(
            "аба", "абаваба"
    )

    val correctDigits: Map<String, TokenRepresentation> = (0..9).map { it.toString() }.map {
        Pair(it, TokenRepresentation("NUMBER", 1, 0, 1, it))
    }.toMap()

    val correctNaturalNumbers: Map<String, TokenRepresentation> = listOf(
            "10", "101", "38759459043753647568923683749637926431", "10000009"
    ).map { Pair(it, TokenRepresentation("NUMBER", 1, 0, it.length, it)) }.toMap()

    val correctRealNumbers: Map<String, TokenRepresentation> = listOf(
            "0.04890185043", "0.01", "19.1", "1."
    ).map { Pair(it, TokenRepresentation("NUMBER", 1, 0, it.length, it)) }.toMap()

    val incorrectNumbers: List<String> = listOf(
            ".5", ".1.2.3"
    )

    val oneLineProgram: Pair<String, List<TokenRepresentation>> = Pair(
            "read(x); if (y + 1 == x) then { write(y) } else { write(x) }",
            listOf(
                    TokenRepresentation("READ", 1, 0, 4, "read"),
                    TokenRepresentation("LPAREN", 1, 4, 5, "("),
                    TokenRepresentation("ID", 1, 5, 6, "x"),
                    TokenRepresentation("RPAREN", 1, 6, 7, ")"),
                    TokenRepresentation("SEP", 1, 7, 8, ";"),
                    TokenRepresentation("IF", 1, 9, 11, "if"),
                    TokenRepresentation("LPAREN", 1, 12, 13, "("),
                    TokenRepresentation("ID", 1, 13, 14, "y"),
                    TokenRepresentation("PLUS", 1, 15, 16, "+"),
                    TokenRepresentation("NUMBER", 1, 17, 18, "1"),
                    TokenRepresentation("EQ", 1, 19, 21, "=="),
                    TokenRepresentation("ID", 1, 22, 23, "x"),
                    TokenRepresentation("RPAREN", 1, 23, 24, ")"),
                    TokenRepresentation("THEN", 1, 25, 29, "then"),
                    TokenRepresentation("LFIG", 1, 30, 31, "{"),
                    TokenRepresentation("WRITE", 1, 32, 37, "write"),
                    TokenRepresentation("LPAREN", 1, 37, 38, "("),
                    TokenRepresentation("ID", 1, 38, 39, "y"),
                    TokenRepresentation("RPAREN", 1, 39, 40, ")"),
                    TokenRepresentation("RFIG", 1, 41, 42, "}"),
                    TokenRepresentation("ELSE", 1, 43, 47, "else"),
                    TokenRepresentation("LFIG", 1, 48, 49, "{"),
                    TokenRepresentation("WRITE", 1, 50, 55, "write"),
                    TokenRepresentation("LPAREN", 1, 55, 56, "("),
                    TokenRepresentation("ID", 1, 56, 57, "x"),
                    TokenRepresentation("RPAREN", 1, 57, 58, ")"),
                    TokenRepresentation("RFIG", 1, 59, 60, "}")
            )
    )

    val simpleLProgram: Pair<String, List<TokenRepresentation>> = Pair(
            Paths.get("src", "test", "resources", "ru.spbau.mit.fl.grammar", "simple.l").normalize().toFile().absolutePath,
            listOf(
                    TokenRepresentation("READ", 1, 0, 4, "read"),
                    TokenRepresentation("LPAREN", 1, 4, 5, "("),
                    TokenRepresentation("ID", 1, 5, 6, "x"),
                    TokenRepresentation("RPAREN", 1, 6, 7, ")"),
                    TokenRepresentation("SEP", 1, 7, 8, ";"),
                    TokenRepresentation("IF", 2, 0, 2, "if"),
                    TokenRepresentation("LPAREN", 2, 3, 4, "("),
                    TokenRepresentation("ID", 2, 4, 5, "y"),
                    TokenRepresentation("PLUS", 2, 6, 7, "+"),
                    TokenRepresentation("NUMBER", 2, 8, 9, "1"),
                    TokenRepresentation("EQ", 2, 9, 11, "=="),
                    TokenRepresentation("ID", 2, 11, 12, "x"),
                    TokenRepresentation("RPAREN", 2, 12, 13, ")"),
                    TokenRepresentation("THEN", 2, 14, 18, "then"),
                    TokenRepresentation("LFIG", 2, 19, 20, "{"),
                    TokenRepresentation("WRITE", 3, 4, 9, "write"),
                    TokenRepresentation("LPAREN", 3, 9, 10, "("),
                    TokenRepresentation("ID", 3, 10, 11, "y"),
                    TokenRepresentation("RPAREN", 3, 11, 12, ")"),
                    TokenRepresentation("RFIG", 4, 0, 1, "}"),
                    TokenRepresentation("ELSE", 4, 2, 6, "else"),
                    TokenRepresentation("LFIG", 4, 7, 8, "{"),
                    TokenRepresentation("WRITE", 5, 4, 9, "write"),
                    TokenRepresentation("LPAREN", 5, 10, 11, "("),
                    TokenRepresentation("ID", 5, 11, 12, "x"),
                    TokenRepresentation("RPAREN", 5, 12, 13, ")"),
                    TokenRepresentation("RFIG", 6, 0, 1, "}")
            )
    )

    val commentLProgram: Pair<String, List<TokenRepresentation>> = Pair(
            Paths.get("src", "test", "resources", "ru.spbau.mit.fl.grammar", "comment.l").normalize().toFile().absolutePath,
        listOf(
            TokenRepresentation("COMMENT", 1, 0, 14, "// комментарий"),
            TokenRepresentation("ID", 2, 0, 1, "x"),
            TokenRepresentation("ASSIGN", 2, 2, 4, ":="),
            TokenRepresentation("NUMBER", 2, 5, 6, "1"),
            TokenRepresentation("SEP", 2, 6, 7, ";"),
            TokenRepresentation("COMMENT", 2, 8, 31, "// полезный комментарий"),
            TokenRepresentation("COMMENT", 3, 0, 26, "// бесполезный комментарий")
        )
    )

    val functionLProgram: Pair<String, List<String>> = Pair(
            Paths.get("src", "test", "resources", "ru.spbau.mit.fl.grammar", "function.l").normalize().toFile().absolutePath,
            listOf(
                    "FUNCDECL", "ID", "LPAREN", "ID", "COMMA", "ID", "RPAREN", "FUNCBODY",
                    "ID", "ASSIGN", "NUMBER", "SEP", "WHILE", "LPAREN", "ID", "NEQ", "BOOL",
                    "AND", "ID", "NEQ", "BOOL", "RPAREN", "LFIG", "ID", "ASSIGN", "ID", "PLUS", "NUMBER", "SEP",
                    "ID", "ASSIGN", "ID", "AND", "ID", "SEP", "ID", "ASSIGN", "ID", "OR", "ID", "SEP", "RFIG",
                    "IF", "LPAREN", "ID", "GEQ", "NUMBER", "RPAREN", "LFIG", "ID", "ASSIGN", "ID", "MINUS", "NUMBER",
                    "SEP", "RFIG", "RETURN", "ID"
                    )
    )

    val badProgramNames: List<String> = listOf(
            "strangeSymbols.l", "strangeSymbols2.l", "strangeSymbols3.l"
    )

    @Test
    internal fun testIdentifiers() {
        correctIdentifiers.forEach {
            val lexer = Lexer.fromString(it.key)
            val tokens = lexer.run()
            assertEquals(1, tokens.size)
            assertTrue(it.value == tokens[0])
        }
    }

    @Test
    internal fun testNumbers() {
        (correctDigits + correctNaturalNumbers + correctRealNumbers).forEach {
            val lexer = Lexer.fromString(it.key)
            val tokens = lexer.run()
            assertEquals(1, tokens.size)
            assertTrue(it.value == tokens[0])
        }
    }

    @Test
    internal fun testOneLineProgram() {
        val lexer = Lexer.fromString(oneLineProgram.first)
        val tokens = lexer.run()
        assertEquals(oneLineProgram.second.size, tokens.size)
        assertTrue(oneLineProgram.second == tokens)
    }

    @Test
    internal fun testSimpleLProgram() {
        val lexer = Lexer.fromFile(simpleLProgram.first)
        val tokens = lexer.run()
        assertEquals(simpleLProgram.second.size, tokens.size)
        assertTrue(simpleLProgram.second == tokens)
    }

    @Test
    internal fun testCommentLProgram() {
        val lexer = Lexer.fromFile(commentLProgram.first)
        val tokens = lexer.run()
        assertEquals(commentLProgram.second.size, tokens.size)
        assertTrue(commentLProgram.second == tokens)
    }

    @Test
    internal fun testFunctionLProgram() {
        val lexer = Lexer.fromFile(functionLProgram.first)
        val tokens = lexer.run()
        assertEquals(functionLProgram.second.size, tokens.size)
        assertTrue(functionLProgram.second == tokens.map { it.type })
    }

    @Test
    internal fun testBadLiterals() {
        (incorrectIdentifiers + incorrectNumbers).forEach {
            val lexer = Lexer.fromString(it)
            assertThrows(LexerException::class.java) { lexer.run() }
        }
    }

    @Test
    internal fun testBadPrograms() {
        badProgramNames.forEach {
            val lexer = Lexer.fromFile(Paths.get("src", "test", "resources", "ru.spbau.mit.fl.grammar/bad", it).normalize().toFile().absolutePath)
            assertThrows(LexerException::class.java) { lexer.run() }
        }
    }
}