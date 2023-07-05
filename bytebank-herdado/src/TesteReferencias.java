public class TesteReferencias {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        gerente.setNome("Marcos");
        gerente.setSalario(5000.00);

        EditorVideo editorVideo = new EditorVideo();
        editorVideo.setSalario(2500.00);

        Designer designer = new Designer();
        designer.setSalario(2000.00);

        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.registra(gerente);
        controleBonificacao.registra(editorVideo);
        controleBonificacao.registra(designer);

        System.out.println(controleBonificacao.getSoma());
    }
}
