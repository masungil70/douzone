package ch07.sec04.exam01;

public class MyComputer extends Computer {

	@Override
	public double areaCircle(double r) {
		System.out.println("내가 새롭게 작성한 기능 : " + r);
		return super.areaCircle(r);
	}

}
