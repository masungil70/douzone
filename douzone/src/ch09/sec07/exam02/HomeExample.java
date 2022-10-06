package ch09.sec07.exam02;

//class RemoteControlImpl implements RemoteControl {
//
//	@Override
//	public void turnOn() {
//	}
//
//	@Override
//	public void turnOff() {
//	}
//}
//
//class RemoteControlImpl2 implements RemoteControl {
//
//	@Override
//	public void turnOn() {
//	}
//
//	@Override
//	public void turnOff() {
//	}
//}

public class HomeExample {
	/*
	 * 변수의 종류
	 * 1. 멤버 필드
	 * 2. 지역 변수 
	 * 3. 메개 변수 
	 */
	public static void main(String[] args) {
		//Home 객체 생성
		Home home = new Home();

		//익명 구현 객체가 대입된 필드 사용
		home.use1();
		
		//익명 구현 객체가 대입된 로컬 변수 사용
		home.use2();

//		final RemoteControl rc = new RemoteControlImpl();
//		rc = null;
//		home.use3(rc);
		home.use3(new RemoteControl() {
			@Override
			public void turnOn() {
			}
			@Override
			public void turnOff() {
			}
		});
		
//		RemoteControl rc2 = new RemoteControlmpl2();
//		home.use3(rc2);

		//익명 구현 객체가 대입된 매개변수 사용
		for (int i=0;i<10;i++) {
			final int tmpI = i; 
			home.use3(new RemoteControl() {
				@Override
				public void turnOn() {
					System.out.println("난방을 켭니다." + tmpI);
				}
				@Override
				public void turnOff() {
					System.out.println("난방을 끕니다.");
				}
			});
		}
		
	}
}