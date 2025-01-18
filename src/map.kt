fun  main()
{
    val la= listOf(1,2,3,4,5,6,7,8,9,10)
    val ans= la.map { it*5 }
    println(ans)
    val ans2=la.map (::mult)
    println(ans2)
}


fun mult(n:Int):Int
{
    if (n%2==0)
    {
        return n*5
    }
        else{
            return n*2
    }
}