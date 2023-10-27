package ch02.sec02.exam04;

public class CharExample {
	public static void main(String[] args) {
		//약속된거니까 그냥 외워라
		char c1 = 'A'; // 문자를 직접 저장
		char c2 = 65; // 10진수 코드
		char c3 = '\u0041'; // 16진수 유니코드
		
		char c4 = '가'; // 한글을 직접 저장
		char c5 = 44032; // 10진수 저장
		char c6 = '\uac00'; //16진수 저장
		
		double d1 = 1_000_000.123_456;
		//이스케이프 시퀀스 (escape sequence) "문자의 문자)
		// \" : " 문자출력
		// \' : ' 문자 출력
		// \\ : \ 문자 출력
		// \n : 새행으로 커서 이동
		// \r : 현재 라인의 제일 첫 열로 이동
		// \v : 수직 탭
		// \t : 여러칸을 출력(tab)
		// 이스케이프 시퀀스 연습
		String greeting = "안녕하세요 \n \'Hello\'\t\t\"Hi\"";
		System.out.println(greeting);

		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);
		System.out.println("c5 = " + c5);
		System.out.println("c6 = " + c6);
		
		//소수점 자리 비료
		float flt1 = 0.1234567890123456789f;
		double dbl1 = 0.1234567890123456789;
		
		System.out.println("flt1 = " +flt1);
		System.out.println("db12 = " +dbl1);
	}
	
}
