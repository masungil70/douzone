package clean.code.design13.decoratorPattern.step4;

/* 교차로 표시를 추가하는 클래스 */
public class CrossingDecorator extends DisplayDecorator {
	// 기존 표시 클래스의 설정
	public CrossingDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}

	@Override
	public void draw() {
		super.draw(); // 설정된 기존 표시 기능을 수행
		drawCrossing(); // 추가적으로 교차로를 표시
	}

	// 교차로 표시 기능만 직접 제공
	private void drawCrossing() {
		System.out.println("\t교차로 표시");
	}
}