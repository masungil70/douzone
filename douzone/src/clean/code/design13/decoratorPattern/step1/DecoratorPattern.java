package clean.code.design13.decoratorPattern.step1;

public class DecoratorPattern {

	public static void main(String[] args) {
		RoadDisplay road = new RoadDisplay();
		road.draw(); // 기본 도로만 표시

		RoadDisplay roadWithLane = new RoadDisplayWithLane();
		roadWithLane.draw(); // 기본 도로 표시 + 차선 표시
	}

}
