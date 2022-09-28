package clean.code.design4.interface_segregation.step2;

//미래에 구현할 예정이 수육양용차 인터페이스를 아래와 같이 선언하였다 
//아주 안좋은 거대한 인터페이스
//해결방법은 실제 필요한 인터페이스만 사용할 수 있개 분리한다
interface ICar {

	void drive();
	void turnLeft();
	void turnRight();
}

interface IBoat {

	void steer();
	void steerLeft();
	void steerRight();
}

//이부분이 실제 Interface을 사용하는 부분
class CarBoatClient {
	public void carDriverIsDriving(ICar car) {
		car.drive();
		car.turnLeft();
		car.turnRight();
	}

	public void shipDriverIsDriving(IBoat car) {
		car.steer();
		car.steerLeft();
		car.steerRight();
	}
}

//인터페이스를 구현한 부분 -> 제니시스 
class Genesis implements ICar {
	@Override
	public void drive() {
		System.out.println("제니시스 운전하다");
	}

	@Override
	public void turnLeft() {
		System.out.println("제니시스 좌회전하다");
	}

	@Override
	public void turnRight() {
		System.out.println("제니시스 우회전하다");
	}
}

//인터페이스를 구현한 부분 -> 크루즈 
class cruiseShip implements IBoat {

	@Override
	public void steer() {
		System.out.println("유람선을 조정하다");
	}
	@Override
	public void steerLeft() {
		System.out.println("유람선을 좌회전하다");
	}
	@Override
	public void steerRight() {
		System.out.println("유람선을 우회전하다");
	}
};

public class InterfaceSegregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
