package exrta.sec01.exam04;

import java.util.Random;
import java.util.Scanner;

public class RockpaperScissorsGameExample2 {
	public static void main(String[] args) {
		int GAME_ROCK = 1; // 주먹을 1이라고 설정
		int GAME_PAPER = 3; // 보를 3이라고 설정
		int GAME_SCISSORS = 2; // 가위를 2라고 설정
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요😊;");

		int com = 0;
		int user = sc.nextInt();

		Random r = new Random();

		com = r.nextInt(3) + 1;
		// r.nextInt(3)은 0 ~ 2에 숫자중 랜덤하게 나오기 때문에 +1을 해서 1~3의 수가 나올수 있게함
		
		
		// 배열로 가위바위보랑 1,2,3 인덱스로 찾아보자
		String[] game = {"", "바위", "보", "가위"};
		String whatUser = game[user] ;
		String whatCom = game[com] ;
		
		System.out.println("유저 : " + whatUser);
		System.out.println("컴퓨터 : " + whatCom);

		if (user == GAME_ROCK) {
			if (com == GAME_SCISSORS) {
				System.out.println("유저승리");
			} else if (com == GAME_PAPER) {
				System.out.println("유저패배");
			} else {
				System.out.println("무승부");
			}
		} else if (user == GAME_SCISSORS) {
			if (com == GAME_SCISSORS) {
				System.out.println("무승부");
			} else if (com == GAME_PAPER) {
				System.out.println("유저 승리");
			} else {
				System.out.println("유저 패배");
			}
		} else if (user == GAME_PAPER) {
			if (com == GAME_SCISSORS) {
				System.out.println("유저 패배");
			} else if (com == GAME_PAPER) {
				System.out.println("무승부");
			} else {
				System.out.println("유저 승리");
			}
		} else {
			System.out.println("다시 입력 해주세요!!");
		}

		sc.close();

	}
}
