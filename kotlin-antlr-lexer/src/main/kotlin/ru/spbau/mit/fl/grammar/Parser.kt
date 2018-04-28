package ru.spbau.mit.fl.grammar

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.StringReader
import java.nio.file.Paths

class PParser {

    private var parser: LParser = LParser(null)

    companion object {
        fun fromString(code: String): LParser.ProgramContext {
            return LParser(CommonTokenStream(LLexer(CharStreams.fromReader(StringReader(code))))).program()
        }

        fun fromFile(codeFile: String): LParser.ProgramContext {
            return LParser(CommonTokenStream(LLexer(CharStreams.fromFileName(codeFile)))).program()
        }
    }
}

fun main(args: Array<String>) {
    val codeLocation = "src/test/resources/ru.spbau.mit.fl.grammar/parser/bad"
    val codeFile = Paths.get("$codeLocation/unparseable10.l").normalize().toFile().absolutePath;
    val result = toParseTree(PParser.fromFile(codeFile)).multilineString()
    println(result)
}