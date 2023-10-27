package ch03.sec02.exam02.part05;
//패키지 이름에 숫자만 오면 안된다 .01x -> part01

public class IncreaseDecreaseOperator03Example05Exam {

	public static void main(String[] args) {
		/* 증감연산자의 기본사용법을 살펴봅시다. */
		int x = 10;
		int y = 10;
		int z = 0;
		
		// 증가연산자 ++
		// 구분선 출력
		System.out.println("-------------복합 증감 연산------------");
		System.out.println("복합 증감연산 전 기본값 z = " + z);
		System.out.println("복합 증감연산 전 기본값 x = " + x);
		System.out.println("복합 증감연산 전 기본값 y = " + y);
		
		System.out.println("x = ++x + y++ 연산후 ==>");
		z = ++x + y++; // 21
		// z = (x + 1) + y
		// z = ++x + ++y; // 22
		// z = x++ + ++y; // 21
		// z = x++ + y++; // 20
		// 위의 연산식은 내부적으로 이렇게 됩니다.
		// z = ++x + y;
		// y = y + 1;
		// 실행순서
		// 먼저 =(대입연산자) 연산의 흐름에서 마지막실행(하나의 연산식)
		//   ++x 연산식은 하나로 보고 항상 먼저 계산
		//   y++ 연산식은 y포함 연산후에 마지막에 y = y + 1
		//   y++ 은 y관련연산식; y = y + 1;으로 두개의 문장입니다.
		
		System.out.println("연산후 z = " + z); // 21
		System.out.println("연산후 x = " + x); // 11
		System.out.println("연산후 y = " + y); // 11

	}

}
