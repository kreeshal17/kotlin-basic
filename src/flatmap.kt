fun main()
{
    val a= listOf(1,2,3,4,8,9,10)

    val ans= a.flatMap { (1..it).toList() }
    println(ans)


    val b= listOf("apple","ball","cow")
    val ans2= b.flatMap { it.toList()}
    println(ans2)
}
