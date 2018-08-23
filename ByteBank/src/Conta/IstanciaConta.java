package Conta;

public class IstanciaConta {
	public static void main(String[] args) {
		Conta novaConta = new Conta();
		novaConta.deposita(0);
		System.out.println(novaConta.getSaldo());
	}
}
