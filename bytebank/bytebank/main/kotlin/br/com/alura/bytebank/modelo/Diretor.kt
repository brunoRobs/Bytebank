package br.com.alura.bytebank.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdmin(nome, cpf, salario, senha) {

    override val bonificacao: Double get() = (salario * 0.3) + salario + plr

}