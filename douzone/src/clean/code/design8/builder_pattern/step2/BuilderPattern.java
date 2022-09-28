package clean.code.design8.builder_pattern.step2;

interface Buildable<T> {
	T build();
}


class Student {
	//필수인자 
    private final long id;
    private final String name;
	//옵션인자  
    private String major;
    private int age;
    private String address;

    public static class Builder implements Buildable {
    	//필수인자 
        private final long id;
        private final String name;
    	//옵션인자  
        private String major = "";
        private int age = 0;
        private String address = "";

        public Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder major(String major) {
            this.major = major;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    //외부에서 객체 생성할 수 없게 설정 
    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.major = builder.major;
        this.age = builder.age;
        this.address = builder.address;
    }
}

public class BuilderPattern {
	public static void main(String [] argv) {
		Student hong = new Student.Builder(1234, "홍길동")
                .major("클린코드")
                .age(25)
                .address("삼성전자로")
                .build();		
	}
}