package ch04.sec02.exam07;

public class WhileSumFrom1To100Example {
	public static void main(String[] args) {
		
		// i = sum 1 ~ 1000
		
		int i = 1; // 루프카운트 변수
		int sum = 0; // 합계저장 변수
		
		while (i <= 1000) {
			sum = sum + i;
			i++;						
		}
		
		System.out.println(
				"1 ~" + (i - 1) + "합 : " + sum);
	}

}
