package ch08.sec02.exam05;

public class MultiInterfaceExample {
	public static void main(String[] args) {
		// 구현클래스 ImplClassA 객체 생성
		ImplClassA impClassA = new ImplClassA();
		
		// implClassA를 통하여 메소드 호출
		impClassA.methodA();
		impClassA.methodB();
		impClassA.methodC();
		
		// InterFaceA 타입으로 참조하는 경우
		InterfaceA ia = impClassA;
		ia.methodA();
		System.out.println(); // 한줄 구분하기 위해
		
		// InterFaceB 타입으로 참조하는 경우
		InterfaceB ib = impClassA;
		ib.methodB();
		System.out.println(); // 한줄 구분하기 위해
		
		// InterFaceC 타입으로 참조하는 경우
		InterfaceC ic = impClassA;
		ic.methodA(); // InterfaceC는 InterfaceA를 상속했으므로 methodA()를 실행
		ic.methodB(); // InterfaceC는 InterfaceB를 상속했으므로 methodB()를 실행
		ic.methodC(); // InterfaceC는 InterfaceC를 상속했으므로 methodC()를 실행
		System.out.println(); // 한줄 구분하기 위해
		
	}

}
