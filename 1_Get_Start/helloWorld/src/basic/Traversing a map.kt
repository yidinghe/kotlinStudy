package basic

/**
 * Created by yidinghe on 9/1/16.
 */

fun main(args: Array<String>) {
    val map = hashMapOf<String, Int>("one" to 1, "three" to 3)
    map.put("two", 2)

    for ((key, value) in map) {
        println("key is $key, /$ value is $value")
    }
}