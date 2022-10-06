package ch08.sec05;

public class RemoteControlExample {
	public static void main(String[] args) {
		//인터페이스 변수 선언
		RemoteControl rc;
		
		//Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.play();

		//디폴트 메소드 호출
		rc.setMute(true);
		rc.play();
		rc.setMute(false);
		rc.play();
		
		System.out.println();
		
		//Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.play();

		//디폴트 메소드 호출
		rc.setMute(true);
		rc.play();
		rc.setMute(false);				
		rc.play();
	}
}