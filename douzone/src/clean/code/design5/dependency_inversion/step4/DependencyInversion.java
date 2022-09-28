package clean.code.design5.dependency_inversion.step4;

import java.util.ArrayList;
import java.util.List;

interface Animal {
	void speak();
};

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

//low level
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

//추가된 부분 --> Open Close 문제 없음 
class Cow implements Animal{
	public void speak() {
		System.out.println("음매 음매~~");
	}
}

class Sheep implements Animal{
	public void speak() {
		System.out.println("매~~ 매~~");
	}
}


public class DependencyInversion {

	public static void main(String[] args) {
	    Zoo zoo = new Zoo();
	    Cat cat = new Cat();
	    Dog dog = new Dog(); 

	    zoo.addAnimal(cat);
	    zoo.addAnimal(dog);
	    
	    //추가된 부분 --> Open Close 문제 없음 
	    zoo.addAnimal(new Cow());
	    zoo.addAnimal(new Sheep());

	    zoo.speak();
	}

}
