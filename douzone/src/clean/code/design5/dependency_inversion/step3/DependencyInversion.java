package clean.code.design5.dependency_inversion.step3;

import java.util.ArrayList;
import java.util.List;

//abstract class Animal {
//	abstract void speak1();
//	abstract void speak2();
//	abstract void speak3();
//};

interface Animal {
	public static final int MAX_VOLUME = 10; //상수
	public void speak(); //추상메소드
	
	public default int add(int a, int b) {
		return a + b;
	}
};

//low level
class Cat implements Animal {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		
	}
}

class Dog implements Animal{
	public void speak() {
		System.out.println("멍멍멍~~~");
	}
}

//high level 
class Zoo {
	private List<Animal> animals = new ArrayList<Animal>();
  
  public void addAnimal(Animal animal) {
      animals.add(animal);
  }
  
	public void speak() {
		for (Animal animal : animals ) {
			animal.speak();
		}
	}
}


public class DependencyInversion {

	public static void main(String[] args) {
	    Zoo zoo = new Zoo();
	    Cat cat = new Cat();
	    Dog dog = new Dog(); 

	    zoo.addAnimal(cat);
	    zoo.addAnimal(dog);

	    zoo.speak();
	}

}
