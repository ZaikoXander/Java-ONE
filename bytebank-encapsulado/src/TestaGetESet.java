public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        System.out.println(conta.getNumero());

        Cliente alex = new Cliente();

        // conta.titular = alex;

        alex.setNome("Alex Daniel");

        conta.setTitular(alex);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");
        // agora em duas linhas:
        Cliente titularDaConta =  conta.getTitular();
        titularDaConta.setProfissao("programador");

        System.out.println(titularDaConta);
        System.out.println(alex);
        System.out.println(conta.getTitular());
    }
}
