package ch05.sec02.exam04.ex1;

public class Ex1ArrayDeclareExample {
	
	public static void main(String[] args) {
		// 배열을 선언하기
		// 10명의 학생성적저장하는 배열 선언만 했습니다. 
		// int[] score = new int[10];
		String[] score = new String[10];
		
		
		// 초기화 아직 안했습니다.
		// 초기화는 new 타입[] {} 형식
		
		// 혹시 이상태에서 배열의 내용을 출력해보면
		for (int i = 0; i < score.length; i++) {
			// white space단위로 enter 명령과 데이터, 문자열을 아래로
			System.out.println(
					"[" + i + "] = " + score[i]);
			
		}
	}

}
