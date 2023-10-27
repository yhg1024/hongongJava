package ch05.sec02.exam01;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		// 정수 배열 선언
		// 변수를 선언할 때 값을 대입하는 것
		// = 초기화 (이니셜라이즈 = initialize)
		// int [] scores = {}; // 빈 배열
		// 배열의 크기가 3인 정수배열 생성
		int[] scores = { 83, 90, 87 };
		// or int scores[] => c언어 스타일

		// scores 배열의 첫번째 요소 index번호로는 0
		System.out.println("scores[0] : " + scores[0]);

		// scores 배열의 첫번째 요소 index번호로는 1
		System.out.println("scores[1] : " + scores[1]);

		// scores 배열의 첫번째 요소 index번호로는 2
		System.out.println("scores[2] : " + scores[2]);
		
		 System.out.println("---------------------------------");
		
		// 반복문을 이용하여 출력해보기
		for (int index = 0; index < 3; index++) {
			// scores 배열의 index 번호로 배열의 각요소에 접근
			System.out.println("scores[" + index + "] : " + scores[index]);
		}
		
		// scores 배열의 크기(=갯수) 구하는 변수 선언
		int scoresLength= 0;
		int sum = 0; // 현재 합계낸적이 없음 따라서 초기값은 0이 좋음
		for (int index = 0; index < 3; index++) {
			scoresLength++; // 현재 사용중인 배열의 수
			sum = sum + scores[index];
		}
		System.out.println("scores배열의 총합은 " + sum);
		// 평균구하기
		double avg = (double)sum / scoresLength;
		System.out.println("scores배열의 평균 " + avg);
	}

}
