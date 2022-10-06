package ch11.sec01;

public class Account {
	private long balance;
	
	public Account(long balance) {
		this.balance = balance;
	}

	public long getBalance() {
		return balance;
	}
	
	public boolean deposit(int money) {
		if (money < 0) return false;
		balance += money;
		return true;
	}
	
	public boolean withdraw(int money) {
		if (money < 0) return false;
		if (money > balance) return false;
		balance -= money;
		return true;
	}
	
	public static void main(String [] args) {
		Account account = new Account(1000000);
		
		if (false == account.deposit(-1000)) {
			System.out.println("-1000원 입금 실패");
		}
		
		if (false == account.withdraw(-1000)) {
			System.out.println("-1000원 출금 실패");
		}
		if (false == account.withdraw(2000000)) {
			System.out.println("2000000원 출금 실패");
		}
		if (false == account.withdraw(100000)) {
			System.out.println("100000원 출금 실패");
		} else {
			System.out.println("100000원 출금 성공");
		}
	}
}
