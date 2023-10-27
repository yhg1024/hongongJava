package exrta.sec03.StringScannerPractice;

import java.util.Scanner;

public class Practice1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 학생이름을 키보드로 입력받습니다.
		String name = scanner.nextLine();
		System.out.println("학생이름: " + name);
		
		// 학생 국어성적, 영어성적, 수학성적을 입력받습니다.
		int koreanLanguageGrade = scanner.nextInt();
		System.out.println("국어성적: " + koreanLanguageGrade);
		
		int englishLanguageGrade = scanner.nextInt();
		System.out.println("영어성적: " + englishLanguageGrade);
		
		int mathGrade = scanner.nextInt();
		System.out.println("수학성적: " + mathGrade);
		
		//
		
		// 총점을 구하고 평균을 구하세요.
		
		int total;
		int avg;
		
		total = koreanLanguageGrade + englishLanguageGrade + mathGrade;
		System.out.println("총점: " + total);
		avg = total / 3;
		System.out.println("평균: " + avg);
		
	}

}
