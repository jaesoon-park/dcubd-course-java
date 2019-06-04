package ch10;

public class BalanceInsufficienException extends Exception{
	public BalanceInsufficienException() { }
	public BalanceInsufficienException(String message) {
		super(message);
		
	}
}
