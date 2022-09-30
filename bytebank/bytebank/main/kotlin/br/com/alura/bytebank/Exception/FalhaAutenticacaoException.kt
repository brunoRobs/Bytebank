package br.com.alura.bytebank.Exception

class FalhaAutenticacaoException(
    mensagem: String = "Falha na autenticacao"
) : Exception(mensagem)