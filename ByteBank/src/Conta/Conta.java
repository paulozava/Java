package Conta;

public class Conta {
	double saldo;
	int agencia;
	int conta;
	String titular;
	
	public boolean deposita(double valor) {
		this.saldo += valor;
		return true;
	}
	
	public boolean saca (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

}
