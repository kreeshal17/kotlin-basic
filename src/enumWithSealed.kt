enum class Gender(val number:Int)
{
    Male(166),
    female(33),
    other(44)

}
 sealed class School
 {
     data class six(val gender:Gender,val marks:Int):School()
     data class  seven(val gender:Gender,val marks:Int):School()
     data class eight(val gender:Gender,val marks:Int):School()
 }
fun main()
{
    val k:School=School.six(Gender.Male,55)
    val l:School=School.seven(Gender.female,12)
    val m:School=School.eight(Gender.other,45)
    //when
    val list= listOf(k,l,m)
    for(k in list)
    {
    val increased=when(k)
    {
        is School.eight -> "${k.marks*5} was scored by ${k.gender} gender of eignt class"
        is School.seven -> k.marks*2
        is School.six -> k.marks*5
    }
    println(increased)
}}