package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.FuncionarioAdmin

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(nome, cpf, salario, senha) {

    override val bonificacao: Double get() = (salario * 0.2) + salario

}