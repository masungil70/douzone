package ch12.sec11.exam04;

import java.lang.reflect.*;

public class ReflectionExample {
	
	public static void main(String[] args) throws Exception {
		if (args.length == 0) return;
		
		Class clazz = Class.forName(args[0]);
		Constructor constructor = clazz.getConstructor();
		
		Car car = (Car) constructor.newInstance();
		if (car!=null) {
			car.setSpeed(100);
			car.speed();
			car.seat();
		}
	}
			
}		