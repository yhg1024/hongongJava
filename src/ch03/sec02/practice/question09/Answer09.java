package ch03.sec02.practice.question09;

import java.util.Scanner;

public class Answer09 {
	public static void main(String[] args) {
		// 키보드를 입력받을것이므로 Scanner 클래스 필요
		Scanner scanner = new Scanner(System.in);

		// 두 수를 입력받을 것이므로 변수 두개가 필요
		System.out.println("첫번째 수를 입력하세요 :)");
		double number1 = Double.parseDouble(scanner.nextLine());
		System.out.println("두번째 수를 입력하세요 :)");
		double number2 = Double.parseDouble(scanner.nextLine());

		System.out.println("-----------------------------------");
		// 에러가 발생했을 경우
		// 1. 나누는 수 number2가 0또는 0.0(논리합) 으로 나누었을 때 처리
		// 2. 어떤 상황이 일어나면 그 처리를 해라 (조건문필요)
		// number2는 0이거나 0.0이면 안된다.

		/*
		 * if ((number2 == 0.0) || (number2 == 0)) { System.out.println("결과: 무한대"); }
		 * else { // 첫번째 수를 두번째수로 나눈다. double result = number1 / number2;
		 * System.out.println("결과 : " + result); }
		 */
		
		// 실제 프로그램은 정상적으로 동작하고
		//	혹시나 예외(에러가)나면 에러처리가 동작하도록하는 것이 좋은 구조이다.
		if (number2 != 0.0) {
			double result = number1 / number2;
			System.out.println("결과 : " + result);
		} else {
			//0으로 나눈 경우
			System.out.println("결과: 무한대");
		}

	}
}
