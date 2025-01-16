sealed class school{
    data class six(val gender:String,val marks:Int):school()
    data class seven(val gender:String,val marks:Int):school()
    data class eight(val gender:String,val marks:Int):school()

}
fun main()
{
    val t1:school = school.eight("male ", 44)
    val p= when(t1)
    {
        is school.eight -> t1.marks*4
        is school.seven -> t1.marks*2
        is school.six -> t1.marks*5
    }
    print(p)
}