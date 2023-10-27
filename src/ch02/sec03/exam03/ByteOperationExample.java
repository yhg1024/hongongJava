package ch02.sec03.exam03;

public class ByteOperationExample {
	public static void main(String[] args) {
		// 컴파일 할때 내부적으로 인트로 바뀐다
		// 연산을 먼저 한거라 열려있는 상수로 내부적으로 int로 바뀌는것
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		// 소스는 관련이 있는 것끼리 묶기
		/* 이 부분은 byte 자료형이 자동으로 int 자료형을 자동형 변환 됩니다. */
		//변수에 따로 담을 떄는 무조건 int로 바꿔야한다.
		// 변수에 담겨있는 정수라 열어서 확인해야해가지구 int로 변환
		byte x= 10;
		byte y = 20;
		int result2 = x + y;
		System.out.println(result2);
	}
}
