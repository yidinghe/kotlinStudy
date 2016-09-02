package basic

/**
 * Created by yidinghe on 9/1/16.
 */

fun main(args: Array<String>) {

    val numbers = listOf<Int>(1, 2, 3)
    println(numbers.filter(::isOdd))

    val strings: List<String> = listOf("aaa", "b", "cc", "ccc")
    println(strings.filter(compose(::isOdd, ::length)))


    val b = numbers.any { it % 2 == 0 }
    println(b)
}



data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int{
        when {
            year != other.year -> return year - other.year
            month != other.month -> return month - other.month
            else -> return dayOfMonth - other.dayOfMonth
        }
    }
}

fun isOdd(x: Int) = x % 2 != 0

fun length(s: String) = s.length

fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C{
    return { y -> f(g(y)) }
}