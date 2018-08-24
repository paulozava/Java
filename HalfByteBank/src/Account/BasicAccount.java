package Account;

import BankingExeptions.NegativeValueException;
import BankingExeptions.NotEnouthBalanceException;
import Client.Client;

public abstract class BasicAccount {

	private int accountNumber;
	private int verificationOfNumber;	
	private int bankAgency;
	private int verificationOfAgency;
	private double balance;
	Client client;

	public boolean withdraw(double value) throws Exception {
		if (value <= 0) {
			throw new NegativeValueException();
		} else if(this.getBalance() < value) {
			throw new NotEnouthBalanceException();
		}
		this.balance -= value;
		return true;
	}
	
	public boolean deposit(double value) throws Exception {
		if (value <= 0) {
			throw new NegativeValueException();
		}
		this.balance += value;
		return true;
	}

	public boolean transfer(double value, BasicAccount target) {
		try {
			this.withdraw(value);
			target.deposit(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public double getBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getBankAgency() {
		return bankAgency;
	}

	public int getVerificationOfNumber() {
		return verificationOfNumber;
	}

	public int getVerificationOfAgency() {
		return verificationOfAgency;
	}
}
