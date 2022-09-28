package clean.code.design2.open_closed.step2;

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
	    //추가된 부분 --> Open Close 위반임 
	    else if ("Cow".equals(animal.getType())) {
	    	System.out.println("음매 음매~~~~~");
	    }
	    else if ("Sheep".equals(animal.getType())) {
	    	System.out.println("매~~ 매~~~");
	    }
	    
	}
}

/*
#Cow와 Sheep을 추가하기위해 hey함수의 수정이 필요하다.

hey(bingo)
hey(kitty)

//고객에 추가 요구 사항이 발생 했다 
//Cow와 Sheep을 추가해 달라고 했다 .
//이것을 해결 하기 위해서 어떻게 해야 하는가?

*/

public class BasicOpenClosed {

	public static void main(String[] args) {
	    Animal bingo = new Animal("Dog");
	    Animal kitty = new Animal("Cat");

	    Client.hey(bingo);
	    Client.hey(kitty);
	    
	    //추가된 부분 
	    Animal cow = new Animal("Cow");
	    Animal sheep = new Animal("Sheep");
	    Client.hey(cow);
	    Client.hey(sheep);
	}

}
