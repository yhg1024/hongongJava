package ch04.sec02.exam10;

public class ContinueExample {
	
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if(i%2 != 0) { 
				continue; //홀수이면 출석하지 마라
			}
			// 짝수이면 출석
			System.out.println(i); // 홀수는 실행 안함
		}
	}

}
