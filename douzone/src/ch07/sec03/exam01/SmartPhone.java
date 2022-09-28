package ch07.sec03.exam01;

public class SmartPhone extends Phone {
	//자식 생성자 선언
	public SmartPhone(String model, String color) {
		//super(model, color);
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
		String str1 = 3 + "7";
		String str2 = "3" + 7;
		String str3 = 3 + 7 + "4";
		String str4 = "3" + 7 + 4;
	}

}