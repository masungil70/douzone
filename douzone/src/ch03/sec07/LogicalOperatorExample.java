package ch03.sec07;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A';
		//int charCode = 'a';
		//int charCode = '5';

		if( (65<=charCode) & (charCode<=90) ) {
			System.out.println("대문자이군요.");
		}
			
		if( (97<=charCode) && (charCode<=122) ) {
			System.out.println("소문자이군요.");
		}

		if( (48<=charCode) && (charCode<=57) ) {
			System.out.println("0~9 숫자이군요.");
		}
		
		//----------------------------------------------------------

		int value = 6;
		//int value = 7;
			
		if( (value%2==0) | (value%3==0) ) {
			System.out.println("2 또는 3의 배수이군요.");
		}

		boolean result = (value%2==0) || (value%3==0);
		if( !result ) {
			System.out.println("2 또는 3의 배수가 아니군요.");
		}
	}
}