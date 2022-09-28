package clean.code.design13.decoratorPattern.step3;

/* 교통량 표시를 추가하는 클래스 */
public class TrafficDecorator extends DisplayDecorator {
	// 기존 표시 클래스의 설정
	public TrafficDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}

	@Override
	public void draw() {
		super.draw(); // 설정된 기존 표시 기능을 수행
		drawTraffic(); // 추가적으로 교통량을 표시
	}

	// 교통량 표시 기능만 직접 제공
	private void drawTraffic() {
		System.out.println("\t교통량 표시");
	}
}