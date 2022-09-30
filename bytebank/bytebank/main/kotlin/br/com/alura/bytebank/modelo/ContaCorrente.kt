package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.Exception.FalhaAutenticacaoException
import br.com.alura.bytebank.Exception.SaldoInsuficienteException
import br.com.alura.bytebank.Exception.ValorInvalidoException
import java.lang.Exception

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(titular, numero) {

    override fun sacar(valor: Double, senha: Int) {
        if (!autenticar(senha)) {
            throw FalhaAutenticacaoException()
        }
        if (valor <= 0.0) {
            throw ValorInvalidoException()
        }
        val valorComTaxa: Double = valor + 0.1
        if (valorComTaxa > this.saldo) {
            throw SaldoInsuficienteException()
        }
        this.saldo -= valorComTaxa
    }

}