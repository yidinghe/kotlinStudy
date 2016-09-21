package ch03.SplittingStrings1

fun main(args: Array<String>) {
    println("12.345-6.A".split(".", "-"))
    println("1.2.3.4.5-345-A.B".split('.','-'))
}
