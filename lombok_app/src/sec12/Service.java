package sec12;

public class Service {
	@PrintAnnotation(value="%")
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("실행 내용2");
	}
	
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("실행 내용3");
	}
	
//	public static void main(String [] args) {
//		Service service = new Service();
//		service.method1();
//		service.method2();
//		service.method3();
//	}
}