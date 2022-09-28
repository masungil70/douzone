package clean.code.design11.adapter_pattern.step1;

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
		System.out.println("블루투스 비활성화\n");
	}
}

public class AdapterPattern {
	public static void main(String [] argv) {
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

}
