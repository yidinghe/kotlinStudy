package ch03.MakingYourCodeTidyLocalFunctionsAndExtensions

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException(
            "Cannot save user ${user.id}: Name is empty")
    }

    if (user.address.isEmpty()) {
        throw IllegalArgumentException(
            "Cannot save user ${user.id}: Address is empty")
    }

    // Save user to the database
}

fun main(args: Array<String>) {
    saveUser(User(1, "", ""))
}
