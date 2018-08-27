package BankingExeptions;

public class BankingExeptions extends Exception{
	
	private static final long serialVersionUID = 2426072236980664768L;

	public BankingExeptions() {
		super();
	}
	
	public BankingExeptions(String message) {
		super(message);
	}
}
