package ch11.sec02;

import java.io.FileInputStream;
import java.io.IOException;

class AccountException extends Exception {
	public AccountException(String msg) {
		super(msg);
	}
}

public class Account {
	private long balance;
	
	public Account(long balance) {
		this.balance = balance;
	}

	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) throws AccountException {
		if (money < 0) throw new AccountException("입금 금액("+money+")은 음수가 될수 없습니다");
		balance += money;
	}
	
	public void withdraw(int money)  throws AccountException  {
		if (money < 0) throw new AccountException("출금 금액("+money+")은 음수가 될 수 없습니다");;
		if (money > balance) throw new AccountException("출금 금액("+money+")은 잔고보다 클수 없습니다");;
		balance -= money;
	}
	
	public static void main(String [] args)  {
		Account account = new Account(1000000);
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("");
			fis.read();
			
			Class.forName("");
			//account.deposit(-1000);
			account.deposit(1000);
			//account.withdraw(-1000);
			//account.withdraw(2000000);
			account.withdraw(100000);
		} catch (AccountException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//반드시 실행되는 부분 
			System.out.println("잔고 = " + account.getBalance());
			System.out.println("반드시 실행되는 부분");
		}
	}
}
