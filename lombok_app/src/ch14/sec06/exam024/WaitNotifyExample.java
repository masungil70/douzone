package ch14.sec06.exam024;

class ArrayInt {
	int [] arr = null;
	
	ArrayInt() {
		arr = new int[100];
	}
	
	int size() {
		return arr.length;
	}
	
	synchronized void setAt(int idx, int value) {
		arr[idx] = value;
	}
	
	synchronized int getAt(int idx) {
		return arr[idx];
	}
}

class PrintThread implements Runnable {
	ArrayInt arr = null;
	
	PrintThread(ArrayInt arr) {
		this.arr = arr;
	}
	
	@Override
	public void run() {
		try {
			synchronized (arr) {
				arr.wait();
			} 
			
			for (int i=0;i<arr.size();i++) {
				System.out.println("프린트 스레드 : " + arr.getAt(i));
				try {
					Thread.sleep(70);
				} catch (InterruptedException e) {
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class FileSaveThread implements Runnable {
	ArrayInt arr = null;
	
	FileSaveThread(ArrayInt arr) {
		this.arr = arr;
	}
	
	@Override
	public void run() {
		try {
			synchronized (arr) {
				arr.wait();
			} 
			
			for (int i=0;i<arr.size();i++) {
				System.out.println("파일저장 스레드 : " + arr.getAt(i));
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class SNSUploadThread implements Runnable {
	ArrayInt arr = null;
	
	SNSUploadThread(ArrayInt arr) {
		this.arr = arr;
	}
	
	@Override
	public void run() {
		try {
			synchronized (arr) {
				arr.wait();
			} 
			
			for (int i=0;i<arr.size();i++) {
				System.out.println("SNS 업로드 스레드 : " + arr.getAt(i));
				try {
					Thread.sleep(70);
				} catch (InterruptedException e) {
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class WaitNotifyExample {
	public static void main(String[] args) {
		ArrayInt arr = new ArrayInt();
		
		new Thread(new PrintThread(arr)).start();
		new Thread(new FileSaveThread(arr)).start();
		new Thread(new SNSUploadThread(arr)).start();
		
		for (int i=0;i<arr.size();i++) {
			arr.setAt(i, 200 + i);
			try {
				if (i == 30) {
					synchronized (arr) {
						arr.notifyAll();
					} 
				}
				Thread.sleep(70);
			} catch (InterruptedException e) {
			}
		}
		
	}
}