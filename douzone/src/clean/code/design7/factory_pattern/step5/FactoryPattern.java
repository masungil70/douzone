package clean.code.design7.factory_pattern.step5;

enum ANIMAL5 {
	CAT, DOG, SHEEP, COW
}

interface Animal {
	void speak();
	
};

//생성자함수를 private 변경하여 외부에서 객체 생성할 수 없게 함
//factory 제공함 
class Cat implements Animal {
	private Cat() {
		
	}
	
	public void speak() {
		System.out.println("야옹~~~");
	}
	
	public static Animal createObject() {
		return new Cat();
	}
}

class Dog implements Animal{
	private Dog() {
		
	}
	public void speak() {
		System.out.println("멍멍멍~~~");
	}
	public static Animal createObject() {
		return new Dog();
	}
}


class Sheep implements Animal{
	private Sheep() {
		
	}
	public void speak() {
		System.out.println("매~~ 매~~");
	}
	public static Animal createObject() {
		return new Sheep();
	}
}

//추가된 부분 --> Open Close 문제 없음 
class Cow implements Animal{
	private Cow() {
		
	}

	public void speak() {
		System.out.println("음매 음매~~");
	}
	public static Animal createObject() {
		return new Cow();
	}
	
}

class FactoryAnimal {
	public static Animal CreateAnimal(ANIMAL5 type) throws Exception {
	    
	    switch(type) {
	    case CAT:
	        return Cat.createObject();
	    case DOG:
	        return Dog.createObject();
	    case SHEEP:
	        return Sheep.createObject();
	    case COW:
	        return Cow.createObject();
	    }
	    throw new Exception("객체를 생성할 수 없습니다");
	}
}

class Client {
	private void speak(Animal animal) {
		animal.speak();
	}
	
	public void someA(ANIMAL5 type) throws Exception {
		Animal animal = FactoryAnimal.CreateAnimal(type);

		//someB() 메서드와 다른 루틴 동작
		//...
	
    	speak(animal);
	}
	
	void someB(ANIMAL5 type) throws Exception {
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
			someA.someA(ANIMAL5.COW);
			someB.someB(ANIMAL5.COW);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
