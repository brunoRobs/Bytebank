package br.com.alura.bytebank.modelo

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(titular, numero) {

    override fun sacar(valor: Double): Boolean {
        if (this.saldo >= valor && valor > 0.0) {
            this.saldo -= valor
            return true
        }
        return false
    }

    override fun transferir(valor: Double, conta: Conta): Boolean {
        if (sacar(valor)) {
            conta.depositar(valor)
            return true
        }
        return false
    }

}