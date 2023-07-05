public class Teste {
    public static void main(String[] args) {
        Prioridade prioridadeMinima = Prioridade.MIN;
        Prioridade prioridadeMaxima = Prioridade.MAX;
        Prioridade prioridadeNormal = Prioridade.NORMAL;

        System.out.println(prioridadeMinima.name());
        System.out.println(prioridadeNormal.name());
        System.out.println(prioridadeMaxima.name());

        System.out.println(prioridadeMinima.ordinal());
        System.out.println(prioridadeNormal.ordinal());
        System.out.println(prioridadeMaxima.ordinal());

        System.out.println(prioridadeMinima.getValor());
        System.out.println(prioridadeNormal.getValor());
        System.out.println(prioridadeMaxima.getValor());

        System.out.println(Thread.State.NEW);
    }
}
