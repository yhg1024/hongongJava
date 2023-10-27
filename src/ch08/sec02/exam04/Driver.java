package ch08.sec02.exam04;

public class Driver {
	public void drive(Vehicle vehicle) {
		
		// 버스이면 요금을 확인하고 달린다.		
		if (vehicle instanceof Bus) { // vehicle 참조변수가 가르키는 객체가 Bus인지 확인
			Bus bus = (Bus) vehicle; // Bus객체이면 강제로 Bus 객체로 변환, 자식객체의 기능을 사용하려함
			bus.checkFare(); // 자식객체(Bus)의 메소드 사용
		}
		
		// 다른 차종은 그냥 달려도 된다.
		vehicle.run();
	}

}
