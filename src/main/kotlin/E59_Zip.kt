fun main() {

    val A = listOf<String>("a", "b", "c")                  // 1
    val B = listOf<Int>(1, 2, 3, 4)                     // 1

    val resultPairs: List<Pair<String, Int>> = A zip B                      // 2
    val resultReduce = A.zip(B) { a, b -> "$a$b" } // 3

    println("A zip B: $resultPairs")
    println("\$A\$B: $resultReduce")
}