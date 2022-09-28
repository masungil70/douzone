package clean.code.design2.open_closed.step1;

class Animal {
	private String type;
	public Animal(String type) {
		this.type = type;
	}
	
	public String getType() { 
		return type; 
	}
}

class Client {
	public static void hey(Animal animal) {
	    if ("Cat".equals(animal.getType())) {
	        System.out.println("야옹~~~");
	    }
	    else if ("Dog".equals(animal.getType())) {
	    	System.out.println("멍멍멍~~~");
	    }
	}
}

/*
#Cow와 Sheep을 추가하기위해 hey함수의 수정이 필요하다.

hey(bingo)
hey(kitty)
*/

public class BasicOpenClosed {

	public static void main(String[] args) {
	    Animal bingo = new Animal("Dog");
	    Animal kitty = new Animal("Cat");

	    Client.hey(bingo);
	    Client.hey(kitty);
	}

}
