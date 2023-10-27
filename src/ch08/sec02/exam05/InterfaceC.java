package ch08.sec02.exam05;

public interface InterfaceC extends InterfaceA, InterfaceB{
	// 인터페이스가 extends한다라는 뜻은 InterfaceA의 methodA()를 가진다.
	//  또 InterfaceB의 methodB()를 가진다.
	// 자기만의 InterfaceC의 methodC()도 가진다.
	void methodC();

}
