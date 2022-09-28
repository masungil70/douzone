package clean.code.design5.dependency_inversion.step3;

import java.util.ArrayList;
import java.util.List;

interface Animal {
	void speak();
};


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
