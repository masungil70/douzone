package clean.code.design11.adapter_pattern.step4;

/*
Bluetooth외에 wifi 장치도 시스템에 추가 하는 일이 발생 됨 

  이를 처리하는 방법 : interface 구현, 포함을 이용한 adapter pattenr 
*/

interface INetwork {
    void activate();
    int send(int size, String data);
    char [] recv(int size);
    void deactivate();
};


class Bluetooth  {
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
		System.out.println("블루투스 비활성화\n");
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

class AdapterBluetooth implements INetwork {
	private Bluetooth bluetooth = new Bluetooth();
	
    public void activate() {
    	bluetooth.activate();
    }
    public int send(int size, String  data) {
        return bluetooth.send(size, data);
    }

    public char [] recv(int size) {
        return bluetooth.recv(size);
    }
    public void deactivate() {
    	bluetooth.deactivate();
    }
};

class AdapterWifi extends Wifi implements INetwork {
	private Wifi wifi = new Wifi();
	
	public void activate() {
		wifi.activateWifi();
    }
	public int send(int size, String data) {
        return wifi.sendWifi(size, data);
    }
	public char [] recv(int size) {
        return wifi.recvWifi(size);
    }
	public void deactivate() {
		wifi.deactivateWifi();
    }
};

enum COMM_MODE {
	BLUETOOH, WIFI, 
}


public class AdapterPattern {
	
	public void demo(INetwork network) {
	    String str = "Hello world";
	
	    //통신 활성화
	    network.activate();
	
	    //통신 자료 전송 
	    network.send(str.length(), str);
	    
	    //통신에서 자료 수신
	    char [] recvData = network.recv(100);
	    
	    System.out.println("수신된 데이터 => " + recvData.length + ", " + new String(recvData));
	
	    //통신  비활성화
	    network.deactivate();
	}
	
	public static void main(String [] argv) {
		AdapterPattern adapterPattern = new AdapterPattern();
		
	    //블루투스 실행
		adapterPattern.demo(new AdapterBluetooth());
		
		
	    //와이파이 실행
		adapterPattern.demo(new AdapterWifi());	
	}

}
