package basic

/**
 * Created by yidinghe on 9/1/16.
 */

fun main(args: Array<String>) {

    val numbers = listOf<Int>(1, 2, 3)
    println(numbers.filter(::isOdd))

    val strings: List<String> = listOf("aaa", "b", "cc", "ccc")
    println(strings.filter(compose(::isOdd, ::length)))
}

fun isOdd(x: Int) = x % 2 != 0

fun length(s: String) = s.length

fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C{
    return { y -> f(g(y)) }
}