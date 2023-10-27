package ch06.sec05.exam03;

// Car 객체를 실행하기 위한 실행 클래스
public class CarExample {
	// 인스턴스 필드
	String title = "Car 프로그램";
	
	// 인스턴스 메소드
	public void printString() {
		System.out.println("개발언어는 자바입니다.");
	}
	// 스태틱 메소드
	
	// main()는 엔트리포인트(시작점 = 시작함수)
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60; // 이 형식은 아무 문제가 없습니다.
		myCar.run(); // 이 메소드도 잘 실행됩니다.
		
		// 객체를 생성하지 않고 인스턴스 멤버를 호출하려고 하면 컴파일 오류가 발생
		
		// 인스턴스 필드를 객체생성 없이 사용하면 메모리에 객체 실체가 없으므로 접근할 데이터가 없으므로 오류
		//System.out.println("프로그램 제목은 " + title + "입니다.");
		CarExample ce = new CarExample();
		 System.out.println("프로그램 제목은 " + ce.title + "입니다.");
		// printString(); 인스턴스 메소드를 혼자 호출함
		// 실체가 없으므로 메소드를 부를 수 없어 에러
		ce.printString();
		
		/// 스태틱 멤버필드와 스태틱 메소드의 경우
		printWriter();
	}
}
