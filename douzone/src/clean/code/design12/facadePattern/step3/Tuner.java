package clean.code.design12.facadePattern.step3;

public class Tuner {
    String description;
    Amplifier amplifier;
    double frequency;
 
    public Tuner(String description, Amplifier amplifier) {
        this.description = description;
    }
 
    public void on() {
        System.out.println(description + " 켜다");
    }
 
    public void off() {
        System.out.println(description + " 끄다");
    }
 
    public void setFrequency(double frequency) {
        System.out.println(description + " 라디오 주파수 변경 " + frequency);
        this.frequency = frequency;
    }
 
    public void setAm() {
        System.out.println(description + " AM 모드 변경");
    }
 
    public void setFm() {
        System.out.println(description + " FM 모드 변경");
    }
 
    public String toString() {
        return description;
    }
}
