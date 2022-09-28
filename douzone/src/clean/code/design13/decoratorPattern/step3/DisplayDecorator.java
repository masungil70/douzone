package clean.code.design13.decoratorPattern.step3;

/* 다양한 추가 기능에 대한 공통 클래스 */
public abstract class DisplayDecorator extends Display {
	private Display decoratedDisplay;

	// '합성(composition) 관계'를 통해 RoadDisplay 객체에 대한 참조
	public DisplayDecorator(Display decoratedDisplay) {
		this.decoratedDisplay = decoratedDisplay;
	}

	@Override
	public void draw() {
		decoratedDisplay.draw();
	}
}
