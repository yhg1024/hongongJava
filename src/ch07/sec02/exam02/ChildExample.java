package ch07.sec02.exam02;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		// 부모 타입으로 자식 객체를 가리킴
		Parent parent = child; // 자동으로 타입변환
		
		// 이 참조변수로 각 메소드를 부르면 어떻게 될까
		parent.method1(); // 부모 객체만 가지고 있으므로 부모 객체의 메소드가 불린다.
		parent.method2(); // 자식객체에서 새로 재정의 되었으므로 자식 객체의 메소드가 불린다.
		// parent.method3(); // 부모 객체에서는 없는 내용이므로 예외발생
							 // 이 클래스 사용하려면 주석 처리해야한다
	}

}
