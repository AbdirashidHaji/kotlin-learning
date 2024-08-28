
enum class Difficulty {
    EASY, MEDIUM, HARD, NoOption
}


data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)
fun main() {
    val question1 =Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 =Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 =Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    val question4 =Question<Int>("How Many Cities Are In Kenya?",9, Difficulty.NoOption)

    println(question1.toString())
}