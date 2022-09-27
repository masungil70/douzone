package ch06.exam.ex20;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		Account [] array = new Account[100];
		int accountSize = 0;
		
		while (run) {
			printMainMenu();
			switch (choiceMenu(scanner)) {
			case 1:
				//객체를 생성하여 배열에 추가한다 
				array[accountSize++] = createAccount(scanner);
				break;
			case 2:
				printAccounts(array, accountSize);
				break;
			case 3:
			{
				String account;
				int    balance;
				
				System.out.println("--------");
				System.out.println("예금");
				System.out.println("--------");
				
				System.out.println("계좌번호 : ");
				account = scanner.nextLine();
				System.out.println("입금액 : ");
				balance = Integer.parseInt(scanner.nextLine());
				
				for (int i=0;i<accountSize;i++) {
					//if (array[i].getAccount().equals(account)) {
					if (array[i].isEqualAccount(account)) {
						array[i].plusBalance(balance);
					}
				}
				
			}
				break;
			case 4:
				break;
			case 5:
				run = false;
				break;
			}
			
		}

		System.out.println("프로그램 종료");
		scanner.close();
	}

	private static void printMainMenu() {
		System.out.println("-----------------------------------------------------");
		System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4.출금 | 5.종료");
		System.out.println("-----------------------------------------------------");
		System.out.print("선택: ");
	}
	
	private static int choiceMenu(Scanner scanner) {
		String strCmd = scanner.nextLine();   
		return Integer.parseInt(strCmd);  
	}
	
	private static Account createAccount(Scanner scanner) {
		String account;
		String name;
		int    balance;
		
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		System.out.println("계좌번호 : ");
		account = scanner.nextLine();
		System.out.println("계좌주 : ");
		name = scanner.nextLine();
		System.out.println("초기입금액 : ");
		balance = Integer.parseInt(scanner.nextLine());
		//객체를 생성하여 배열에 추가한다 
		return new Account(account, name, balance);
	}
	
	private static void printAccounts(Account[] array, int accountSize) {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		for (int i=0;i<accountSize;i++) {
			array[i].print();
		}
		
	}
}
