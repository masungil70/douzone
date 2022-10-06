package ch14.sec06.exam021;

class ArrayReadThread implements Runnable {
	int [] arr = null;
	
	ArrayReadThread(int [] arr) {
		this.arr = arr;
	}
	
	@Override
	public void run() {
		for (int i=0;i<arr.length;i++) {
			System.out.println(Thread.currentThread().getName() + " : " + arr[i]);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class WaitNotifyExample {
	public static void main(String[] args) {
		int [] arr = new int[100];
		
		new Thread(new ArrayReadThread(arr)).start();
		
		for (int i=0;i<arr.length;i++) {
			arr[i] = 200 + i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
		
	}
}