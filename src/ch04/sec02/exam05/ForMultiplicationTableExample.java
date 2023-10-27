package ch04.sec02.exam05;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		// 단을 의미하는 변수 m
		// 각단의 열을 의미하는 n
		// 예) 2 * 1 = 2, 2 * 2 = 4

		// 각단의 반복
		for (int m = 2; m < 10; m++) {
			// 각단의 열 반족
			for (int n = 1; n < 10; n++) {
				// 2 * n = 2 * n
				int result = m * n; // 2 = 2 * 1
				System.out.println(m + "X" + n + "=" + result);
			}
			System.out.println("----------------------------");
		}
	}
}
