package ch03.SplittingStrings

fun main(args: Array<String>) {
    println("12.345-6.A".split("\\.|-".toRegex()))
}
