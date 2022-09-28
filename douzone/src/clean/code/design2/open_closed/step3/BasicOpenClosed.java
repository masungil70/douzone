package clean.code.design2.open_closed.step3;

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

class Client {
	public static void hey(Animal animal) {
		animal.speak();
	}
}

public class BasicOpenClosed {

	public static void main(String[] args) {
	    Animal bingo = new Cat();
	    Animal kitty = new Dog();

	    Client.hey(bingo);
	    Client.hey(kitty);
	}

}
