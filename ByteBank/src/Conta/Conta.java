package Conta;

import Cliente.PessoaFisica;

public class Conta {
	private double saldo;
	private int agencia;
	private int conta;
	PessoaFisica titular;

	public Conta() {
	}

	public Conta(String titular) {
		this.titular = new PessoaFisica();
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public int getConta() {
		return this.conta;
	}

	public boolean deposita(double valor) {
		this.saldo += valor;
		return true;
	}

	public boolean saca(double valor) {
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
