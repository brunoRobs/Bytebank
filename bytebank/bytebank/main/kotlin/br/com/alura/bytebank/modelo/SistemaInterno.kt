package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.FuncionarioAdmin

class SistemaInterno {

    fun entrar(admin: FuncionarioAdmin, senha: Int) {
        if (admin.autenticar(senha)) {
            println("Bem vindo ao Bytebank, ${admin.nome}")
        } else {
            println("Falha na autenticação.")
        }
    }

}