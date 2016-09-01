package basic

/**
 * Created by yidinghe on 9/1/16.
 */

fun main(args: Array<String>) {
    val numbers = listOf<Int>(1, 2, 3)

    println(numbers.filter(::isOdd))
}

fun isOdd(x: Int) = x % 2 != 0