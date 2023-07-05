public class Conta {
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;

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

    public double getSaldo() {
        return this.saldo;
    }
}
