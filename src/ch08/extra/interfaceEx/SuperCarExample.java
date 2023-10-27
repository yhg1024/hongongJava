package ch08.extra.interfaceEx;

public class SuperCarExample {
	
	public static void main(String[] args) {
		// SuperCar 객체가 생성
		SuperCar sc = new SuperCar();
		
		// 슈퍼카객체의 기능들을 테스트		
		sc.startEngine(); // 엔진 시동을 겁니다. :  Vehicle인터페이스의 기능
		sc.run(); // 도로를 달립니다. : Car 인터페이스의 기능
		sc.fly(); // 창공을 가로지릅니다. : Plain 인터페이스의 기능
		sc.ship(); // 바다위를 둥둥 떠다닙니다. : Ship의 인터페이스
		sc.stopEngine(); // 
		
		System.out.println("객체를 통한 메소드 호출 -fin-");
		
		// 부모클래스 타입으로 참조변수를 만들어 SuperCar 객체를 참조하게 하는 경우
		Vehicle ve = sc; // 인터페이스형 vehicle타입만 보임
		ve.startEngine(); // Vehicle타입이 가진 메소드만 보임
		ve.stopEngine();
		
		Ship sh = sc;
		sh.ship();
		
		Plain plain = sc;
		plain.fly();
		
		Car car = sc;
		car.run();
		////////////////////////////
		
		System.out.println("인터페이스 형식의 부모참조변수로 변환 -fin-");
		
		// 위의 부모타입으로부터 다시 자식객체로 만드는 경우
		// 강제형변환(다운캐스팅)을 이용
		SuperCar superCar = (SuperCar) ve;
		superCar.startEngine();
		superCar.stopEngine();
		superCar.run();
		superCar.ship();
		superCar.fly();
		
		System.out.println("Vehicle인터페이스 형식을 다시 SuperCar참조변수로 가르키도록(참조)");
		
	}

}
