fun main() {
    val k= listOf("kr","is","shal")
    println(k)
    val kr= mutableListOf("kr","eesh") //to make it mutable hehe
    println(kr+ " ");
    println(k.size)//for the size of list hehe
    kr.add("ram")
    print(kr);
    val kp="apple";
    println(kp.isEmpty())
    val a="kreeshal"
    println("the string  name is $a" )
    //loop of kotlin
    for (x in k)
    {
        print(x+ " ")
    }
    //for printing number what we have to do ?
    for (i in 1..5)
    {
        println(i);
    }
    //if we dont want to include 5 then
    for(i in 1 until 5)
    {
        print(i)
    }
}