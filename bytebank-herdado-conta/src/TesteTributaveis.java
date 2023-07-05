public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(222, 222);
        contaCorrente.deposita(100.00);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();

        calculadorDeImposto.registra(contaCorrente);
        calculadorDeImposto.registra(seguroDeVida);

        System.out.println(calculadorDeImposto.getTotalImposto());
    }
}
