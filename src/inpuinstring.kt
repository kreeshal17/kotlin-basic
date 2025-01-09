fun main()
{
    val arr=Array(5){" "}
    for (i in arr.indices)
    {
        val c=i+1
        println("enter the element[$c] ")
        arr[i]= readln()
    }
    println("the ans is")
    for (i in arr)
    {
        println(i)
    }
}