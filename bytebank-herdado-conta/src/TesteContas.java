public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(111, 111);
        contaCorrente.deposita(100.00);

        ContaPoupanca contaPoupanca = new ContaPoupanca(222, 222);
        contaPoupanca.deposita(200.00);

        contaCorrente.transfere(10.00, contaPoupanca);
        System.out.println("Conta corrente: " + contaCorrente.getSaldo());
        System.out.println("Conta poupanca: " + contaPoupanca.getSaldo());
    }
}
