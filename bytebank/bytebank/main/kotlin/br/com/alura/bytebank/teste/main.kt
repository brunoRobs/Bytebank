import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.Endereco

fun main() {
    println("Bem vindo ao Bytebank")

    val bruno = ContaCorrente(
        Cliente(
            "Bruno",
            "00000000000",
            Endereco("", 0, "", "", "", "", ""),
            0
        ), 1
    )

    bruno.depositar(100.0)

    println(bruno)
}
