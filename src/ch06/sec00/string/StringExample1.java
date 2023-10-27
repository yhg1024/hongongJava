package ch06.sec00.string;

public class StringExample1 {
	public static void main(String[] args) {
		// 문자열 선언
						//0123456789012
		String proverb = "A barking dog"; // new 연산자 생략
		String s1; // 문자열결합 저장 변수
		String s2; // 문자 교환
		String s3; // 부분문자열 구하기
		String s4; // 대문자로 교환
		
		s1 = proverb.concat(" never Bites!"); // proverb + "never Bites!";
		s2 = s1.replace('B', 'b'); // 'B'를 'b'로 고침
		s3 = proverb.substring(2,5); // 인덱스 2부터 인덱스 5까지의 부분문자열을 가져오세요 
									 // 2-4까지 5번째 안들어감. 
		                             // 보통 인덱스는 0부터 From ~ To에서 From은 들어가고 To는 안들어감
		s4 = proverb.toUpperCase(); // 대문자로 바꾸시오
		
		// 변환 결과 출력
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}

}
