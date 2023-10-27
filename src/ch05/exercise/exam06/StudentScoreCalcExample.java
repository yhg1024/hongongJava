package ch05.exercise.exam06;

import java.util.Scanner;

public class StudentScoreCalcExample {

	public static void main(String[] args) {
		// 기호 상수
		// 이 부분의 내용은 나중에 Enum클래스로 발전하게 됩니다.
		final int MENU_STUDENT_NUMBER = 1;
		final int MENU_SCORE_INPUT = 2;
		final int MENU_SCORE_LIST = 3;
		final int MENU_SCORE_ANALYSIS = 4;
		final int MENU_APP_EXIT = 5;
		
		boolean run = true; // 학생점수관리 프로그램 루프
		// 학생수 저장 변수
		int studentNum = 0;
		// 학생들 점수를 관리할 변수 (배열이용)
		int[] scores = null; // 참조타입의 9에 가까운 값은 null로 본다.

		// 점수를 입력하고 메뉴를 제공하는 유틸객체
		Scanner scanner = new Scanner(System.in);

		// 점수프로그램 관리 루프
		while (run) {
			// 1. 관리메뉴 출력
			System.out.println("===========================================================");
			// 메뉴 출력
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------------------");
			System.out.println("선택 > ");

			// 메뉴선택
			int selectNo = scanner.nextInt();

			// 선택한 메뉴처리
			// if (selectNo == 1)
			switch (selectNo) {
				// 학생수 선택 메뉴와 일치
				case MENU_STUDENT_NUMBER:
					// '학생수>' 라는 프롬프트 출력
					System.out.println("학생수> ");
					// 학생수 입력
					studentNum = scanner.nextInt();
					// 학생수가 정해졌으므로 학생점수들을 저장 scores배열 초기화
					scores = new int[studentNum];
					
					break;
				
				// 점수 입력 메뉴와 일치
				case MENU_SCORE_INPUT:
					for (int i = 0; i < scores.length; i++) {
						System.out.println("scores[" + i + "]> ");
						scores[i] = scanner.nextInt();
					}
					
					break;
					
				// 점수 리스트 메뉴와 일치
				case MENU_SCORE_LIST:
					// 배열이므로 루프로 순차적으로 인덱스를 증가 시켜 배열의 내용출력
					for (int i = 0; i < scores.length; i++) {
						System.out.println("scores[" + i + "]> " + scores[i]);
					}
					
					break;
					
				//점수 분석
				case MENU_SCORE_ANALYSIS:
					int max = 0; // 최고점수
					int total = 0; // 총점
					double avg = 0.0; // 평균
					
					for (int i = 0; i < scores.length; i++) {
						max = (max < scores[i]) ? scores[i] : max;
						total = total + scores[i];
					}
					
					avg = (double) total / scores.length;
					
					//총점/평균/최고점수 출력
					System.out.println("최고점수 : " + max);
					System.out.println("총점 : " + total);
					System.out.println("평균 : " + avg);
					
					break;
					
				// 프로그램 종료
				case MENU_APP_EXIT:
					run = false;
					System.out.println("프로그램이 종료되었습니다.");
					
					break;
					
				// 메뉴에 없는 선택
				default:
					System.out.println("메뉴선택이 잘못 되었습니다.");
					
					break;
			}

		}

	}

}
