package ch07.extra.exam01;

public class Programming {
	// 상속은 컴퓨터 입장에서 구체화한다이다.
	// 부모클래스는 추상화한다
	// 밑으로 갈수록 상세하다
	
	// 다형성: 똑같은 걸 구현하는데 구현하는 방식이 다르다
	
	// 연산기능
	void 연산기능() {
		System.out.println("연산기능을 실행했습니다.");
	}
	
	// 입력기능
	
	void 입력기능() {
		System.out.println("데이터를 입력합니다.");
	}
	
	// 출력기능
	void 출력기능() {
		System.out.println("데이터를 출력흡니다.");
	}
	
	// 제어기능
	private void 제어기능 () {
		System.out.println("조건을 비교하여 선택 실행합니다.");
	}
	
	// 반복기능
	private void 반복기능() {
		System.out.println("정해진 수만큼 반복합니다.");
	}
	
	void toDoEnable() {
		System.out.println(">>>여기는 Programming 객체의 toDoEnable 기능입니다.");
		연산기능();
		입력기능();
		출력기능();
		제어기능();
		반복기능();
		System.out.println("-Programming 객체의 toDoEnable 기능 끝 -");
	}

}
