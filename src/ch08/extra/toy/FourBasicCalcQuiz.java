package ch08.extra.toy;

import java.util.Random;

public class FourBasicCalcQuiz extends Quiz {
	// 필드
	final 

	// 생성자
	public FourBasicCalcQuiz() {
		
	}

	// 메소드
	@Override
	void createQuestion() {
		Random rnd = new Random();

		int choice = rnd.nextInt(4);

		// 두 수의 난수를 발생시킨다.
		// 그 두수와 연산자를 화면에 출력한다.
		// 문제를 출력
		// 예) 100 + 100 = ??? 연산의 결과는?
		// 그 문제의 정답을 출력
		// 예) 정답: 100 + 100 = 200입니다.
		// 도움말 출력
		// 예) 두 수의 연산에 대한 문제입니다.
		
		int num1 = 0;
		int num2 = 0;
		int result = 0;

		switch (choice) {
		case 0: // 덧셈

			break; // case 0 정지
		case 1: // 뺄셈
			break; // case 뺄셈 정지
		case 2: // 곱셈
			break; // case 곱셈 정지
		case 3: // 나눗셈
			break; // case 나눗셈 정지
		}
	}

	@Override
	public String getHint() {
		return this.hint;
	}

}
