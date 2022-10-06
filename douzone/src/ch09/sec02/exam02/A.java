package ch09.sec02.exam02;

public class A {
	int a;
	
	int add(int a, int b) {
		this.a = 10; //멤버 필드 
		a = 20; //지역변수 
		return a+b;
	}
	
	static void func() {
		
	}
	//인스턴스 멤버 클래스
	static class B {
		//인스턴스 필드
		int field1 = 1;
		int a;

		//정적 필드(Java 17부터 허용)
		static int field2 = 2;

		//생성자
		B() {
			System.out.println("B-생성자 실행");
			field1 = 10;
			//B.field2 = 20;
			int result = add(20,30);
		}

		//인스턴스 메소드
		void method1() {
			int a;
			
			a = 10; //지역변수 
			//this.a = 20;//B 클래스의 필드 a 
			A.this.a = 30; //외부의 클래스A의 필드 a
			
			System.out.println("B-method1 실행");
			int result = add(20,30);
		}

		//정적 메소드(Java 17부터 허용)
		static void method2() {
			System.out.println("B-method2 실행");
			//int result = add(20,30);
		}
	}

	//인스턴스 메소드
	void useB() {
		//B 객체 생성 및 인스턴스 필드 및 메소드 사용
		B b = new B();
		System.out.println(b.field1);
		b.method1();

		//B 클래스의 정적 필드 및 메소드 사용
		System.out.println(B.field2);
		B.method2();
	}
}