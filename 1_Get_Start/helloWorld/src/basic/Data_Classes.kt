package basic

/**
 * Created by yidinghe on 9/1/16.
 */


data class User(val name: String, var id: Int)


fun getUser(): User {
    return User("heyidingdingding", 123456)
}

fun main(args: Array<String>){
    val user: User = getUser()

    println("user: $user")
    user.id = 654321
    println("user: $user")


    val user2 = User("Alex", 1)
    println(user) // toString()

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user2 == secondUser: ${user2 == secondUser}")
    println("user2 == thirdUser: ${user2 == thirdUser}")

    // copy() function
    println(user2.copy())
    println(user2.copy("Max"))
    println(user2.copy(id = 2))
    println(user2.copy("Max", 2))
}