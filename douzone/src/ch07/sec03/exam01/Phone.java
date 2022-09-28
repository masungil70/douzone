package ch07.sec03.exam01;

public class Phone {
	//필드 선언
	private String model;
	private String color;

	public Phone() {
		
	}

	//기본 생성자 선언
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("Phone() 생성자 실행");
	}
	
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
	}
	
}