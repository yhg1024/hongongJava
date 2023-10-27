package ch07.sec02.exam03;

public class Car {
	// 필드
	final int CAR_TIRE_PROBLEM_FRONT_LEFT = 1;
	final int CAR_TIRE_PROBLEM_FRONT_RIGHT = 1;
	final int CAR_TIRE_PROBLEM_BACK_LEFT = 1;
	final int CAR_TIRE_PROBLEM_BACK_RIGHT = 1;
	
	 // 타이어 4개 장착
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤 왼쪽", 3);
	Tire bakRightTire = new Tire("두 오른쪽", 6);
	//생성자
	
	// 메소드
	int run() {
		System.out.println("[자동차가 달리니다.]");
		
		//프론트레프타이억 펑크가 났다면 자동차가 달렸으므로
		// 모든 타이어를 회전을 1회 추가하고 결과
		// 펑크(false)를 리턴하고 타이어의 번호를 리턴
		if(frontLeftTire.roll() == false) {
			stop();
			return CAR_TIRE_PROBLEM_FRONT_LEFT;
		}
		
		if(frontRightTire.roll() == false) {
			stop();
			return CAR_TIRE_PROBLEM_FRONT_RIGHT;
		}
		
		if(backLeftTire.roll() == false) {
			stop();
			return CAR_TIRE_PROBLEM_BACK_LEFT;
		}
		
		if(bakRightTire.roll() == false) {
			stop();
			return CAR_TIRE_PROBLEM_BACK_RIGHT;
		}
		// 타이어가 펑크가 나지 않았다면 0을 리턴
		return 0;
	}
	
	// 펑크 났을때 실행
	void stop() {
		System.out.println("[자동차가 멈춥니다.");
	}

}
