package ch06.sec00.exam01;

import java.util.Scanner;

public class Ex01MethodDefinitionExamp {
	
	// 자주 반복해서 사용하는 코드들을 대표이름을 붙여서 그 이름으로 부르기만 하면 
	//  그 코드들이 실행 된다. => 함수라고 부르고 바자는 모든 함수를 클래스에 속해야하므로
	//  그 클래스의 함수라는 의미로 메소드(어떤역할의 배우의 연기를 메소드라 하므로)라고 부릅니다.
		
	// 메소드 정의
	static int sum (int a, int b) {
		return a + b;
	}
		
	public static void main(String[] args) {
		// 메소드 호출하면 메소드는 호출한다(=실행한다) 이므로 데이터 값을 리턴합니다.
		//  연산자와 같습니다. 연산자는 사실 메소드입니다.
		//  메소드계의 스타를 연산자라고 합니다. 
		// (1 + 3)의 결과를 sumResult에 대입하라
		int sumResult = sum(1, 3);
		
		Scanner scanner = new Scanner(System.in);
		
		//위 결과를 출력
		System.out.println(sumResult);
		System.out.println(sum(1, 3));
		
		System.out.println("-----------------------------------------");
		// 사칙연산 만들기 덧셈, 뺄셈, 곱셈, 나눗셈
		// 정수 함수 4개, 정의(호출)
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		int divResult = div(x, y);
		
		// 자바 13이후부터 지원하는 문자열을 여러줄 출력할 때 + 연산이 필요하지 않음
		//  화면 모양 그대로 출력
		// 문자열 연산의 힘듦에서 해방
		
		String msg = """
				$x / $y = $z
				""".replace("$x", "" + x)
				    .replace("$y", "" + y)
					.replace("$z", "" + divResult);
		
		// 결과 출력
		System.out.println(msg);
	}
		
		

	private static int[] inputNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	// public : 외부 코드블럭에서 불러서 실행 할 수 있음
	// private : 가장 강력한 제한범위 지시어로 같은 코드 블럭에서만 불러서 실행할 수 있음
	private static int div(int x, int y) {
		// TODO Auto-generated method stub
		return x / y;
	}	
	

}
