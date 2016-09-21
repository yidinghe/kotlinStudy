package ch03.VarargsFunctionsAcceptingArbitraryNumberOfArguments

fun main(args: Array<String>) {
    val list = listOf("args: ", *args)
    println(list)
}
