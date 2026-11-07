package org.example;

public class ContaPoupanca implements ContaBancaria {

    private int numeroConta;
    private String titular;
    private double rendimentoMensal;

    public ContaPoupanca(int numeroConta, String titular, double rendimentoMensal) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.rendimentoMensal = rendimentoMensal;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getRendimentoMensal() {
        return rendimentoMensal;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirContaPoupanca(this);
    }
}
