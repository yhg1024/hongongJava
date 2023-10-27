package ch08.sec02.exam03;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		
		
		vehicle.run();
		// vehicle.checkFare();
		
		Bus bus = (Bus)vehicle; 
		// 부모클래스를 버스 타입으로 강제 형변환
		//  그래서 지금부터 bus변수는 Bus타입이 된다.
		
		bus.run();
		bus.checkFare();
	
	}

}
