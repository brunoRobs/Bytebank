import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.Endereco

fun main() {
    println("Bem vindo ao Bytebank")

    val bruno = ContaCorrente(
        Cliente(
            "Bruno",
            "13610895470",
            Endereco("Avenida", 1539, "Janga", "Paulista", "Pernambuco", "53439000", "Apt 401"),
            210601
        ), 1
    )

    bruno.depositar(100.0)

    println(bruno)
}