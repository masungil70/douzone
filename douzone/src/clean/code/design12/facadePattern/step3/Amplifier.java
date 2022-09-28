package clean.code.design12.facadePattern.step3;

public class Amplifier {
    String description;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    
    public Amplifier(String description) {
        this.description = description;
    }
 
    public void on() {
        System.out.println(description + " 켜다");
    }
 
    public void off() {
        System.out.println(description + " 끄다");
    }
 
    public void setStereoSound() {
        System.out.println(description + " 스테레어 모드");
    }
 
    public void setSurroundSound() {
        System.out.println(description + " 서라운드 모드(5 speakers, 1 subwoofer)");
    }
 
    public void setVolume(int level) {
        System.out.println(description + " 볼륨 변경 " + level);
    }
 
    public void setTuner(Tuner tuner) {
        System.out.println(description + " 라디오 변경 " + dvd);
        this.tuner = tuner;
    }
  
    public void setDvd(DvdPlayer dvd) {
        System.out.println(description + " DV플레이어 변경 " + dvd);
        this.dvd = dvd;
    }
 
    public void setCd(CdPlayer cd) {
        System.out.println(description + " CD플레이어 변겨" + cd);
        this.cd = cd;
    }
 
    public String toString() {
        return description;
    }
}
 