package ch05.sec04;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		int[] intArray = null;
		//intArray[0] = 10; //NullPointerException

		String str = null;
		//System.out.println("총 문자 수: " + str.length() );//NullPointerException
	}
}