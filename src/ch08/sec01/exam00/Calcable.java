package ch08.sec01.exam00;

public interface Calcable {
	// 덧셈을 할 수 있는 메소드 선언
	int add(int x, int y);
	
	// 다음 메소드를 반드시 구현해주세요. 
	// 고객이 프로그램에 다음의 사항은 반드시 지켜주세요.라고 요청
	// 그럼 반드시 구현했는지 어떻게 강제할 수 있을까
	// 예) int add(int x, int y)
	//	   int sub(int x, int y)
	//  위 두 메소드를 구현했는지 어떻게 보장할 수 있을까
}
