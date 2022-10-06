package ch14.sec03.exam03;

import java.awt.Toolkit;

class WorkerThread extends Thread {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			System.out.println("thread name : " + getName());
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}

public class BeepPrintExample {
	public static void main(String[] args) {
//		Thread thread = new Thread() {
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i=0; i<5; i++) {
//					toolkit.beep();
//					try { Thread.sleep(500); } catch(Exception e) {}
//				}
//			}
//		};
//		thread.start();
		
		WorkerThread workerThread = new WorkerThread();
		workerThread.setName("부 - 스레드");
		workerThread.start();
//		new WorkerThread().start();

		Thread mainThread = Thread.currentThread();
		System.out.println("main thread name : " + mainThread.getName());

		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}