package clean.code.design13.decoratorPattern.step4;

public class DecoratorPattern {

	public static void main(String[] args) {
		Display road = new RoadDisplay();
		road.draw(); // 기본 도로 표시

		Display roadWithLane = new LaneDecorator(new RoadDisplay());
		roadWithLane.draw(); // 기본 도로 표시 + 차선 표시

		Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
		roadWithTraffic.draw(); // 기본 도로 표시 + 교통량 표시

		// 기본 도로 표시 + 차선 표시 + 교통량 표시
		Display roadWithLaneAndTraffic = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
		roadWithLaneAndTraffic.draw();

		// 기본 도로 표시 + 차선 표시 + 교통량 표시 + 교차로 표시
		Display roadWithCrossingLaneAndTraffic = new LaneDecorator(
				new TrafficDecorator(new CrossingDecorator(new RoadDisplay())));
		roadWithCrossingLaneAndTraffic.draw();

	}

}
