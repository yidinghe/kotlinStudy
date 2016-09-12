package ch02.EasierStringFormattingStringTemplates

fun main(args: Array<String>) {
    if (args.size > 0) {
        val name = args[0]
        println("Hello, $name!")
    }
}
