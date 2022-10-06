package ch12.sec09;

import java.text.DecimalFormat;

class A {
	void func() {
		
	}
}
class B extends A {
	void func() {
		System.out.println("B.func()");
	}
}

class C extends A {
	void func() {
		System.out.println("C.func()");
	}
}

class D extends A {
	void func() {
		System.out.println("D.func()");
	}
}
public class DecimalFormatExample {
	
	static void func(A[] arr) {
		for (A obj : arr) {
			obj.func();
		}
	}
	
	public static void main(String[] args) {
		double num = 1234567.89;

		DecimalFormat df;
		
		A [] a2 = new A[3]; 
		a2[0] = new B();
		a2[1] = new C();
		a2[2] = new D();
		
		func(a2);
		
		//정수 자리까지 표기
		df = new DecimalFormat("#,###");// 1,234,568
		System.out.println( df.format(Math.floor(num)) );
		
		//무조건 소수 첫째 자리까지 표기
		df = new DecimalFormat("#,###.0");
		System.out.println( df.format(num) );
	}
}