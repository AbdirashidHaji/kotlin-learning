fun main() {
    println(birthdayGreetings( "Abdirahman",20))
}

fun birthdayGreetings( name: String, age: Int): String {
    val nameOfGreeting = "You are $name"
    val ageOfGreeting = "You are $age Years old"

    return "${nameOfGreeting}\n${ageOfGreeting}\n"
}

