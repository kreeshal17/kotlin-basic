//write the code to check weather the number is palindrone or not
private fun palindrone(c:Int)
{
    var a=c;
    val temp=c
    var r:Int
    var sum=0

    while(a>0)
    {
        r=a%10
        sum=sum*10+r
        a=a/10

    }
    if(sum==temp)
    {
        print("$a is palindrone")
    }
    else{
        print("$a is not palindrone")
    }
}



fun main()
{
    palindrone(232)
    palindrone(2321)

}