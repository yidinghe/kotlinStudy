package kotlinaction.ch01

/**
 * Created by yiding on 9/8/2016.
 */

data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    val persons: List<Person> = listOf(Person("heyidingdingding", 27), Person("jingyantangtangtang", 26))

    val oldest: Person? = persons.maxBy { it.age ?: 0 }

    println("The oldest is $oldest")
}