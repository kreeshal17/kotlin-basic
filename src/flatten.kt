fun main ( ){
    val nestedlist= listOf(
        listOf(1,3,5,7,9 ),
        listOf(2,4,6,8,10 ),
        listOf(20,30,40,50 )
    )
   val ans= nestedlist.flatten()
    print(ans)
}