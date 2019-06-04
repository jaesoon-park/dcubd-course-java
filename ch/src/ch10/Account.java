package ch10;

public class Account {
	private long balance;
	
	public Account() {}
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficienException{
		if(balance < money) {
			throw new BalanceInsufficienException("�ܰ����:"+(money-balance)+" ���ڶ�");
		}
		balance -= money;
	}
}
