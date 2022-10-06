package ch08.sec08;

public class MultiInterfaceImplExample {
	public static void main(String[] args) {
		SmartTelevision smartTV = new SmartTelevision();
		//RemoteControl 인터페이스 변수 선언 및 구현 객체 대입
		RemoteControl rc = smartTV;
		
		//RemoteControl 인터페이스에 선언된 추상 메소드만 호출 가능
		rc.turnOn();
		rc.turnOff();	
		
		//Searchable 인터페이스 변수 선언 및 구현 객체 대입
		Searchable searchable = smartTV;
		//Searchable 인터페이스에 선언된 추상 메소드만 호출 가능
		searchable.search("https://www.youtube.com");
	}
}