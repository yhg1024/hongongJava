package ch03.sec02.exam12;

public class pencilPerStudent {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		// 학생 1명이 가지는 연필 개수
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);
		
		// 남은 연필 개수
		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft);
	}
}
