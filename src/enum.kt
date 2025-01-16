enum class Day(val number:Int){
    sunday(1),
    monday(2),
    tuesday(3),thursday(5)
}
fun main()
{
    val day= Day.tuesday.number
    println(day)
}