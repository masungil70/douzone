package clean.code.design12.facadePattern.step1;

public class Screen {
    String description;
 
    public Screen(String description) {
        this.description = description;
    }
 
    public void up() {
        System.out.println(description + " 스크린을 내린다");
    }
 
    public void down() {
        System.out.println(description + " 스크린을 올린다");
    }
 
 
    public String toString() {
        return description;
    }
}

