package ch13.sec00;

public class GenericExample {
	public static void main(String[] args) {
		//Box<String> box1 = new Box<String>();
		{
			BoxString box1 = new BoxString();
			box1.content = "안녕하세요.";
			String str = box1.content;
			System.out.println(str);
		}
		
		{
			BoxInt box2 = new BoxInt();
			box2.content = 100;
			int value = box2.content;
			System.out.println(value);
		}
		
		{
			BoxObject box = new BoxObject();
			box.content = "안녕하세요.";
			String value = (String) box.content;
			System.out.println(value);
		}
		
		{
			BoxObject box = new BoxObject();
			box.content = 100;
			int value = (int) box.content;
			System.out.println(value);
		}
	}
}