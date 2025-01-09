open class father()
{
    fun height()
    {
        println("father is 6.5 ft taller")
    }

}
open class mother()
{
    fun cook()
    {
        println("mother can cook food well")
    }
}
class son :father(){
    fun play()
    {
        println("son can play football")
    }
}


fun main()
{
     val c1= father()
    val c2= mother()
    val c3= son()
    c3.play()
   
    c3.height()




}