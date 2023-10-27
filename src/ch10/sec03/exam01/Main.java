package ch10.sec03.exam01;

public class Main {
	public static void main(String[] args) {
		// 강아지 클래스 타입 d가 Dog 객체 방을 참조합니다.
		Dog d = new Dog();
		// 따라서 제대로 bark() 메소드를 호출
		System.out.println(d.bark());
		
		// 부모클래스 참조변수 a는 Dog객체를 가르킴
		// 업캐스팅으로 부모객체의 구조만 보임
		// 부모타입으로 가르키더라도 실체 객체는 
		//  dog이므로 dog의 bark()메소드를 호출
		// '부모객체처럼' 부모가 아니다.
		Animal a = new Dog();
		System.out.println(a.bark());
		
		// 부모클래스가 고양이를 가르킨다.
		Animal c = new Cat();
		System.out.println(c.bark());
	}
}
