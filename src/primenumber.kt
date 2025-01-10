fun checkprime(n:Int):Boolean{

if (n<=1) return false
    for(i in 2 until n )
    {
        if(n%i==0) return false

    }








return true
}




fun main()
{
    var count=0;

    val arr=IntArray(5)
    for( i in arr.indices)
    {
        var c=i+1;
        println("enter the first elemennt[$c] ")
        arr[i]= readln().toInt()
    }
    for (x in arr)
    {
        if(checkprime(x))
        {
            print("the number is $x")
            count++;
        }

    }
    println()
    println(count )

}