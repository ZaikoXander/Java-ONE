public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoAlex = new Conta();
        contaDoAlex.saldo = 100;
        contaDoAlex.deposita(50);

        System.out.println(contaDoAlex.saldo);

        boolean conseguiuSacar = contaDoAlex.saca(20);
        System.out.println(contaDoAlex.saldo);
        System.out.println(conseguiuSacar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        boolean sucessoTransferencia = contaDaMarcela.transfere(3000, contaDoAlex);
        if (sucessoTransferencia) {
            System.out.println("transferencia feita com sucesso");
        } else {
            System.out.println("faltou dinheiro");
        }
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoAlex.saldo);

        contaDoAlex.titular = "alex Daniel";
        System.out.println(contaDoAlex.titular);


    }
}
