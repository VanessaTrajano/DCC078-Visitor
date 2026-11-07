package org.example;

public class ContaCorrente implements ContaBancaria {

    private int numeroConta;
    private String titular;
    private double limiteChequeEspecial;
    private String agencia;

    public ContaCorrente(int numeroConta, String titular, double limiteChequeEspecial, String agencia) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public String getNumeroAgencia() {
        return this.agencia;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirContaCorrente(this);
    }
}
