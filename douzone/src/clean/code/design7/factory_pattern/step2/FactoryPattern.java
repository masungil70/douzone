package clean.code.design7.factory_pattern.step2;

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

//추가된 부분 --> Open Close 문제 없음 
class Cow implements Animal{
	public void speak() {
		System.out.println("음매 음매~~");
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
	    else if (3 == type) {
	        //추가된 부분 --> Open Close 문제 있음
	    	animal = new Cow();
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
	    else if (3 == type) {
	        //추가된 부분 --> Open Close 문제 있음
	    	animal = new Cow();
	    }

	    if (animal != null) {
	    	speak(animal);
	    }
	}
}

public class FactoryPattern {

	public static void main(String[] args) {
		Client someA = new Client();
		Client someB = new Client();

		someA.someA(3);
		someB.someB(3);
		
	}

}
