data class Carchoice(val  name:String,val year:Int)
{
    fun play()
    {
        println("huehue we did  it")
    }
}
fun main()
{
    var c =Carchoice("kreeshalbabita",1122)
    println(c)
    c.play()
}