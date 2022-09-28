package clean.code.design12.facadePattern.step2;

public class Projector {
    String description;
    DvdPlayer dvdPlayer;
    
    public Projector(String description, DvdPlayer dvdPlayer) {
        this.description = description;
        this.dvdPlayer = dvdPlayer;
    }
 
    public void on() {
        System.out.println(description + " 켜다");
    }
 
    public void off() {
        System.out.println(description + " 끄다");
    }
 
    public void wideScreenMode() {
        System.out.println(description + " 와이드 스크린 모드롤 변경(16x9 aspect ratio)");
    }
 
    public void tvMode() {
        System.out.println(description + " 일반 TV 모드(4x3 aspect ratio)");
    }
  
        public String toString() {
                return description;
        }
}
 
