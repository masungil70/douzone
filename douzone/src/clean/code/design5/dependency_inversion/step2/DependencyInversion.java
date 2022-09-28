package clean.code.design5.dependency_inversion.step2;

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

//추가된 부분 --> Open Close 문제 없음 
class Cow {
	public void speak() {
		System.out.println("음매 음매~~~");
	}
}

class Sheep {
	public void speak() {
		System.out.println("매~~ 매~~");
	}
}


//high level 
class Zoo {
	private Cat cat;
	private Dog dog;
    //추가 객체 관련 코드 수정 
	// Open Close 문제 있음 
	private Cow cow;
	private Sheep sheep;
    
	public Zoo() {
		cat = new Cat();
		dog = new Dog();
	    //추가 객체 관련 코드 수정 
		// Open Close 문제 있음 
		cow = new Cow();
		sheep = new Sheep();
	}
	
	public void speak() {
		cat.speak();
		dog.speak();
	    //추가 객체 관련 코드 수정 
		// Open Close 문제 있음 
		cow.speak();
		sheep.speak();
	}
}

//고객의 요청의 동물원에 양과 소를 추가 해 달라고 했음 
//어떻게 수정을 해야 하는가? 
//해당 소스의 문제은 이전에 확인했던 open-closed 원칙에 위배됨 
//이것을  해결하는 방법이 의존성 역전 원칙임 
public class DependencyInversion {

	public static void main(String[] args) {
	    Zoo zoo = new Zoo();
	    zoo.speak();
	}

}
