class Conta(private val titular: String, private val numeroDaConta: Int) {

    var saldo: Double = 0.0
        private set

    fun dadosDaConta() {
        println("Titular: " + titular)
        println("Numero da conta: " + numeroDaConta)
        println("Saldo: " + saldo)
    }

    fun saque(valor: Double): Boolean {
        if (this.saldo >= valor && valor > 0.0) {
            this.saldo -= valor
            // println("Saque realizado")
            return true
        }
        // println("Falha no saque: valor invalido")
        return false
    }

    fun deposito(valor: Double) {
        if (valor > 0.0) {
            this.saldo += valor
            // println("Deposito realizado")
        }
        // println("Falha no deposito: valor invalido")
    }

    fun transferencia(valor: Double, destinatario: Conta?) {
        if (destinatario != null) {
            if (saque(valor)) {
                destinatario.deposito(valor)
                //println("Transferencia realizada")
            }
            //println("Falha na transferencia")
        }
    }
}

fun main() {
    println("Bem vindo ao Bytebank")
    val minhaConta = Conta("Bruno Roberto", 2077)
}