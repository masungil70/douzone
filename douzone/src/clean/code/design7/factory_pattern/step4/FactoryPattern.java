package clean.code.design7.factory_pattern.step4;

enum ANIMAL4 {
	CAT, DOG, SHEEP, COW
}

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

class FactoryAnimal {
	public static Animal CreateAnimal(ANIMAL4 type) throws Exception {
	    
	    switch(type) {
	    case CAT:
	        return new Cat();
	    case DOG:
	        return new Dog();
	    case SHEEP:
	        return new Sheep();
	    case COW:
	        return new Cow();
	    }
	    throw new Exception("객체를 생성할 수 없습니다");
	}
}

class Client {
	private void speak(Animal animal) {
		animal.speak();
	}
	
	public void someA(ANIMAL4 type) throws Exception {
		Animal animal = FactoryAnimal.CreateAnimal(type);

		//someB() 메서드와 다른 루틴 동작
		//...
	
    	speak(animal);
	}
	
	void someB(ANIMAL4 type) throws Exception {
		Animal animal = FactoryAnimal.CreateAnimal(type);
		
		//someA() 메서드와 다른 루틴 동작
		//...
		
    	speak(animal);
	}
}

// Cow 객체를 생성  
public class FactoryPattern {

	public static void main(String[] args) {
		Client someA = new Client();
		Client someB = new Client();

		try {
			someA.someA(ANIMAL4.COW);
			someB.someB(ANIMAL4.COW);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
