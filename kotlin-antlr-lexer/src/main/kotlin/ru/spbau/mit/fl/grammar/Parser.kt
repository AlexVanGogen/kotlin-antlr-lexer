package ru.spbau.mit.fl.grammar

import org.antlr.v4.runtime.*
import java.io.StringReader
import java.nio.file.Paths

internal class LTokenStream(tokenSource: TokenSource) : CommonTokenStream(tokenSource) {
    init {
        var prevToken: Token? = null
        while (true) {
            val t = tokenSource.nextToken()
            if (t.type == 36 && (t.text.startsWith("-") || t.text.startsWith("+")) && prevToken != null && prevToken.type in listOf(36, 38)) {
                tokens.add(CommonToken(14, "+"))
                tokens.add(t)
            }
            else if (t.type != 3 && t.type != 4) {
                tokens.add(t)
            }
            if (t.text == "<EOF>") {
                break
            }
            prevToken = t
        }
    }
}

class ParserFactory {

    companion object {
        fun fromString(code: String): LParser {
            return LParser(LTokenStream(LLexer(CharStreams.fromReader(StringReader(code)))))
        }

        fun fromFile(codeFile: String): LParser {
            return LParser(LTokenStream(LLexer(CharStreams.fromFileName(codeFile))))
        }
    }
}

fun main(args: Array<String>) {
    val codeLocation = "src/test/resources/ru.spbau.mit.fl.grammar/parser"
    val codeFile = Paths.get("$codeLocation/multiple_assignments.l").normalize().toFile().absolutePath;
    val result = traverse(ParserFactory.fromFile(codeFile))
    println(result)
}