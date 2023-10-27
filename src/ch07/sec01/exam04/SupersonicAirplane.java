package ch07.sec01.exam04;

public class SupersonicAirplane extends Airplane {
	// 상수 정의 (static final)
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	// 현재 비행 상태
	public int flyMode = NORMAL;

	public void fly() {
		// 초음속모드로 설정되었다면 초음속 모드로 비행
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			// 일반 비행 모드라면 부모클래스의 fly() 메소드를 호출한다.
			super.fly();
		}
	}

}
