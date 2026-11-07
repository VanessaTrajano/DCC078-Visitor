package org.example;

public class ContaVisitor implements Visitor {

    public String exibir(ContaBancaria conta) {
        return conta.aceitar(this);
    }

    @Override
    public String exibirContaCorrente(ContaCorrente contaCorrente) {
        return "ContaCorrente{" +
                "numeroConta=" + contaCorrente.getNumeroConta() +
                ", titular='" + contaCorrente.getTitular() + '\'' +
                ", limiteChequeEspecial=" + contaCorrente.getLimiteChequeEspecial() +
                ", agencia=" + contaCorrente.getNumeroAgencia() +
                '}';
    }

    @Override
    public String exibirContaPoupanca(ContaPoupanca contaPoupanca) {
        return "ContaPoupanca{" +
                "numeroConta=" + contaPoupanca.getNumeroConta() +
                ", titular='" + contaPoupanca.getTitular() + '\'' +
                ", rendimentoMensal=" + contaPoupanca.getRendimentoMensal() +
                '}';
    }

    @Override
    public String exibirContaSalario(ContaSalario contaSalario) {
        return "ContaSalario{" +
                "numeroConta=" + contaSalario.getNumeroConta() +
                ", titular='" + contaSalario.getTitular() + '\'' +
                ", cnpjEmpregador='" + contaSalario.getCnpjEmpregador() + '\'' +
                '}';
    }
}