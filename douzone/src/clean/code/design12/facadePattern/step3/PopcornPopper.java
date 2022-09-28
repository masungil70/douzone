package clean.code.design12.facadePattern.step3;

public class PopcornPopper {
	String description;

	public PopcornPopper(String description) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + " 켜다");
	}

	public void off() {
		System.out.println(description + " 끄다");
	}

	public void pop() {
		System.out.println(description + "  팝콘 튀기기 시작!");
	}

	public String toString() {
		return description;
	}
}
