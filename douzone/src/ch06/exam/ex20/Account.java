package ch06.exam.ex20;

public class Account {
	private String account;
	private String name;
	private int    balance;
	
	public Account(String account, String name, int balance) {
		super();
		this.account = account;
		this.name = name;
		this.balance = balance;
	}

	public void print() {
		System.out.println(account + "\t" + name + "\t" + balance);
	}

	public String getAccount() {
		return account;
	}

	public void plusBalance(int balance) {
		if (0 > balance) return;
		this.balance += balance;
	}
	
	public boolean isEqualAccount(String account) {
		return this.account.equals(account);
	}
}
