package exercicio2

fun main() {
    val coca1 = coca(2, 8.80)
    val coca2 = coca(2, 9.50)


    println("Validação: ")
    println(coca1 == coca2)
    println("--------------------------")
    println("Dados Completos: ")
    println(coca1.toString())
    println(coca2.toString())
    println("--------------------------")
    println("Tamanho em (L)")
    println(coca1.hashCode())
    println(coca2.hashCode())

}