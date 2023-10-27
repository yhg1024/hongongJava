package ch11.sec02.exam13;

public class StringEqualsExample {
	
	public static void main(String[] args) {
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";
		
		// 얕은 비교 : 참조변수의 가르키는 힙의 주소만 비교
		if (strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		// 깊은 비교 : 참조변수가 가르키는 힙의 해장 데이터까지 비교
		if (strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 참조");
		} else {
			System.out.println("다른 문자열을 참조");
		}
	}

}
