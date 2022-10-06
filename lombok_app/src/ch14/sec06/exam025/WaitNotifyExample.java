package ch14.sec06.exam025;

class Range {
	private int from;
	private int to;
	private double sum;
	
	public Range(int from, int to) {
		this.from = from;
		this.to = to;
		this.sum = 0;
	}
	
	public int getFrom() {
		return from;
	}
	
	public int getTo() {
		return to;
	}
	
	public double getSum() {
		return sum;
	}
	
	public void setSum(double sum) {
		this.sum = sum;
	}
}

class CalcSumThread implements Runnable {
	private Range range;
	
	CalcSumThread(int from, int to) {
		this.range = new Range(from, to);
	}
	
	@Override
	public void run() {
		double sum = 0;
		
		for (int i=range.getFrom();i<=range.getTo();i++) {
			sum += i;
		}
		
		range.setSum(sum);
	}
	
	public double getSum() {
		return range.getSum();
	}
}

public class WaitNotifyExample {
	public static void main(String[] args) {
		int endValue = 100000000;
		double sum = 0;
		
		long tick = System.nanoTime();
		for (int i=1;i<=endValue;i++) {
			sum += i;
		}
		System.out.println("1 : 합계 : " + sum);
		System.out.println("1 : 반복문 실행 시간 : " + (System.nanoTime() - tick));
		
		tick = System.nanoTime();
		int size = 10;
		int length = endValue / size;
		CalcSumThread [] calcSums = new CalcSumThread[size];
		Thread [] threads = new Thread[10];
		//스레드 생성 
		for (int i=0;i<size;i++) {
			calcSums[i] = new CalcSumThread(i*length + 1, (i+1) * length);
			threads[i] = new Thread(calcSums[i]);
		}
		//스레드 실행 
		for (int i=0;i<size;i++) {
			threads[i].start();
		}
		
		//스레드 종료까지 대기   
		for (int i=0;i<size;i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		sum = 0;
		for (int i=0;i<size;i++) {
			sum += calcSums[i].getSum();
		}
		
		System.out.println("2 : 합계 : " + sum);
		System.out.println("2 : 스레드 실행 시간 : " + (System.nanoTime() - tick));
		
		
	}
}