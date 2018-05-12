package ru.spbau.mit.fl.grammar

fun main(args: Array<String>) {

    fun help() {
        println("Usage:")
        println("-c: tokenize code from user input")
        println("-f <filename>: tokenize code from file with given name")
        println("-tc: parse and build tree for code from user input")
        println("-tf <filename>: parse and build tree for code from file with given name")
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

    var lexer: Lexer? = null
    var parser: LParser? = null

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
            "-tc" -> parser = ParserFactory.fromString(readInput())
            "-tf" -> try {
                parser = ParserFactory.fromFile(args[1])
            } catch (e: IndexOutOfBoundsException) {
                help()
                return
            } catch (e: java.nio.file.NoSuchFileException) {
                println("${args[1]}: file not found")
                return
            } catch (e: ParserException) {
                println(e.message)
                return
            }
            else -> { help(); return; }
        }
        try {
            if (args[0] in listOf("-c", "-f")) {
                lexer?.representTokenList(lexer.run())
            } else {
                println(traverse(parser!!))
            }
        } catch (e: LexerException) {
            println(e.message)
        } catch (e: ParserException) {
            println(e.message)
        }
    }
}
