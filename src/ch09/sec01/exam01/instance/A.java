package ch09.sec01.exam01.instance;

public class A {
	// 외부 A 클래스용 생성자
	A() {
		System.out.println("A객체가 생성됨!");
	}
	
	// 인스턴스 멤버 클래스
	class B {
		// 중첩클래스 B용 생성자
		B() {
			System.out.println("B 객체가 생성됨");
		}
		// 중첩클래스 B 필드
		int field1;
		// 중첩 클래스 B용 정적필드도 될까요
		static int field2;
		// 중첩클래스 B용 메소드
		void method1() {
			System.out.println("중첩객체 B의 method1() 실행");
		}
		// 중첩클래스 B용 정적 메소드 가능할까
		static void method2() {
			System.out.println("중첩객체 B의 method2() 실행");
		}
	}

}
