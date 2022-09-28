package clean.code.design12.facadePattern.step3;

class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;
 
    public HomeTheaterFacade(Amplifier amp, 
                 Tuner tuner, 
                 DvdPlayer dvd, 
                 CdPlayer cd, 
                 Projector projector, 
                 Screen screen,
                 TheaterLights lights,
                 PopcornPopper popper) {
 
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }

	public void watchMovie(String title) {
		System.out.println("\n영화 보기 ...");
        popper.on();
        popper.pop();
        lights.off();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(title);
	}

	public void endMovie() {
		System.out.println("\n홈시어터 종료 단계 ...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
	}


	public void listenToCD(String title) {
		System.out.println("\nCD로 음악 감상시 ...");
        lights.on();
        amp.on();
        amp.setVolume(5);
        amp.setStereoSound();
        cd.on();
        cd.play(title);
	}
	
	public void endCD() {
		System.out.println("\nCD로 음악 종료시 ...");
        amp.off();
        cd.eject();
        cd.off();
	}
	
	public void listenToRadio(double frequency) {
		System.out.println("\n튜너로 라디오 들을 때 ...");
        tuner.on();
        tuner.setFrequency(frequency);
        amp.on();
        amp.setVolume(5);
	}


	public void endRadio() {
		System.out.println("\n튜너로 라디오 들을 때 ...");
        tuner.off();
        amp.off();
	}
}

public class facadePattern {
	
	
	public static void main(String [] argv) {
		
		Amplifier amp = new Amplifier("삼성 엠프");
        Tuner tuner = new Tuner("삼성 AM/FM 튜너", amp);
        DvdPlayer dvd = new DvdPlayer("삼성 DVD 플레이어", amp);
        CdPlayer cd = new CdPlayer("삼성 CD 플레이어", amp);
        Projector projector = new Projector("삼성 빔 프로젝터", dvd);
        TheaterLights lights = new TheaterLights("삼성 시어터 라이트");
        Screen screen = new Screen("삼성 스크린");
        PopcornPopper popper = new PopcornPopper("팜콘기계");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);
       
        homeTheater.watchMovie("이터널스");
        homeTheater.endMovie();     
        
        homeTheater.listenToCD("베토벤 운명");
        homeTheater.endCD();

        homeTheater.listenToRadio(89.1);
        homeTheater.endRadio();
	}






}
