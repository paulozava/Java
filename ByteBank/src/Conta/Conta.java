package Conta;

public class Conta {
	double saldo;
	int agencia;
	int conta;
	String titular;
	
	public Conta() {
	}
	
	public Conta(String titularConta) {
		this.titular = titularConta;
	}
	
	public boolean deposita(double valor) {
		this.saldo += valor;
		return true;
	}
	
	public boolean saca (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transfere(Conta beneficiario, double valor) {
		Boolean deuCerto = this.saca(valor);
		if (deuCerto) {
			beneficiario.deposita(valor);
		}
		return deuCerto;
	}

}
