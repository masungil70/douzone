package clean.code.design9.singleton_pattern.step1;


class Printer {
	public Printer() {}
	public void print() { 
		System.out.println("pointer object address = " + toString() );
	}
}
//업무상 문제가 있는 코드 임 

public class SingletonPattern {

	public static void main(String[] args) {
		Printer a1 = new Printer();
		Printer a2 = new Printer();
		Printer a3 = new Printer();

		a1.print();
		a2.print();
		a3.print();

	}

}
