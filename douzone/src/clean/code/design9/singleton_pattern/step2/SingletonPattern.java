package clean.code.design9.singleton_pattern.step2;

class Printer {
	 private Printer() {
		System.out.println("생성자 호출 => " + toString() );
	}
	public void print() { 
		System.out.println("pointer object address = " + toString() );
	}
	
	//lazy 기법을 사용하여 실제 필요할 때 객체를 생성하는 방법  
	private static Printer printer = null;
	
	public static Printer getInstance() {
		if (printer == null) {
			printer = new Printer();
		}
		return printer; 
	}
}

//업무상 문제가 있는 코드 임 
//해당 코드를 스레드에서 실행 하면 문제 발생 
public class SingletonPattern {

	public static void main(String[] args) {
		Printer a1 = Printer.getInstance();
		Printer a2 = Printer.getInstance();
		Printer a3 = Printer.getInstance();

		a1.print();
		a2.print();
		a3.print();

	}

}
