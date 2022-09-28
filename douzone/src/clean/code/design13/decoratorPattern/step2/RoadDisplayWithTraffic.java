package clean.code.design13.decoratorPattern.step2;

//기본 도로 표시 + 교통량 표시 클래스
public class RoadDisplayWithTraffic extends RoadDisplay {
	public void draw() {
		super.draw(); // 상위 클래스, 즉 RoadDisplay 클래스의 draw 메서드를 호출해서 기본 도로 표시
		drawTraffic(); // 추가적으로 교통량 표시
	}

	private void drawTraffic() {
		System.out.println("교통량 표시");
	}
}