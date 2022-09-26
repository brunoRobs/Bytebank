package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Conta

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(titular, numero) {

    override fun sacar(valor: Double): Boolean {
        val valorComTaxa: Double = valor + 0.1
        if (this.saldo >= valorComTaxa && valor > 0.0) {
            this.saldo -= valorComTaxa
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