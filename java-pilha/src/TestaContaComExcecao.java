public class TestaContaComExcecao {
	public static void main(String[] args) {
		Conta conta = new Conta();
		try {
			conta.deposita();
		} catch (MinhaExcecao ex) {
			System.out.println("tratamento...");
		}
	}
}
