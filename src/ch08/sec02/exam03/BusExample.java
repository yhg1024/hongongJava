package ch08.sec02.exam03;

public class BusExample {

	public static void main(String[] args) {
		// 자손클래스 Bus객체를 생성해서 인터페이스 Vehicle형의 부모참조변수 vehicle변수로 참조한다.
		Vehicle vehicle = new Bus();
		vehicle.start(); // 버스가 출발
		vehicle.run(); // 버스가 달립니다.
		vehicle.stop(); // 버스가 정지합니다.
		
		// 강제로 버스로 만들어 부모가 자식객체의 나머지를 참조할수 있도록 하자
		//  이것을 강제형식 변환이라고 합니다. (DownCasting)
		// 다운캐스팅은 반드시 부모객체가 참조하던(가르키던) 구현타입과 같아야한다.
		Bus bus = (Bus) vehicle; // vehicle이 원래 가르키던 bus객체를 의미
		
		// bus의 문을 엽니다.
		bus.openDoor();
		
		// bus의 문을 닫습니다.
		bus.closeDoor();
		
		// 요금을 확인합니다.
		bus.checkFare();
	}
}
