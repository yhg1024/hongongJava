package ch11.sec02.exam18;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		// substring(시작인덱스, 끝 인덱스)
		// 부분문자열을 가져온다. 시작인덱스부터 출발하여 마지막 인덱스 -1까지 가져온
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		// 두번째 구간 숫자의 시작이 7번인덱스부터 
		//  끝나는 마지막 인덱스는 (문자열의 크기 -1)로 구함
		System.out.println("012345678901234");
		System.out.println(ssn.length());
		String secondNum = ssn.substring(7, ssn.length());
		System.out.println(secondNum);
	}
}
