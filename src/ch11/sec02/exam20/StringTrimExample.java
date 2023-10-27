package ch11.sec02.exam20;

public class StringTrimExample {
	
	public static void main(String[] args) {
		String tel1 = " 02";
		String tel2 = "123   ";
		String tel3 = "     1234     ";
		
		// 좌측공백 제거 + 오른쪽공백제거 + 좌우공백제거
		String tel = tel1.trim() + 
				tel2.trim() +
				tel3.trim();
		
		// 공백 제거 전
		System.out.println(tel1 + tel2 + tel3);
		
		// 공백 제거 후
		System.out.println(tel);
		
		// replace를 이용해서 공백제거하기
		// 이 경우는 문자열 중간에 여백이 있는 경우
		//  중간여백을 제거하고 싶을 때 쓰면 좋음
		// 예 : " 0 2 2 22 2 11 1 1 "
		//  -> "0222221111
		System.out.println((tel1 + tel2 + tel3).replace(" ", ""));
		
	}

}
