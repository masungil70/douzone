package ch12.sec11.exam04;

public class Bus extends Car {

	@Override
	public void setSpeed(int speed) {
		if (0 <= speed && speed <= 90) {
			super.setSpeed(speed);
		} else if (0 > speed) {
			super.setSpeed(0);
		} else if (speed > 90) {
			super.setSpeed(90);	
		}
	}
	
	@Override
	void seat() {
		System.out.println("버스의 좌석 수 : 50");
	}

}
