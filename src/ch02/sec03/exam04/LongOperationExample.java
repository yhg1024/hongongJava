package ch02.sec03.exam04;

public class LongOperationExample {
	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		// L은 소문자를 붙여줘도 좋지만 가능한 대문자로 붙여줘라
		long value3 = 1000L;
		long result = value1 + value2 + value3;
		System.out.println(result);
	}
}
