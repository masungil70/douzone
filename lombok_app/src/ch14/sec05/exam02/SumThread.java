package ch14.sec05.exam02;

public class SumThread extends Thread {
	private long sum;
	
	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}

	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sum+=i;
		}
	}
}