package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.Exception.FalhaAutenticacaoException
import br.com.alura.bytebank.Exception.SaldoInsuficienteException
import br.com.alura.bytebank.Exception.ValorInvalidoException

class ContaPoupanca(
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
        if (valor > this.saldo) {
            throw SaldoInsuficienteException()
        }
        this.saldo -= valor
    }

}