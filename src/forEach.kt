fun main() {
    val apple = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    apple.forEach { print(it.toString() + "\t") }
    println()
    apple.forEach { print("$it" + "\t ") }
    println()
    apple.forEach { print(it) }
    println()
    apple.forEach { i:Int-> print(i*5) }
}
