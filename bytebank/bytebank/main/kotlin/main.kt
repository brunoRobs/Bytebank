class Conta(private val titular: String, private val numero: Int) {

    var saldo: Double = 0.0
        private set

    fun accountInfos() {
        println("Account holder: " + titular)
        println("Account number: " + numero)
        println("Account balance: " + saldo)
    }

    fun sacar(valor: Double): Boolean {
        if (this.saldo >= valor && valor > 0.0) {
            this.saldo -= valor
            return true
        }
        return false
    }

    fun depositar(valor: Double) {
        if (valor > 0.0) {
            this.saldo += valor
        }
    }

    fun transferir(valor: Double, conta: Conta) {
        if (sacar(valor)) {
            conta.depositar(valor)
        }
    }
}
