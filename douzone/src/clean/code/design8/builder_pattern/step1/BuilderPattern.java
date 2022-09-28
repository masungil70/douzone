package clean.code.design8.builder_pattern.step1;


class Student {
	//필수인자 
    private final long id;
    private final String name;
	//옵션인자  
    private String major;
    private int age;
    private String address;

    public Student(long id, String name, String major, int age, String address) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.age = age;
        this.address = address;
    }
    
}

public class BuilderPattern {
	public static void main(String [] argv) {
		//점층적 생성자 패턴(telescoping constructor pattern)
		//일잔적인 객체 생성 
		Student student1 = new Student(1234, "홍길동", "클린코드", 25, "삼성전자로");
		// 학번과 이름만 아는 경우에는 다음과 같이 인스턴스를 생성해야 한다
		Student student2 = new Student(1234, "홍길동", null, 0, null);		
	}
}