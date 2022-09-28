package clean.code.design7.factory_pattern.step3;

enum ANIMAL3 {
	CAT, DOG, SHEEP
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

class FactoryAnimal {
	public static Animal CreateAnimal(ANIMAL3 type) throws Exception {
	    
	    switch(type) {
	    case CAT:
	        return new Cat();
	    case DOG:
	        return new Dog();
	    case SHEEP:
	        return new Sheep();
	    }
	    throw new Exception("객체를 생성할 수 없습니다");
	}
}

class Client {
	private void speak(Animal animal) {
		animal.speak();
	}
	
	public void someA(ANIMAL3 type) throws Exception {
		Animal animal = FactoryAnimal.CreateAnimal(type);

		//someB() 메서드와 다른 루틴 동작
		//...
	
    	speak(animal);
	}
	
	void someB(ANIMAL3 type) throws Exception {
		Animal animal = FactoryAnimal.CreateAnimal(type);
		
		//someA() 메서드와 다른 루틴 동작
		//...
		
    	speak(animal);
	}
}

//step1 을 수정하여 만든 버전 
public class FactoryPattern {

	public static void main(String[] args) {
		Client someA = new Client();
		Client someB = new Client();

		try {
			someA.someA(ANIMAL3.CAT);
			someB.someB(ANIMAL3.DOG);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
