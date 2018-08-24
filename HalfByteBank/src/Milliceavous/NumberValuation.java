package Milliceavous;

public class NumberValuation {
	private int number;
	private int verificationCode;
	
	public NumberValuation(int number, int verificationCode) {
		this.setNumber(number);
		this.setVerificationCode(verificationCode);
	}
	
	public boolean evaluate() {
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(int verificationCode) {
		this.verificationCode = verificationCode;
	}
}
