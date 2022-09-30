package br.com.alura.bytebank.Exception

class ValorInvalidoException(
    mensagem: String = "Valor invalido para a operacao"
) : Exception(mensagem)