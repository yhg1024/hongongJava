package exrta.sec01.exam04;

import java.util.Random;
import java.util.Scanner;

public class RockpaperScissorsGameExample {
	public static void main(String[] args) {
		int GAME_ROCK = 1; // 주먹을 1이라고 설정
		int GAME_PAPER = 3; // 보를 3이라고 설정
		int GAME_SCISSORS = 2; // 가위를 2라고 설정
		Scanner sc = new Scanner(System.in);
		Random random = new Random(); // 랜덤 객체 생성
		
		// 낸거를 기억하는
		int user = 0;
		int com = 0;
		
		// 사용자 : 스캐너로 정수 입력
		user = sc.nextInt();
		
		// 컴퓨터 : 랜덤함수 nextInt
		com = random.nextInt(3) + 1;
		System.out.println(com);
		
		// 판정
		if (user == GAME_ROCK) {
			System.out.println("사용자 승입니다.");
		} else if (user == 1 && com == 3){
			System.out.println("사용자 패입니다.");
		} else {
			System.out.println("비겼습니다.");
		}
		
		if (user == 2 && com == 3) {
			System.out.println("사용자 승입니다.");
		}
		
		if (user == 3 && com == 2) {
			System.out.println("사용자 승입니다.");
		}
	}

}
