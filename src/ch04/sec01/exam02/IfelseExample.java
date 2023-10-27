package ch04.sec01.exam02;

import java.util.Scanner;

public class IfelseExample {
	public static void main(String[] args) {
		// 조건을 키보드로 입력
		Scanner scanner = new Scanner(System.in);
		// 점수를 입력해주세요.
		System.out.println("점수를 입력해주세요.");
		int score = scanner.nextInt();
		// 등급 변수 선언
		char grade = '\u0000';
		String up;

		// 점수가 90보다 작습니다.
		// score >= 90 이면 'A'학점
		// 아니면 'B'학점
		if (score >= 90) {
			grade = 'A';
		} else {
			grade = 'B';
		}

		// 점수를 출력한다.
		System.out.println("점수가 " + score + "점입니다. ");
		System.out.println("등급은 " + grade + "입니다.");

	}

}
