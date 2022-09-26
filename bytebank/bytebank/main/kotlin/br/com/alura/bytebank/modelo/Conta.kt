package br.com.alura.bytebank.modelo

abstract class Conta(
    val titular: Cliente,
    val numero: Int
) {

    var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        print("Criando conta")
        total++
    }

    abstract fun sacar(valor: Double): Boolean

    fun depositar(valor: Double) {
        if (valor > 0.0) {
            this.saldo += valor
        }
    }

    abstract fun transferir(valor: Double, conta: Conta): Boolean
}