package ch05.sec02.Checkpoint;

/*작성자: 양형경*/

import java.util.Scanner;

public class CheckPoint06 {
	
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
			} else if (selectNo == 2) {
				scores = new int [studentNum];
				for (int i =0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(scanner.nextLine());
					
				}
				/*
				 * scores = new int[] {Integer.parseInt(scanner.nextLine())
				 * ,Integer.parseInt(scanner.nextLine()) ,Integer.parseInt(scanner.nextLine())};
				 * System.out.println("scores[0]>" +scores[0]); System.out.println("scores[1]>"
				 * +scores[1]); System.out.println("scores[2]>" +scores[2]);
				 */
				
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i +"]> "+scores[i]);
				}
				
			} else if (selectNo == 4) {
				int max =0;
				int sum = 0;
				
				double avg;
				
				for(int i = 0; i < scores.length; i++) {
					
					
					if(max < scores[i]) {
						max = scores[i];
					}
					
					sum += scores[i];
					
				}
				avg = (double)sum / scores.length;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램종료");
	}

}
