// contrato autenticavel
    // quem assinar esse contrato, precisa implementar
        // metodo setSenha
        // metodo autentica

public interface Autenticavel {
    void setSenha(int senha);
    boolean autentica(int senha);
}
