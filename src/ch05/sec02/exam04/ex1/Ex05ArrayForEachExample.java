package ch05.sec02.exam04.ex1;

public class Ex05ArrayForEachExample {

	public static void main(String[] args) {
		int[] numbers = new int[] { 10, 20, 30 };

		// 향상된 for ~ each 반복문
		// 자바가 알아서 해준다.
		// 변수 value에는 첫번째 원소부터 마지막 배열 원소까지 차례로 알아서 대입된
		System.out.println("for ~ each 방식 반복문");
		for (int num : numbers) {
			System.out.println(num);
		}

		// 단순 반복형 for 반복문
		System.out.println("단순/반복형 for 반복문");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
	}

}
