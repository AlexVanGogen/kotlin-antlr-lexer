package ru.spbau.mit.fl.grammar

import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.Token
import java.io.StringReader
import java.util.*

class Lexer {

    fun lexerFor(code: String) = LLexer(ANTLRInputStream(StringReader(code)))

    fun tokenize(lexer: LLexer): List<TokenRepresentation> {
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

    fun representTokenList(tokens: List<TokenRepresentation>) {
        for (nextToken: TokenRepresentation in tokens) {
            nextToken.represent()
        }
    }
}

fun main(args: Array<String>) {
    val lexer = Lexer()
    lexer.representTokenList(lexer.tokenize(lexer.lexerFor("a := 5; read(b); c := b * 2; write(a+c)")))
}