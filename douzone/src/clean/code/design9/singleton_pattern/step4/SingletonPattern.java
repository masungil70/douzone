package clean.code.design9.singleton_pattern.step4;

import java.util.ArrayList;
import java.util.List;

class Printer {
	 private Printer() {
		System.out.println("생성자 호출 => " + toString() );
	}
	public void print() { 
		System.out.println("pointer object address = " + toString() );
	}
	
	//lazy 기법을 사용하여 실제 필요할 때 객체를 생성하는 방법  
	private static Printer printer = null;
	//동기화 객체를 생성함 
	private static Object sync = new Object();
	
	public static Printer getInstance() {
		//동기화 루틴을 사용하여 해결  
		synchronized (sync) {
			if (printer == null) {
				printer = new Printer();
			}
			return printer; 
		}	
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
