package ch06.sec04.exam03;

public class CarExample {
	
	public static void main(String[] args) {
		
		/// 자동차가 달리는 것을 모델링합니다.
		// 1. 자동차 객체를 만듭니다.
		Car car = new Car();
		
		// 2. 기본가스량을 주입합니다.
		car.setGas(5);
		
		// 3. 현재 자동차 가스 상태를 검사합니다.
		boolean gasState = car.isLeftGas();
		
		// 4. 차를 출발시킵니다. (가스 상태가 참이면)
		if(gasState) {
			System.out.println("출발합니다.");
			
			// 시동걸고 출발했으므로 달립니다.
			car.run();
		}
		
		// 5. 출발한 차가 가스가 있는 동안 달립니다.
		// 가스가 남아있으면 가스충전 필요업슴 출력
		// 가스가 없으면 가스를 새로 주입해주세요.
		if (car.isLeftGas()) {
			System.out.println("가스를 주입할 필요가 없습니다.");
		} else {
			System.out.println("가스를 주입해주세요");
		}
		
	}

}
