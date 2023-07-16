fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {
    val stack = mutableStackOf<Double>(0.62, 3.14, 2.7)
    println(stack)
}