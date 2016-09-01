package basic

/**
 * Created by yidinghe on 9/1/16.
 */

data class Agent(val map: Map<String, Any?>){
    val name: String by map
    val age: Int by map
}

fun main(args: Array<String>) {
    val agent = Agent(mapOf("name" to "heyidingdingding", "age" to 25))
    println(agent)
}

