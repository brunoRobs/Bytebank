package br.com.alura.bytebank.Exception

class SaldoInsuficienteException(
    mensagem: String = "Saldo insuficiente"
) : Exception(mensagem)