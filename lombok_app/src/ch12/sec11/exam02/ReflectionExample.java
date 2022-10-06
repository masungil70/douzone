package ch12.sec11.exam02;

import java.lang.reflect.*;


class A {
	void func() {
		
	}
}
class B extends A {
	void func() {
		System.out.println("B.func()");
	}
}

class C extends A {
	void func() {
		System.out.println("C.func()");
	}
}

class D extends A {
	void func() {
		System.out.println("D.func()");
	}
}
public class ReflectionExample {
	
//	static void func(A[] arr) {
//		for (A obj : arr) {
//			obj.func();
//		}
//	}
	//RTTI
//	A [] a2 = new A[3]; 
//	a2[0] = new B();
//	a2[1] = new C();
//	a2[2] = new D();
	
//	func(a2);


	public static void main(String[] args) throws Exception {
//		System.out.println("프로그램 시작");
		String modelStr = "model=제니시스";
		//String modelStr = args[0];
		Class clazz = Class.forName("ch12.sec11.exam02.Car");
		String [] models = modelStr.split("=");
		String key = "set" + (char)(models[0].charAt(0) - ('a' - 'A')) + models[0].substring(1);
		String value = models[1];
		
		System.out.println(key);
		
//		Car obj = new Car();
//		obj.setModel("제니시스");
//		obj.setOwner("홍길동");
//		System.out.println("model = " + obj.getModel());
//		System.out.println("owner = " + obj.getOwner());
		
		//Class clazz = Car.class;
		
		System.out.println("[생성자 정보]");
		
		Constructor[] constructors = clazz.getDeclaredConstructors();
		Constructor constructor = clazz.getConstructor();
////	TV tv = new TV();
		//Car obj = new Car(); 
		Object obj2 = constructor.newInstance();
		
		
//		for(Constructor constructor : constructors) {
//			//System.out.print(constructor.getName() + "(");
//			Class[] parameters = constructor.getParameterTypes();
//			if (parameters.length == 0) {
//				//
//				//System.out.println("기본생성자");
//				//Car obj = new Car();
////				TV tv = new TV();
//				Object obj2 = constructor.newInstance();
//				
//			}
//			//printParameters(parameters);
//			//System.out.println(")");
//		}
		System.out.println();
//		
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getName() + " " + field.getName());
		}
		System.out.println();
//		
		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			if (method.getName().equals(key)) {
				//method 호출
				//obj.setModel("제니시스"); 
				method.invoke(obj2, value);
			}
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		if (obj2 instanceof Car car) {
			System.out.println("model = " + car.getModel());
		}
	}
			
	private static void printParameters(Class[] parameters) {
		for(int i=0; i<parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if(i<(parameters.length-1)) {
				System.out.print(",");
			}
		}
	}
}		