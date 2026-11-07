package org.example;

public interface Visitor {
    String exibirContaCorrente(ContaCorrente contaCorrente);
    String exibirContaPoupanca(ContaPoupanca contaPoupanca);
    String exibirContaSalario(ContaSalario contaSalario);
}
