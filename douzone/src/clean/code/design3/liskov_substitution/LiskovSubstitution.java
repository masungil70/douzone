package clean.code.design3.liskov_substitution;

class Cat {
	public void speak() {
        System.out.println("야옹~~~");
    }
}

class Client {
	public static void speak(Cat  cat) {
		cat.speak();
	}
}

class BlackCat extends Cat {
	@Override
	public void speak() {
		System.out.println("검은 고양이 야옹~~~");
    }
}

class Fish {
	public void swimming() {
		System.out.println("물고기 수영~~");
    }
}

public class LiskovSubstitution {

	public static void main(String[] args) {
	    Cat cat = new Cat();
	    Client.speak(cat); //고양이 울음 

	    BlackCat blackCat = new BlackCat();
	    Client.speak(blackCat); //검은 고양이 울음 

	    Cat catRef = blackCat;
	    Client.speak(catRef); //검은 고양이 울음 

	    Fish fish = new Fish();
	    Object obj = fish; 
	    Client.speak((Cat)obj); //물고기는 울지 않는다. 해당 기능은 동작하지 안는다.

	}

}
