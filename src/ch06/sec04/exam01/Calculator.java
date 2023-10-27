package ch06.sec04.exam01;

public class Calculator {
	// 명령메소드 = 반환값 필요없다.
	//전원을 켠다.
	void powerOn() {
		System.out.println("계산기의 전원을 켭니다.");
	}
	// 전원을 끈다.
	void powerOff() {
		System.out.println("계산기의 전원을 끕니다.");
	}
	// 기능메소드 == 반환값이 있을 수 있습니다.
	int add(int x, int y) {
		return x + y;
	}
	
	// 뺄셈
	int sub(int x, int y) {
		return x- y;
	}
	
	// 곱셈
	int mul(int x, int y) {
		return x * y;
	}
	
	// 나눗셈(오버로딩) : 
	//  메소드의 시그니쳐가 다를경우 시그니쳐에는 메소드 선언중 반환값이 안들어간다.
	double divide(double x, double y) {
		return x / y;
	}
	//정수 몫만 반환하는 경우
	int divide(int x, int y) {
		return x / y;
	}
	// 나머지
	int mod(int x, int y) {
		return x % y;
	}

}
