// new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
        double valorASacar = valor + .2;
        super.saca(valorASacar);
    }

    @Override
    public double getValorImposto() {
        return super.saldo * .01;
    }
}
