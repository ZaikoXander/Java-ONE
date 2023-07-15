public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {
        int a = 3;
        int b = a / 0;

        ContaCorrente outra = null;
        outra.deposita(200.00);

        ContaCorrente contaCorrente = new ContaCorrente(111, 111);
        contaCorrente.deposita(100.00);

        ContaPoupanca contaPoupanca = new ContaPoupanca(222, 222);
        contaPoupanca.deposita(200.00);

        contaCorrente.transfere(10.00, contaPoupanca);
        System.out.println("Conta corrente: " + contaCorrente.getSaldo());
        System.out.println("Conta poupanca: " + contaPoupanca.getSaldo());
    }
}
