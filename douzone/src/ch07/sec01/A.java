package ch07.sec01;

//class B {
//	int field1;
//	int field2;
//	//100
//	void method1() {
//		System.out.println("method1() 호출 ...");
//	}
//	void method2() {
//	}
//}

public class A {
	int field1;
	
//	A() {
//		this(0);
//	}
//	
	A(int field1) {
		this.field1 = field1;
	}
	
	void method1() {
		System.out.println("method1() 호출 ...");
	}
	
	public static void main(String [] args) {
		A a = new A(0);
//		A a = new A(10);
		a.method1();
		
		B b = new B();
		b.method1();
		b.method2();
	}
}

/*
 * this 
 * 	1. 생성자 함수에서 다른 생성자 함수 호출 사용됨 (this(인자))
 *  2. 일반 메서드에서는 객체를 의미함 (this.xxx, this.xxx()) 
 * 
 * super
 * 1. 생성자 함수에서 부모의 생성자를 호출 할 때 사용됨(super(인자))
 * 2. 일반 메서드에서 부모객체를 이용해서 부모 멤버를 접근할 때(super.xxx, super.xxx(인자))
 */
class B extends A  {

	int field2;

	B() {
		this(0, 0);
	}
	
	B(int field1, int field2) {
		super(field2);
		this.field2 = field2;
	}
	
	void method2() {
	}
}