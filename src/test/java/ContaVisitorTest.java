import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaVisitorTest {

    @Test
    void deveExibirContaCorrente() {
        ContaCorrente conta = new ContaCorrente(101, "Carlos", 1500.0, "001");

        ContaVisitor visitor = new ContaVisitor();
        assertEquals("ContaCorrente{numeroConta=101, titular='Carlos', limiteChequeEspecial=1500.0, agencia=001}", visitor.exibir(conta));
    }

    @Test
    void deveExibirContaPoupanca() {
        ContaPoupanca conta = new ContaPoupanca(202, "Mariana", 0.005);

        ContaVisitor visitor = new ContaVisitor();
        assertEquals("ContaPoupanca{numeroConta=202, titular='Mariana', rendimentoMensal=0.005}", visitor.exibir(conta));
    }

    @Test
    void deveExibirContaSalario() {
        ContaSalario conta = new ContaSalario(303, "Lucas", "12.345.678/0001-99");

        ContaVisitor visitor = new ContaVisitor();
        assertEquals("ContaSalario{numeroConta=303, titular='Lucas', cnpjEmpregador='12.345.678/0001-99'}", visitor.exibir(conta));
    }
}