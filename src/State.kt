fun main() {
    val day = "Monday"
    val dayOfWeek = when (day) {
        "Monday" -> "Monday"
        "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday"
        "Saturday", "Sunday" -> "Weekend"
        else -> "Invalid day"
    }

    println(dayOfWeek)
}
