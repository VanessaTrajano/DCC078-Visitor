package org.example;

public class ContaSalario implements ContaBancaria {

    private int numeroConta;
    private String titular;
    private String cnpjEmpregador;

    public ContaSalario(int numeroConta, String titular, String cnpjEmpregador) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.cnpjEmpregador = cnpjEmpregador;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public String getCnpjEmpregador() {
        return cnpjEmpregador;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirContaSalario(this);
    }
}
