package clean.code.design12.facadePattern.step3;

public class DvdPlayer {
    String description;
    int currentTrack;
    Amplifier amplifier;
    String movie;
    
    public DvdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }
 
    public void on() {
        System.out.println(description + " 켜다");
    }
 
    public void off() {
        System.out.println(description + " 끄다");
    }
 
        public void eject() {
        movie = null;
                System.out.println(description + " eject");
        }
 
    public void play(String movie) {
        this.movie = movie;
        currentTrack = 0;
        System.out.println(description + " 플레이 \"" + movie + "\"");
    }
 
    public void play(int track) {
        if (movie == null) {
            System.out.println(description + " can't play track " + track + " no dvd inserted");
        } else {
            currentTrack = track;
            System.out.println(description + " playing track " + currentTrack + " of \"" + movie + "\"");
        }
    }
 
    public void stop() {
        currentTrack = 0;
        System.out.println(description + " 멈춤 \"" + movie + "\"");
    }
 
    public void pause() {
        System.out.println(description + " 잠시 멈춤 \"" + movie + "\"");
    }
 
    public void setTwoChannelAudio() {
        System.out.println(description + " 2 채널 오디오로 변경 ");
    }
 
    public void setSurroundAudio() {
        System.out.println(description + " 서라운드 모드로 변경 ");
    }
 
    public String toString() {
        return description;
    }
}
