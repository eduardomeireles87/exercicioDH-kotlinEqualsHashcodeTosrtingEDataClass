package exercicio3

fun main() {
    val pessoa1 = pessoa("Eduardo", 362521)
    val pessoa2 = pessoa("Eduardo", 362521)

    println("=== Pessoa 01 ===")
    println("$pessoa1 + ${pessoa1.hashCode()}")
    println("=== Pessoa 02 ===")
    println("$pessoa2 + ${pessoa2.hashCode()}")
    println("=== Equals ===")
    println(pessoa1 == pessoa2)

}