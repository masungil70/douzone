package ch08.sec10.exam02;

public class CastingExample {
	
	Vehicle vehicle1 = new Bus();
	
	public static void main(String[] args) {
		
		//인터페이스 변수 선언과 구현 객체 대입
		Vehicle vehicle = new Bus(); //기본 생성자 호출 

		//인터페이스를 통해서 호출
		vehicle.run();
		//vehicle.checkFare(); (x)

		//강제 타입 변환후 호출
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle; 
			bus.run();
			bus.checkFare();
		}
	}
}