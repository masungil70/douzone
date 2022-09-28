package clean.code.design12.facadePattern.step3;

public class TheaterLights {
    String description;
 
    public TheaterLights(String description) {
        this.description = description;
    }
 
    public void on() {
        System.out.println(description + " 켜다");
    }
 
    public void off() {
        System.out.println(description + " 끄다");
    }
 
    public void dim(int level) {
        System.out.println(description + " 전등을 밝기를 " + level  + "%");
    }
 
    public String toString() {
        return description;
    }
}
