package ru.spbau.mit.fl.grammar

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.Token
import java.io.File
import java.io.StringReader
import java.nio.file.Paths
import java.util.*

class Lexer {

    private var lexer: LLexer = LLexer(null)

    companion object {
        fun fromString(code: String): Lexer {
            var l = Lexer()
            l.lexer = LLexer(CharStreams.fromReader(StringReader(code)))
            return l
        }

        public fun fromFile(codeFile: String): Lexer {
            var l = Lexer()
            l.lexer = LLexer(CharStreams.fromFileName(codeFile))
            return l
        }
    }

    public fun run(): List<TokenRepresentation> = tokenize(lexer)

    public fun representTokenList(tokens: List<TokenRepresentation>) {
        for (nextToken: TokenRepresentation in tokens) {
            nextToken.represent()
        }
    }

    private fun tokenize(lexer: LLexer): List<TokenRepresentation> {
        val tokens = LinkedList<TokenRepresentation>()
        var prevLine = -1
        var prevLength = 0
        var lengthShift = 0
        do {
            var t: Token? = lexer.getNextToken()
            if (t!!.line > prevLine) {
                lengthShift = -prevLength - if (prevLine != -1) 1 else 0
                prevLine = t.line
            }
            when (t.type) {
                -1 -> {}
                else -> tokens.add(TokenRepresentation(
                        lexer.ruleNames[t.type - 1],
                        t.line,
                        t.startIndex + lengthShift,
                        t.stopIndex + 1 + lengthShift,
                        t.text))
            }
            prevLength = t.stopIndex + 1
        } while (t!!.type != -1)
        return tokens
    }
}

fun main(args: Array<String>) {
    val lexer = Lexer.fromString("123abc")
    lexer.representTokenList(lexer.run())
}