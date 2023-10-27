package ch03.sec02.exam13;

/*작성자: 양형경
작성일: 2023.09.07*/

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//키보드로 7.3, 2.5를 입력받는다.
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double result;
		
		System.out.println("첫번째 수 : " + a);
		System.out.println("두번째 수 : " +b);
		
		System.out.println("-----------------------------");
		
		// 첫번째수 / 두번째수 = 결과 : 값 출력
		result = a / b;
		System.out.println("결과 :" + result);
		
		// 첫번째수 / 0 or 0.0 = 결과 : 무한대
	}

}
