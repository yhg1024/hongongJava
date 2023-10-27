package ch07.sec03.exam02;

// 모든 자식의 공통된
public abstract class Animal {
	
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 울음 소리 내기 추상메소드
	// 함수정의가 없어서 선언만 있어서 불완전(abstract)하다
	public abstract void sound(); 

}
