package ch07.sec02.exam03;

public class CarOtherExample {
	public static void main(String[] args) {
		// Car객체 생성
		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			// 차를 달립니다.
			int problemLocation = car.run();

			// 문제분석
			switch (problemLocation) {
			case 1: // 왼쪽 타이어에 문제
				System.out.println("앞왼쪽 타이어로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;

			case 2: // 앞쪽 오른쪽 타이어에 문제
				System.out.println("앞오른쪽 타이어로 교체");
				car.frontRightTire = new KumhoTire("앞왼쪽", 13);
				break;

			case 3: // 뒤쪽 왼쪽 타이어에 문제
				System.out.println("앞왼쪽 타이어로 교체");
				car.backLeftTire = new KumhoTire("뒤왼쪽", 13);
				break;

			case 4: // 뒤쪽 오른쪽 타이어에 문제
				System.out.println("앞왼쪽 타이어로 교체");
				car.bakRightTire = new HankookTire("뒤오른쪽", 14);
				break;

			default: // problemLocation == 0 정상주행
				break;
			}
			System.out.println("------------------------------");
		}
	}
}
