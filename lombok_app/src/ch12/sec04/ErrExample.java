package ch12.sec04;

public class ErrExample {

	public static void main(String[] args) {
		try {
			String str = null;
			str.length();
			int value = Integer.parseInt("1oo");
		} catch(NumberFormatException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
			System.err.println("[에러 내용]");
			System.err.println(e.getMessage());
		}
	}
}