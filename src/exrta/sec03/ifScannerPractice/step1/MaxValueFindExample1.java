package exrta.sec03.ifScannerPractice.step1;

import java.util.Scanner;

/*작성자: 양형경*/

public class MaxValueFindExample1 {
	
	public static void main(String[] args) {
		
		// 정수 입력은 Scanner 클래스를 이용하여 키보드로부터 입력받는다.
		Scanner scanner = new Scanner(System.in);
		
		// 3개의 정수값 입력받기
		int i;
		int j;
		int k;
		i = scanner.nextInt();
		j = scanner.nextInt();
		k = scanner.nextInt();
		
		System.out.println("i의 값 " +i);
		System.out.println("j의 값 " +j);
		System.out.println("k의 값 " +k);
		
		// 가장 큰 수를 구하기		
		// i > j / i > k 
		if (i > j && i > k) {
			System.out.println("최대값은 " + i + "입니다.");
		} else if (j > i && j > k) {
			System.out.println("최대값은 " + j + "입니다.");
		} else {
			System.out.println("최대값은 " + k + "입니다.");
		}
	}

}
