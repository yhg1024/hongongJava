package ch04.sec02.Quiz;

import java.util.Scanner;

/*작성자 : 양형경*/

public class checkPoint07Bank {
	
	public static void main(String[] args) {
		// while문과 Scanner를 이용해서 키보드로 입력
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		int x;
		int i = 0;
		
		while(run) {			
			System.out.println("------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3. 잔고 | 4.종료");
			System.out.println("------------------------------------");
			System.out.print("선택 > ");
			// 키보드로 1번을 누르면 예금라인
			x = scanner.nextInt();
			if (x == 1) {
			System.out.print("예금액>");
			i = scanner.nextInt();
			// 잔고
			i = i + i;
			} else if (x == 2) {			
			// 키보드로 2번을 누르면 출금
			System.out.print("출금액>");
			i = scanner.nextInt();
			// 잔고
			i = i - i;
			} else if (x == 3) {
				// 키보드로 3번을 누르면 잔고
				System.out.println("잔고>" + i);
				
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
