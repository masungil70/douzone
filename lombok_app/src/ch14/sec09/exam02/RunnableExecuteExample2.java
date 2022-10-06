package ch14.sec09.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableExecuteExample2 {
	public static void main(String[] args) {

		int endValue = 100000000;
		double sum = 0;
		
		long tick = System.nanoTime();
		for (int i=1;i<=endValue;i++) {
			sum += i;
		}
		System.out.println("1 : 합계 : " + sum);
		System.out.println("1 : 반복문 실행 시간 : " + (System.nanoTime() - tick));
		
		//ExecutorService 생성
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		tick = System.nanoTime();
		int size = 10;
		int length = endValue / size;
		sum = 0;
		//스레드 실행
		List<Future<Double>> futures = new ArrayList<>(); 
		for (int i=0;i<size;i++) {
			int from = i*length + 1;
			int to = (i+1) * length;
			futures.add(executorService.submit(new Callable<Double>() {
				@Override
				public Double call() throws Exception {
					double sum = 0;
					for(int i=from; i<=to; i++) {
						sum += i;
					}
					return sum;
				}
			}));
		}
		
		try {
			for (Future<Double> future : futures) {
				sum += future.get();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("2 : 합계 : " + sum);
		System.out.println("2 : 스레드 실행 시간 : " + (System.nanoTime() - tick));
		
		
		//ExecutorService 종료
		executorService.shutdown();
	}
}