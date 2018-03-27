package ru.spbau.mit.fl.grammar

import org.antlr.v4.runtime.ANTLRInputStream
import java.io.StringReader
import java.util.*

class Lexer {

    fun lexerFor(code: String) = LLexer(ANTLRInputStream(StringReader(code)))

    fun tokens(lexer: LLexer): List<String> {
        val tokens = LinkedList<String>()
        do {
            val t = lexer.nextToken()
            println(t)
            when (t.type) {
                -1 -> tokens.add("EOF")
                else -> tokens.add(lexer.ruleNames[t.type - 1])
            }
        } while (t.type != -1)
        return tokens
    }
}

fun main(args: Array<String>) {
    val lexer: Lexer = Lexer()
    lexer.tokens(lexer.lexerFor("a := 1"))
}