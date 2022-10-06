package ch14.sec06.exam022;

class ArrayInt {
	int [] arr = null;
	
	ArrayInt() {
		arr = new int[100];
	}
	
	int size() {
		return arr.length;
	}
	
	void setAt(int idx, int value) {
		arr[idx] = value;
	}
	
	int getAt(int idx) {
		return arr[idx];
	}
}

class ArrayReadThread implements Runnable {
	ArrayInt arr = null;
	
	ArrayReadThread(ArrayInt arr) {
		this.arr = arr;
	}
	
	@Override
	public void run() {
		try {
			for (int i=0;i<arr.size();i++) {
				System.out.println(Thread.currentThread().getName() + " : " + arr.getAt(i));
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

public class WaitNotifyExample {
	public static void main(String[] args) {
		ArrayInt arr = new ArrayInt();
		
		new Thread(new ArrayReadThread(arr)).start();
		
		for (int i=0;i<arr.size();i++) {
			arr.setAt(i, 200 + i);
			try {
				Thread.sleep(70);
			} catch (InterruptedException e) {
			}
		}
		
	}
}