package lombok_app;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("123", null);
		m1.setAge(10);
//		m1.setId("123");
		m1.setName("홍길동");
		
		System.out.println(m1);
		
		Member m2 = new Member("123", "홍길동");
		m2.setAge(10);
//		m2.setId("123");
//		m2.setName("홍길동");
		
		if (m1.equals(m2)) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}
		
		System.out.println("m1.hashCode = " + m1.hashCode());
		System.out.println("m2.hashCode = " + m2.hashCode());

	}

}
