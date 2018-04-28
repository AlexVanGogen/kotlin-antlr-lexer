package ru.spbau.mit.fl.grammar

fun main(args: Array<String>) {

    fun help() {
        println("Usage:")
        println("-c: tokenize code from user input")
        println("-f <filename>: tokenize code from file with given name")
    }

    fun readInput(): String {
        val sb = StringBuilder()
        var s: String? = readLine()
        while (s != null) {
            sb.append(s)
            s = readLine()
        }
        return sb.toString()
    }

    var lexer: Lexer

    if (args.isEmpty() || args.size > 2) {
        help()
    } else {
        when (args[0]) {
            "-c" -> lexer = Lexer.fromString(readInput())
            "-f" -> try {
                lexer = Lexer.fromFile(args[1])
            } catch (e: IndexOutOfBoundsException) {
                help()
                return
            } catch (e: java.nio.file.NoSuchFileException) {
                println("${args[1]}: file not found")
                return
            }
            else -> { help(); return; }
        }
        try {
            lexer.representTokenList(lexer.run())
        } catch (e: LexerException) {
            println(e.message)
        } catch (e: ParserException) {
            println(e.message)
        }
    }
}
