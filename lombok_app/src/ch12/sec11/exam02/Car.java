package ch12.sec11.exam02;

public class Car {
	//필드
	private String model;
	private String owner;
	
	//생성자
	public Car() {
		System.out.println("기본생성자");
	}
	
	public Car(String model) {
		this.model = model;
		System.out.println("인자가 있는 생성");
	}

	public Car(String model, String owner) {
		this.model = model;
		this.owner = owner;
		System.out.println("인자가 있는 생성");
	}
	
	static int count;
	static {
		count = 0;
		//System.out.println("클래스 로딩..");
	}
	
	
	//메소드
	public String getModel() { return model; }
	public void setModel(String model) { this.model = model; }
	public String getOwner() { return owner; }
	public void setOwner(String owner) { this.owner = owner; }
}