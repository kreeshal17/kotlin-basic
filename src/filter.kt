fun main() {




    val kree= listOf(1,2,3,6,7,8,77,8,8,999,8888,9999,100,9)
    val ans= kree.filter { it%2==0 }
    println(ans)
    val babi= listOf("kree","shal","karna","babi","ta","adhkari")
    val ans2= babi.filter { it.length>6 }
    println(ans2)
    val ans3=kree.filter (::isEven )
    //if we are not working with lamda expression we dont need curly braces
    val ans4=kree.filter { isEven(it) }
    println(ans3)
    println(ans4)

//here it is a lambda function whichg doesnot need to use -> hehe let me show you how can we directly pass the function also instead of writing the condition there

}

fun isEven (n:Int):Boolean
{
   return n%2==0&&n>10

}