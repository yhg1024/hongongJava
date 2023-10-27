package ch04.sec02.exam02;

public class ForSumFrom1To100Example1 {
	public static void main(String[] args) {
		
		int sum = 0;
		int sum1 = 0;
		
		// 1~100의 합을 구하는 코드		
		for(int i = 0; i <= 100; i++) {
			// 반복될 내용
			// 홀수의 누적합
			if (i % 2 == 1) {
				sum = sum + i;
			}
			
			if (i % 3 == 0) {
				sum1 = sum1 +i;
			}
			
		}
		
		System.out.println("1 + 3 + 5 +... + 99 = " + sum);
		System.out.println("3 + 6 ... + 100 = " + sum1);
		
		
	}

}
