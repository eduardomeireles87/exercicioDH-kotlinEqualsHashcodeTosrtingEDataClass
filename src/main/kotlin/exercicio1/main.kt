package exercicio1

fun main() {
    val pessoa1 = pessoa("Eduardo",43942 )
    val pessoa2 = pessoa("Ricardo", 34942)

    println("Validação: ")
    println(pessoa1 == pessoa2)
    //sem a sobrescrita do método equals, a resposta era "false"
    //com a sobrescrita, a resposta ficou "true"
    println("----------------")
    println("Dados Completos: ")
    println(pessoa1)
    println(pessoa2)
    println("----------------")
    println("Numero do RG: ")
    println(pessoa1.hashCode())
    println(pessoa2.hashCode())
}