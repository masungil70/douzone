package clean.code.design13.decoratorPattern.step1;

//기본 도로 표시 + 차선 표시 클래스
public class RoadDisplayWithLane extends RoadDisplay {
	public void draw() {
		super.draw(); // 상위 클래스, 즉 RoadDisplay 클래스의 draw 메서드를 호출해서 기본 도로 표시
		drawLane(); // 추가적으로 차선 표시
	}

	private void drawLane() {
		System.out.println("차선 표시");
	}
}
