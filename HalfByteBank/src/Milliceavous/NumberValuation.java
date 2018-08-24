package Milliceavous;

import java.util.Arrays;
import java.util.List;

public class NumberValuation {
	private int number;
	private int verificationCode;

	public NumberValuation(int number, int verificationCode) {
		this.setNumber(number);
		this.setVerificationCode(verificationCode);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	private int getVerificationCode() {
		return verificationCode;
	}

	private void setVerificationCode(int verificationCode) {
		this.verificationCode = verificationCode;
	}

	private static int obtainADigit(String numberString) {
		int listLen, quotient, verifiedDigid;
		int sum = 0;

		List<String> numberList = Arrays.asList(numberString.split(""));
		listLen = numberList.size() + 1;
		for (String digit : numberList) {
			sum += Integer.parseInt(digit) * listLen;
			listLen--;
		}

		quotient = sum % 11;
		if (quotient < 2) {
			verifiedDigid = 0;
		} else {
			verifiedDigid = 11 - quotient;
		}

		return verifiedDigid;
	}
	
	public int calculateDigit(int numberToCalculate, int numberOfDigits) {
		String numberString = Integer.toString(numberToCalculate);
		String toReturn = "";
		String calculatedDigit;
		int acc=0;
		
		while (acc <= numberOfDigits) {
			calculatedDigit = Integer.toString(obtainADigit(numberString));
			toReturn += calculatedDigit;
			numberString += calculatedDigit;
		}
		
		return Integer.parseInt(toReturn);
		
	}
	
	public boolean validate() {
		int number = this.getNumber();
		int validate = this.getVerificationCode();
		int digits = Integer.toString(number).length();
		int calculatedNumber = calculateDigit(number, digits);
		if (validate == calculatedNumber) {
			return true;
		}
		return false;
		
	}
}