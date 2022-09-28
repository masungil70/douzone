package clean.code.design9.singleton_pattern.step5;

import java.util.ArrayList;
import java.util.List;

class Printer {
	 private Printer() {
		System.out.println("생성자 호출 => " + toString() );
	}
	public void print() { 
		System.out.println("pointer object address = " + toString() );
	}
	
	//static 변수를 이용하여 시작시 직접 생성하는 것 좋음  
	private static Printer printer = new Printer();

	//아래와 같이 하면 해당 함수는 1가지 일 만 함 
	public static Printer getInstance() {
		return printer; 
	}
}

//업무상 문제가 있는 코드 임 
//해당 코드를 스레드에서 실행 하면 문제 발생 
public class SingletonPattern {

	public static void main(String[] args) {
		try {
			Thread t1 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					Printer a1 = Printer.getInstance();
					a1.print();
				}
			});
			Thread t2 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					Printer a1 = Printer.getInstance();
					a1.print();
				}
			});
			Thread t3 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					Printer a1 = Printer.getInstance();
					a1.print();
				}
			});
			
			List<Thread> threadList = new ArrayList<Thread>();
			threadList.add(t1);
			threadList.add(t2);
			threadList.add(t3);
			
			
			for (Thread thread : threadList) {
				thread.start();
			}
	
			for (Thread thread : threadList) {
				thread.join();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
