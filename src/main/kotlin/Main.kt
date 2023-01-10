fun List<Int>.filter():List<Int>{
    return filter{it: Int -> it<100}
}
fun main(){

    val myList = listOf(1,5,8,65,553,24,800,650,70,48)
    myList.filter().forEach { it -> println(it) }

}

