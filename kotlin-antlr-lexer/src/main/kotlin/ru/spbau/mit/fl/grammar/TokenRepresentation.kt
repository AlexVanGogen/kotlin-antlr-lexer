package ru.spbau.mit.fl.grammar

class TokenRepresentation(val type: String, val startIndex: Int, val endIndex: Int, val name: String?) {

    fun represent() {
        println("%s ('%s', %d, %d)".format(type.padEnd(10), name, startIndex, endIndex - startIndex))
    }
}