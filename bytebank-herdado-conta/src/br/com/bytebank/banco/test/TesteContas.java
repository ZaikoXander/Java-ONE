package br.com.bytebank.banco.test;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaEspecial contaEspecial = new ContaEspecial(123, 5555);
//        contaEspecial.saldo; não tem acesso

//        int a = 3;
//        int b = a / 0;

//        ContaCorrente outra = null;
//        outra.deposita(200.00);

        ContaCorrente contaCorrente = new ContaCorrente(111, 111);
        contaCorrente.deposita(100.00);

        ContaPoupanca contaPoupanca = new ContaPoupanca(222, 222);
        contaPoupanca.deposita(200.00);

        contaCorrente.transfere(10.00, contaPoupanca);
        System.out.println("br.com.bytebank.banco.modelo.Conta corrente: " + contaCorrente.getSaldo());
        System.out.println("br.com.bytebank.banco.modelo.Conta poupanca: " + contaPoupanca.getSaldo());
    }
}
