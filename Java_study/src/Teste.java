import java.util.Arrays;
import java.util.List;

public class Teste {

	public static int calculateDigit(String numberString) {
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

	public static void main(String[] args) {
		String basicNumber = "021741191";
		int firstDigit = calculateDigit(basicNumber);
		System.out.println(firstDigit);
		int secondDigit = calculateDigit(basicNumber + firstDigit);
		System.out.println(firstDigit + secondDigit);
	}
	

}
