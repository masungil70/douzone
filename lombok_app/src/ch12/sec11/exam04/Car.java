package ch12.sec11.exam04;

abstract public class Car {
	//필드
	private int currentSpeed = 0;
	
	//생성자
	public Car() {
		System.out.println("기본생성자");
	}
	
	public void setSpeed(int speed) {
		this.currentSpeed = speed;
	}
	
	//메소드
	public void speed() {
		System.out.println("현재 속도 = " + currentSpeed);
	}
	
	abstract void seat();
}
