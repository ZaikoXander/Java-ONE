public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente alex = new Gerente();

        alex.setNome("Alex Daniel");
        alex.setCpf("222222222-2");
        alex.setSalario(2300.00);

        System.out.println(alex.getNome());
        System.out.println(alex.getBonificacao());

        // alex.salario = 300.00;
    }
}
