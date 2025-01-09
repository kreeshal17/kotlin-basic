fun main()
{
    val arr=IntArray(5)
    for( i in arr.indices)
    {
        var c=i+1
        print("enter the element[$c]")
        arr[i]= readln().toInt()

    }
    for(i in arr)
    {
        println(i)
    }

}