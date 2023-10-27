package ch03.sec02.exam11;

public class conditionalOperationExample {
	public static void main(String[] args) {
		// 점수 판정 예제		
		int score = 85;
		
		// 점수가 90점이 아니므로 거짓부분이 실행됩니다.
		// 거짓부분에서 다시 삼항연산자를 비교하고 있습니다.
		// 그 결과 80점보다 크므로 'B'값이 선택됩니다.
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}

}
