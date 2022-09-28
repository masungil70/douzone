package clean.code.design11.adapter_pattern.step2;

/*
Bluetooth외에 wifi 장치도 시스템에 추가 하는 일이 발생 됨 

 이를 처리하는 방법 : copy & paste 방법 
*/


class Bluetooth {
	public void activate() {
		System.out.println("블루투스 활성화");
	}

	public int send(int size, String data) {
		System.out.println("블루투스 데이터 전송 = " + size);
		return size;
	}

	public char[] recv(int size) {
		char[] recvData = "수신받은 데이터".toCharArray();
		// ..
		return recvData;
	}

	public void deactivate() {
		System.out.println("블루투스 비활성화\\n");
	}
}

class Wifi {
	public void activateWifi() {
		System.out.println("와이파이 활성화");
	}

	public int sendWifi(int size, String data) {
		System.out.println("와이파이 데이터 전송 = " + size);
		return size;
	}

	public char[] recvWifi(int size) {
		char[] recvData = "와이파이 데이터".toCharArray();
		// ..
		return recvData;
	}

	public void deactivateWifi() {
		System.out.println("와이파이 비활성화\n");
	}
}

enum COMM_MODE {
	BLUETOOH, WIFI, 
}


public class AdapterPattern {
	
	public void demo(COMM_MODE mode) {
		switch (mode) {
		case BLUETOOH:
			{
			    Bluetooth bluetooth = new Bluetooth();
			    String str = "Hello world";
			
			    //블루투스 활성화
			    bluetooth.activate();
			
			    //블루투스로 자료 전송 
			    bluetooth.send(str.length(), str);
			    
			    //블루투스에서 자료 수신
			    char [] recvData = bluetooth.recv(100);
			    
			    System.out.println("수신된 데이터 => " + recvData.length + ", " + new String(recvData));
			
			    //블루투스 비활성화
			    bluetooth.deactivate();
				
			}
			break;
		case WIFI:
			{
			    Wifi wifi = new Wifi();
			    String str = "Hello world";
			
			    //와아파이 활성화
			    wifi.activateWifi();
			
			    //와아파이로 자료 전송 
			    wifi.sendWifi(str.length(), str);
			    
			    //와아파이에서 자료 수신
			    char [] recvData = wifi.recvWifi(100);
			    
			    System.out.println("수신된 데이터 => " + recvData.length + ", " + new String(recvData)+ "\n");
			
			    //와아파이 비활성화
			    wifi.deactivateWifi();
				
			}
			break;
		default:
			throw new IllegalArgumentException("통신 모드에 대한 인자값이 잘못되었습니다");
		}
	}
	
	public static void main(String [] argv) {
		AdapterPattern adapterPattern = new AdapterPattern();
		
	    //블루투스 실행
		adapterPattern.demo(COMM_MODE.BLUETOOH);
		
		
	    //와이파이 실행
		adapterPattern.demo(COMM_MODE.WIFI);	
	}

}
