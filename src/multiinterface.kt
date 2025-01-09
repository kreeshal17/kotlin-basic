interface Fatha {
    fun height() {
        println("We are the tallest man")
    }
}

interface Motherr {
    fun discipline() {
        println("We have the best discipline than others")
    }
}

class Sonn : Fatha, Motherr {
    fun play() {
        println("I am the GenZ")
    }
}

fun main() {
    val s = Sonn()
    s.play()
    s.discipline()
s.height()//
}
