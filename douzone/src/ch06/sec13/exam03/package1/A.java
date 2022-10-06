package ch06.sec13.exam03.package1;

public class A {
	//public 접근 제한을 갖는 필드 선언
	public int field1;
	//default 접근 제한을 갖는 필드 선언
	int field2;
	//private 접근 제한을 갖는 필드 선언
	private int field3;

	//생성자 선언
	public A() {
		field1 = 1; 		//o
		field2 = 1; 		//o
		field3 = 1; 		//o

		method1(); 			//o
		method2(); 			//o
		method3(); 			//o
	}

	//public 접근 제한을 갖는 메소드 선언
	public void method1() {
	}
	
	//default 접근 제한을 갖는 메소드 선언
	void method2() {
	}
	
	//private 접근 제한을 갖는 메소드 선언
	private void method3() {
	}
}