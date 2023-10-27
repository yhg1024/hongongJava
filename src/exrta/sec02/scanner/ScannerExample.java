package exrta.sec02.scanner;

import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) throws IOException {
		// int를 입력받을 때 nextInt() 이용
		Scanner scan = new Scanner (System.in);
				
		int a,b;
		a= scan.nextInt(); // 스캐너로 정수 입력
		b = scan.nextInt();
		
		int result = a + b;
		
		// 스캐너로 입력한 내용 출력
		System.out.println ("a = " + a + ",b = " + b);
		System.out.printf("%d +%d = %d", a,b, result);
		
		System.out.println("\n-------------------");
		
		// char 문자를 하나 입력받아보자.
		// char를 입력받을때는 System.in.read()이용
		// 입력받은 값을 (char) 강제 형변환한다.
		// System.in.read() 결과값이 int형이므로
		char ch;
		ch = (char) System.in.read();
		
		//결과값 출력
		System.out.println("입력한 char = " +ch);
	}

}
