package ch08.extra.toy;

import java.util.Random;

public class GugudanQuiz extends Quiz {

	// 필드

	// 생성자
	GugudanQuiz() {
		createQuestion();
	}

	// 메소드
	@Override
	void createQuestion() {
		// 구구단 퀴즈 알고리즘
		// 1. 난수로 몇단인가를 생성
		// 조금 더 확장해서 사용자 입력을 받아도 된다.
		// 2. 출제된 구구단 계산결과에서 사용자에게 보여주지 않을 위치번호 생성
		// 예) 난수 3단을 생성 3열을 안보여주려고 한다.
		// 위치 : 1| 2| 3| 4| 5| 6| 7| 8| 9
		// 구구단: 3*1|3*2| 0|3*4|3*5|3*6|3*7|3*8|3*9
		// 난수를 발생시킵니다.
		// 3. 구구단 계산 결과 화면에 출력
		// 화면에 보여줄 계산결과와 화면에 보여주지 않을 사용자가 입력할 계산 결과를 합쳐서
		// 문제를 생성하여 문자열을 화면에 출력
		// 4. 정답 문자열을 생성
		// 5. 힌트 문자열을 생성

		// 1.
		// Math.random() : 사용하기 편한 대신 세세한 성정하려 할때 복잡함
		// Random 클래스: 객체를 생성해야하고 메소드를 학습해야하지만 응용성이 좋음.
		// 이쪽이 더 응용하기 좋음
		Random rnd = new Random();

		// 2.
		// 몇단인가 난수 생성
		int dan = rnd.nextInt(9) + 1; // 0 <= dan < 10인 정수
		// 출제된 문제에서 감춰질 위치번호
		int qId = rnd.nextInt(10);
		final int MAX_QUESTION_ID = 9; // 구구단의 마지막 열

		// 3.
		// 화면에 출력할 문자열
		// 문제와 정답 두개가 있습니다.
		this.question = ""; // 현재 문제 출제 안되었음
		this.answer = ""; // 현재 정답 생성 안되었음

		// 구구단 열을 생성하는 루프 1~9까지
		for (int i = 0; i < MAX_QUESTION_ID; i++) {
			// 이쪽은 동시에 일어나야하고 선택을 함으로 if ~ else 구문 사용
			// 구구단 계산 결과를 보여줄때
			if (i == (qId - 1)) { // 1을 빼는 이유는 컴퓨터 내부에서는 0부터 시작이기 때문
				this.question += "[*]"; // 빈칸 출력
			} else {
				// 보여주지 않을때
				this.question += "[" + (dan *( i + 1)) + "]";
				// 그 열의 구구단 값을 출력
				// for 루프가 0부터 인덱스를 세고 있으므로 1열부터 계산하려면 인덱스 +1
			}

		}
		// 문제 문자열 완성
		this.question += "\n *에 들어갈 수는 몇일까?";

		// 정답 문자열 완성
		this.answer = "정답 : " + (dan * qId);
	}

	@Override
	public String getHint() { // 힌트 추가
		return "우선 구구단이 몇단인지 생각해보세요.";
	}

}
