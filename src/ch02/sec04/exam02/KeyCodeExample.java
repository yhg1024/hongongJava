package ch02.sec04.exam02;

import java.io.IOException;

public class KeyCodeExample {
	public static void main(String[] args) throws Exception {
		//키보드로부터 입력한 키코드 값
		int keyCode; 
		
		//안내문자열을 출력
		System.out.print("키보드로부터 한글자를 입력해주세요 :) (엔터키를 눌러주세요)");
		
		// 처리부 + 입력부
		// keycode는 유니코드 = 문자 ( 하지만 숫자표기법 대입)
		keyCode = System.in.read();
		
		// 출력부
		System.out.println("KeyCode: " + keyCode);  
				
		keyCode = System.in.read();
		System.out.println("KeyCode: " + keyCode);  
		
		keyCode = System.in.read();
		System.out.println("KeyCode: " + keyCode); 
	}

}