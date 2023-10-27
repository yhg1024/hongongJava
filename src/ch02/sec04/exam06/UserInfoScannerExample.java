package ch02.sec04.exam06;

import java.util.Scanner; // ctrl + shift + o 를 누르면 자동완성, 시스템 에러가 있으면 작동하지 않는다

public class UserInfoScannerExample {
	public static void main(String[] args) {
		// 1.
		// 이름: 감자바
		// 나이 : 25
		// 전화 : 010-123-4567
		String name1 = "감자바";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		
		System.out.println("이름 : " + name1);
		System.out.print("나이 : " + age + "\n");
		System.out.printf("전화 : %s - %s - %s", tel1, tel2, tel3 + "\n");
		
		
		// 2.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 수:");
		String strNum1 = scanner.nextLine();
		
		System.out.println("두번째 수:");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);
		
		
		// 3.
		// 입력장치(Scanner) 객체 생성
		
		String name2;
		String ssnNumber;
		String hp;
		
		// 사용자 정보 입력 화면
		System.out.println("[필수 정보 입력]");
		
		System.out.print("1. 이름");
		name2 = scanner.nextLine();
		System.out.print("2. 주민번호 앞 6자리:");
		ssnNumber = scanner.nextLine();
		System.out.print("3. 전화번호");
		hp = scanner.nextLine();
		
		// 입력내용 출력화면
		System.out.println("[입력한 내용]");
		System.out.println(name2);
		System.out.println(ssnNumber);
		System.out.println(hp);
	}

}
