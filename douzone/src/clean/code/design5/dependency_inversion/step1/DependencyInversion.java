package clean.code.design5.dependency_inversion.step1;

//low level
class Cat {
	public void speak() {
		System.out.println("야옹~~~");
	}
}

class Dog {
	public void speak() {
		System.out.println("멍멍멍~~~");
	}
}

//high level 
class Zoo {
	private Cat cat;
	private Dog dog;

	public Zoo() {
		cat = new Cat();
		dog = new Dog();
	}
	
	public void speak() {
		cat.speak();
		dog.speak();
	}
}

//고객의 요청의 동물원에 양과 소를 추가 해 달라고 했음 
//어떻게 수정을 해야 하는가? 

public class DependencyInversion {

	public static void main(String[] args) {
	    Zoo zoo = new Zoo();
	    zoo.speak();
	}

}
