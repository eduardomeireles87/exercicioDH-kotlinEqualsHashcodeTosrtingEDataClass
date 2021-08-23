package exercicio1

class pessoa (var nome: String, var rg: Int) {

    override fun equals(other: Any?): Boolean {
        return (other is pessoa && other.rg == this.rg)
    }

    override fun toString(): String {
        return "Nome: $nome  // RG: $rg"
    }

    override fun hashCode(): Int {
        return this.rg
    }
}