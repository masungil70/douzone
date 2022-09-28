package clean.code.design12.facadePattern.step1;

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
        dvd.play("이터널스");
        
        System.out.println("\n홈시어터 종료 단계 ...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();     
        
        
        System.out.println("\nCD로 음악 감상시 ...");
        lights.on();
        amp.on();
        amp.setVolume(5);
        amp.setStereoSound();
        cd.on();
        cd.play("베토벤 운명");
        
        System.out.println("\nCD로 음악 종료시 ...");
        amp.off();
        cd.eject();
        cd.off();

        System.out.println("\n튜너로 라디오 들을 때 ...");
        tuner.on();
        tuner.setFrequency(89.1);
        amp.on();
        amp.setVolume(5);

        System.out.println("\n튜너로 라디오 들을 때 ...");
        tuner.off();
        amp.off();
	}
}
