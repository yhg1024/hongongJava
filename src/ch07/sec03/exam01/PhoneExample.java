package ch07.sec03.exam01;

// 실행클래스
public class PhoneExample {
	public static void main(String[] args) {
		// Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		// phone 클래스의 기능
		smartPhone.turnOn();
		
		// smartphone 클래스의 기능
		smartPhone.internetSearch();
		
		
		smartPhone.turnOff();
	}
}
