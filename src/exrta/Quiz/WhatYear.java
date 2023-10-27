package exrta.Quiz;

import java.util.Scanner;

public class WhatYear {
	public static void main(String[] args) {
		// 사용자가 키보드로 연도입력
		System.out.println("연도를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		
		int year = scan.nextInt();
		
		// 입력한 연도가 윤년인지 평년인지
		if (year % 4 == 0 || year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}
	}
}