package clean.code.design7.factory_pattern.step1;

interface Animal {
	void speak();
};

class Cat implements Animal {
	public void speak() {
		System.out.println("야옹~~~");
	}
}

class Dog implements Animal{
	public void speak() {
		System.out.println("멍멍멍~~~");
	}
}

class Sheep implements Animal{
	public void speak() {
		System.out.println("매~~ 매~~");
	}
}

class Client {
	private void speak(Animal animal) {
		animal.speak();
	}
	
	public void someA(int type) {
		Animal animal = null;
	    if (0 == type) {
	    	animal = new Cat();
	    }
	    else if (2 == type) {
	    	animal = new Sheep();
	    }
	
	    if (animal != null) {
	    	speak(animal);
	    }
	}
	
	void someB(int type) {
		Animal animal = null;
	    if (0 == type) {
	    	animal = new Cat();
	    }
	    else if (1 == type) {
	    	animal = new Dog();
	    }
	
	    if (animal != null) {
	    	speak(animal);
	    }
	}
}

//고객의 요청으로 Cow 클래스를 추가해 달라고함 
//이것을 해결하는 방법

public class FactoryPattern {

	public static void main(String[] args) {
		Client someA = new Client();
		Client someB = new Client();

		someA.someA(2);
		someB.someB(1);
		
	}

}
