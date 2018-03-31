package ru.spbau.mit.fl.grammar

fun main(args: Array<String>) {

    fun help() {
        println("Usage:")
        println("-c <code>: tokenize code given as a string")
        println("-f <filename>: tokenize code in file with given name")
    }

    var lexer: Lexer

    if (args.size < 2) {
        help()
    } else {
        when (args[0]) {
            "-c" -> lexer = Lexer.fromString(args.slice(1..args.size).joinToString(" "))
            "-f" -> lexer = Lexer.fromFile(args.slice(1..args.size).joinToString(" "))
            else -> { help(); return; }
        }
        try {
            lexer.representTokenList(lexer.run())
        } catch (e: LexerException) {
            println(e.message)
        }
    }
}