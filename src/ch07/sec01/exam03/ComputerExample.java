package ch07.sec01.exam03;

public class ComputerExample {
	public static void main(String[] args) {
		// 반지름 10
		int r = 10;
		
		// 부모클래스 Calculator 객체 생성
		Calculator calculator = new Calculator();
		System.out.println("Calculator의 원 면적: " + calculator.areaCircle(r));
		// 아래위 객체를 비교할 것이기 때문에
		System.out.println(); // 빈줄을 추가한다.
		
		// Computer 클래스 객체 생성
		Computer computer = new Computer();
		System.out.println("Computer의원 면적: " + computer.areaCircle(r));
		
	}

}
