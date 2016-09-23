package ch03.MakingYourCodeTidyLocalFunctionsAndExtensions1

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {

    fun validate(user: User,
                 value: String,
                 fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                    "Cannot save user ${user.id}: $fieldName is empty")
        }
    }

    validate(user, user.name, "Name")
    validate(user, user.address, "Address")

    // Save user to the database
}


fun main(args: Array<String>) {
    val person = Person(1, "", "")
    savePerson(person)
    person.validatePerson2()
}

data class Person(val id: Int, val name: String, val address: String)

fun savePerson(person: Person) {

    fun validatePerson(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("cannot save person ${person.id}, $fieldName is Empty")
        }
    }

    validatePerson(person.name, "name")
    validatePerson(person.address, "address")
}

fun Person.validatePerson2() = {

    fun validate(value: String, fieldName: String){
        if (value.isNullOrEmpty())
            throw IllegalArgumentException("cannot save person ${this.id}, $fieldName is Empty")
    }

    validate(this.name, "name")
    validate(this.address, "address")
}