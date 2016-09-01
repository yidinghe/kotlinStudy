/**
 * Created by yidinghe on 8/31/16.
 */

fun main(args: Array<String>) {
    println("Hello, world!")

    //String templates
    val name: String = "heyidingdingding"
    println("Hello, ${name}")

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

    println("byte: ${byte}, int: ${int}")

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

    println("bit operation: (1 shl 2) and 0x000FF000 is ${x}")

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
    println("decimalDigitValue: ${decimalDigitValue(char)}")

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
}

fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9') {
        throw IllegalArgumentException("Out of range")
    }
    return c.toInt() - '0'.toInt()
}
