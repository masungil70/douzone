package ch09.sec07.exam02;

abstract class A {
	
}

class AA extends A {
	
}

public interface RemoteControl {
	//추상 메소드
	void turnOn();
	void turnOff();
}

class BB implements RemoteControl {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}
	
}

class TestA {
	public static void main(String [] args) {
		A obj = new A() {
			
		};
		RemoteControl obj2 = new RemoteControl() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}
}
