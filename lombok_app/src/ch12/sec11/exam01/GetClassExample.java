package ch12.sec11.exam01;

public class GetClassExample {
	public static void main(String[] args)  {
		//how1
//		Class clazz = Car.class;
		
		//how2
		Class clazz;
		try {
			String className = args[0];
			clazz = Class.forName(className);
		
		//how3
//		Car car = new Car();
//		Class clazz = car.getClass();
		
			System.out.println("패키지: " + clazz.getPackage().getName());
			System.out.println("클래스 간단 이름: " + clazz.getSimpleName());
			System.out.println("클래스 전체 이름: " + clazz.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}