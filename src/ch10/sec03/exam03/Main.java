package ch10.sec03.exam03;

public class Main {

	public static void main(String[] args) {
		Animal dog = new Animal() {
			public String bark() {
				return "강아지가 짖습니다.";
			}
			
			public String run() {
				return "달리기를 합니다.";
			}
		};
		
		// 객체 사용
		dog.bark(); // 부모클래스로 참조하므로 부모처럼 작동(부모 멤버만)
	
	}
}
