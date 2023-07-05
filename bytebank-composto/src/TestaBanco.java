public class TestaBanco {
    public static void main(String[] args) {
        Cliente alex = new Cliente();
        alex.nome = "Alex Daniel";
        alex.cpf = "222.222.222-22";
        alex.profissao = "programador";

        Conta contaDoAlex = new Conta();
        contaDoAlex.deposita(100);

        // associa o cliente paulo a conta contaDoAlex
        contaDoAlex.titular = alex;
        System.out.println(contaDoAlex.titular.nome);
        System.out.println(contaDoAlex.titular);
        System.out.println(alex);
    }
}
