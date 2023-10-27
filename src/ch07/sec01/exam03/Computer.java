package ch07.sec01.exam03;

public class Computer extends Calculator{
	
	@Override // 실행주석 (@~) 은 내부적으로 클래스 입니다.
	// 따라서 @다음에 대문자로 시작합니다.
	double areaCircle(double r) {
		// 이 규칙은 꼭 준수하세요
		
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

}
