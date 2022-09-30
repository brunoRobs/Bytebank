package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.Exception.FalhaAutenticacaoException
import br.com.alura.bytebank.Exception.SaldoInsuficienteException
import br.com.alura.bytebank.Exception.ValorInvalidoException
import java.lang.Exception

abstract class Conta(
    val titular: Cliente,
    val numero: Int
) : Autenticavel {

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

    abstract fun sacar(valor: Double, senha: Int)

    fun depositar(valor: Double) {
        if (valor <= 0.0) {
            throw ValorInvalidoException()
        }
        this.saldo += valor
    }

    fun transferir(valor: Double, conta: Conta, senha: Int) {
        if (!autenticar(senha)) {
            throw FalhaAutenticacaoException()
        }
        if (valor > saldo) {
            throw SaldoInsuficienteException()
        }
        if (valor == 0.0) {
            throw ValorInvalidoException()
        }
        saldo -= valor
        conta.saldo += valor
    }

    override fun autenticar(senha: Int): Boolean {
        return titular.autenticar(senha)
    }

}