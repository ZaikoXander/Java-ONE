public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;
    String cpf;
    String profissao;


    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        boolean saldoEhSuficiente = this.saldo >= valor;
        if (saldoEhSuficiente) {
            this.saldo -= valor;
            return true;
        }

        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        boolean saldoEhSuficiente = this.saldo >= valor;
        if (saldoEhSuficiente) {
            this.saca(valor);
            destino.deposita(valor);
            return true;
        }

        return false;
    }
}
