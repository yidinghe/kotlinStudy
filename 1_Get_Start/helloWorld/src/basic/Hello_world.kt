package basic

/**
 * Created by yidinghe on 8/31/16.
 */

import java.util.*

fun main(args: Array<String>) {
    println("Hello, world!")

    //String templates
    val name: String = "heyidingdingding"
    println("Hello, $name")

    //Representation and ===
    val a: Int = 10000
    println(a === a)
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA)

    val b: Int = 10000
    println(b == a)

    val boxedB: Int? = b
    val anotherBoxedB: Int? = b
    println(boxedB == anotherBoxedB)

    //Explicit Conversions

    val byte: Byte = 1
    val int: Int = byte.toInt()

    println("byte: $byte, int: $int")

    /*
    function can be used for numbers
    toByte(): Byte
    toShort(): Short
    toInt(): Int
    toLong(): Long
    toFloat(): Float
    toDouble(): Double
    toChar(): Char
    */

    val x = (1 shl 2) and 0x000FF000

    println("bit operation: (1 shl 2) and 0x000FF000 is $x")

    /*
    function can be used for bitOperations
    (available for Int and Long only):
    shl(bits) – signed shift left (Java’s <<)
    shr(bits) – signed shift right (Java’s >>)
    ushr(bits) – unsigned shift right (Java’s >>>)
    and(bits) – bitwise and
    or(bits) – bitwise or
    xor(bits) – bitwise xor
    inv() – bitwise inversion
    */

    //Char
    val char: Char = '9'
    println("basic.decimalDigitValue: ${decimalDigitValue(char)}")

    //Array

    val array1: IntArray = intArrayOf(1, 2, 3, 4, 5)

    val array2: Array<String> = Array<String>(5, { i -> (i * i).toString() })

    //String

    val str = "haha, heyidingdingding"

    for (c in str) {
        println(c)
    }

    val text1 = """
        for (c in "foo")
        print(c)
        """
    println(text1)
    val text2 = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    println(text2)


    //range and for loop

    val xInt: Int = 5
    val yInt: Int = 19

    if (xInt in 0..yInt)
        println("xInt is in yInt")

    val stringList: ArrayList<String> = arrayListOf("aaa", "bbb", "ccc");

    if ("aaa" in stringList)
        println("aaa is in stringList")

    if (xInt !in 0..stringList.size - 1)
        println("Out: stringList only has ${stringList.size} elements, xInt is $xInt")

    for (i in 4 downTo 1) print(i)
    for (i in 4 downTo 1 step 2) print(i)
    //Use When


    cases("Hello")
    cases(1)
    cases(System.currentTimeMillis())
    cases(MyClass())
    cases("hello")


}
class MyClass() {
}

fun cases(obj: Any){
    when(obj){
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("unknown")
    }
}

fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9') {
        throw IllegalArgumentException("Out of range")
    }
    return c.toInt() - '0'.toInt()
}
