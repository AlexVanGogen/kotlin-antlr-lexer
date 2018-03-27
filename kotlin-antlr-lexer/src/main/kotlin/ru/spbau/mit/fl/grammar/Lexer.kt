package ru.spbau.mit.fl.grammar

import org.antlr.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.Token
import java.io.StringReader
import java.util.*

class Lexer(code: String) {

    private val lexer: LLexer = LLexer(CharStreams.fromReader(StringReader(code)))

    public fun run() {
        val tokens = tokenize(lexer)
        for (nextToken: TokenRepresentation in tokens) {
            nextToken.represent()
        }
    }

    private fun tokenize(lexer: LLexer): List<TokenRepresentation> {
        val tokens = LinkedList<TokenRepresentation>()
        do {
            val t = lexer.nextToken()
            when (t.type) {
                -1 -> {}
                else -> if (t.type != LLexer.SPACE) tokens.add(TokenRepresentation(lexer.ruleNames[t.type - 1], t.startIndex, t.stopIndex, t.text))
            }
        } while (t.type != -1)
        return tokens
    }

    private fun representTokenList(tokens: List<TokenRepresentation>) {
        for (nextToken: TokenRepresentation in tokens) {
            nextToken.represent()
        }
    }
}

fun main(args: Array<String>) {
    val lexer: Lexer = Lexer("a := 5; read(b); c := b * 2; write(a+c)")
    lexer.run()
}