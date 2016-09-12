package ch02.TryCatchAndFinally

import java.io.BufferedReader
import java.io.InputStreamReader

fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    }
    catch (e: NumberFormatException) {
        return null
    }
    finally {
        reader.close()
    }
}

fun main(args: Array<String>) {
    val streamReader = InputStreamReader(System.`in`)
    val reader = BufferedReader(streamReader)
    println(readNumber(reader))
}
