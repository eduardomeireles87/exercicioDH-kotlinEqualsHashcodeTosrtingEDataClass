package exercicio2

class coca (var tamanho: Int, var preco: Double) {

    override fun equals(other: Any?): Boolean {
        return (other is coca && other.tamanho == this.tamanho)
    }

    override fun toString(): String {
        return "Tamanho da Coca: $tamanho L // Preço: $preco"
    }

    override fun hashCode(): Int {
        return this.tamanho
    }

}