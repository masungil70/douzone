package sec12;

import java.lang.reflect.Method;
import java.util.Arrays;

public class PrintAnnotationExample {
	public static void main(String[] args) throws Exception {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		System.out.println(Arrays.toString(declaredMethods));
		/*[
		public static void sec12.Service.main(java.lang.String[]), 
		public void sec12.Service.method2(), 
		public void sec12.Service.method1(), 
		public void sec12.Service.method3()]
		
				*/
		Service service = new Service();
		for(Method method : declaredMethods) {
			//PrintAnnotation 얻기
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

			//설정 정보를 이용해서 선 출력
			printLine(printAnnotation);

			//메소드 호출
			method.invoke(service);
			
			//설정 정보를 이용해서 선 출력
			printLine(printAnnotation);
		}
	}
	
	public static void printLine(PrintAnnotation printAnnotation) {
		if(printAnnotation != null) {
			//number 속성값 얻기
			int number = printAnnotation.number();
			for(int i=0; i<number; i++) {
				//value 속성값 얻기
				String value = printAnnotation.value();
				System.out.print(value);
			}
			System.out.println();
		}
	}
}