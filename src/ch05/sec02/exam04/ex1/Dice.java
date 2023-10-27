package ch05.sec02.exam04.ex1;

public class Dice {
	public static void main(String[] args) {
		
		//주사위를 던진다.
		int dice = (int)(Math.random() * 6) + 1;
		
		//주사위의 횟수를 저장할 변수
		int i = 0;
		
		//0번을 1번으로 맞출건지 0번을 토탈로 할건지 1인덱스를 1로 할지
		int[] diceCount = new int[i];
		
		
		
		//주사위에 눈금이 나온것에 따라 횟수를 증가시킨다
		switch (dice) {
		case 1:
			i++;
		case 2:
			i++;
		case 3:
			i++;
		case 4:
			i++;
		case 5:
			i++;
		case 6:
			i++;
			
		}
		
	}
	

}
