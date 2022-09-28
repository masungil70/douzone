package ch07.sec04.exam01;

public class Computer extends Calculator {

	void func() {
		super.areaCircle(10);
		
		funcA();
	}
	
	@Override
	public double areaCircle(double r) {
		//메소드 오버라이딩
		String str;
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
/*
 * public    : 메소드
 * private   : 필드 
 * default   : 패키지
 * protected : 상속관계
 */
}