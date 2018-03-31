package ru.spbau.mit.fl.grammar

class TokenRepresentation(val type: String, val line: Int, val startIndex: Int, val endIndex: Int, val name: String?) {

    fun represent() {
        if (type in listOf("NUMBER", "ID", "BOOL")) {
            println("%s ('%s', %d, %d, %d)".format(type.padEnd(10), name, line, startIndex, endIndex))
        } else {
            println("%s (%d, %d, %d)".format(type.padEnd(10), line, startIndex, endIndex))
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as TokenRepresentation

        if (type != other.type) return false
        if (line != other.line) return false
        if (startIndex != other.startIndex) return false
        if (endIndex != other.endIndex) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        var result = type.hashCode()
        result = 31 * result + line
        result = 31 * result + startIndex
        result = 31 * result + endIndex
        result = 31 * result + (name?.hashCode() ?: 0)
        return result
    }


}