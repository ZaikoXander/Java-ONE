public class Admninistrador extends Funcionario implements Autenticavel {
    private AutenticacaoUtil autenticacaoUtil;

    public Admninistrador() {
        this.autenticacaoUtil = new AutenticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        return 50;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticacaoUtil.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticacaoUtil.autentica(senha);
    }
}
