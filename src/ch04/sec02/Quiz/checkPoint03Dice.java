package ch04.sec02.Quiz;

public class checkPoint03Dice {
	
	public static void main(String[] args) {
		// 프로그램에서 사용할 변수
		// int num1 = 0; int num2 = 0;
		
		// 루프가 필요한가요?
		while (true) {
			// Math.random()으로 난수 두개 받아오기
			int x = (int)(Math.random() * 6) +1;
			// System.out.println("주사위1 : " + x);
			int y = (int)(Math.random() * 6) +1;
			// System.out.println("주사위2 : " +y);
			
			System.out.printf("%d, %d \n", x, y);
			
			// 게임을 끝내는 조건
			// x + y == 5 break;
			if (x + y == 5) {
				break;
			}
		} 
		System.out.println("눈금의 합이 5입니다.");
	}

}
