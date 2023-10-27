package ch07.sec02.exam03;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car(); // car 객체 생성

		// 일단 차를 달려봅니다.
		// 달리는 도중에 타이어에 문제가 있을 수 있습니다.
		for (int i = 1; i < 5; i++) {
			int problemLocation = car.run();

			// 문제가 생겼는가 판별
			switch (problemLocation) {
			case 1: // 왼쪽 타이어에 문제
				System.out.println("앞왼쪽 타이어로 교체");
				car.frontLeftTire = new Tire("앞왼쪽", 15);
				break;

			case 2: // 앞쪽 오른쪽 타이어에 문제
				System.out.println("앞오른쪽 타이어로 교체");
				car.frontRightTire = new Tire("앞왼쪽", 13);
				break;

			case 3: // 뒤쪽 왼쪽 타이어에 문제
				System.out.println("앞왼쪽 타이어로 교체");
				car.backLeftTire = new Tire("뒤왼쪽", 13);
				break;

			case 4: // 뒤쪽 오른쪽 타이어에 문제
				System.out.println("앞왼쪽 타이어로 교체");
				car.bakRightTire = new Tire("뒤오른쪽", 14);
				break;

			default: // problemLocation == 0 정상주행
				break;
			}
			System.out.println("------------------------------");
		}
	}

}
