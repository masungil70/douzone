package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String numStr = "fedc";
		int value = Integer.parseInt(numStr, 16);
		Integer obj = 100;
		//Integer obj = new Integer(100);
		int value2 = obj;
		//int value2 = obj.intValue();
//		
		Integer obj1 = new Integer(200);
		Integer obj2 = new Integer(200);
		if (obj1 == 200) {
//			if (obj1.equals(obj2)) {
			
		}
		
		String data1 = "홍길동&이수홍,박연수";
		String[] arr = data1.split("&|,");
		for(String token : arr) {
			System.out.println(token);
		}
		System.out.println();

		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2, "/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}