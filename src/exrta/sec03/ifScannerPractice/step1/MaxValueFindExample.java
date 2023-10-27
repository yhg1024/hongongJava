package exrta.sec03.ifScannerPractice.step1;

import java.util.Scanner;

public class MaxValueFindExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 정수를 입력하세요 scanner.nextInt()
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.println("첫번째 정수를 입력: ");
		int i = scanner.nextInt();

		System.out.println("두번째 정수를 입력: ");
		int j = scanner.nextInt();

		System.out.println("세번째 정수를 입력: ");
		int k = scanner.nextInt();
		
		/*
		 * int max = 0;
		 * 
		 * // 먼저 i > j비교하고 큰 값을 max에 대입 if (i > j) { max = i; } else if (i == j) { max =
		 * i; } else if (i < j) { max = j; }
		 * 
		 * // max와 k를 비교 큰값을 max에 대입 // 이렇게 하면 실제 데이터는 보존된다. if (max > k) {
		 * 
		 * } else if (max == k) {
		 * 
		 * } else if (max < k) { max = k; }
		 * 
		 * System.out.println(i + ", " + j + ", " + k + ",  중 max 값은 : " + max);
		 */

	}

}
