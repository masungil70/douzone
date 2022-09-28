package clean.code.design2.open_closed.step4;

abstract class Animal {
	abstract void speak();
}

class Cat extends Animal {
	@Override
	public void speak()  {
        System.out.println("야옹~~~");
    }
};

class Dog extends Animal {
	@Override
	public void speak()  {
        System.out.println("멍멍멍~~~");
    }
};

//추가된 기능으로 아래 코드 변경 발생안함   
class Client {
	public static void hey(Animal animal) {
		animal.speak();
	}
}


//추가된 부분 --> Open Close 문제 없음 
class Cow extends Animal {
	@Override
	public void speak()  {
        System.out.println("음매 음매~~~");
    }
};

class Sheep extends Animal {
	@Override
	public void speak()  {
        System.out.println("매~~ 매~~");
    }
};

public class BasicOpenClosed {

	public static void main(String[] args) {
	    Animal bingo = new Cat();
	    Animal kitty = new Dog();

	    Client.hey(bingo);
	    Client.hey(kitty);
	    
	    //추가 가능 구현 
	    Animal cow = new Cow();
	    Animal sheep = new Sheep();

	    Client.hey(cow);
	    Client.hey(sheep);
	}

}
