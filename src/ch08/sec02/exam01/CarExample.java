package ch08.sec02.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		// 원래 클래스 예제에서는 타이어의 마모 회전수 고려했지만
		//  여기서는 단순히 강제 교환
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		// 타이어를 교환했으니 차를 달려보자
		myCar.run();
	}
}
