interface Father{
    fun techmanner() //abstract method
    fun intell()
    {
        println("intelligence gain form father")
    }
}
class Son:Father{
    override fun techmanner()
    {
        println("learned some manner from father")
    }
    fun sonn()
    {
        println("son can play better football")
    }


}
fun main()
{
    val c= Son()
    c.sonn()
    c.techmanner()
    c.intell()

}