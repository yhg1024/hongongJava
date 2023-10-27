package ch03.sec02.exam02.part03;
//패키지 이름에 숫자만 오면 안된다 .01x -> part01

public class IncreaseDecreaseOperator03Example03Exam {

	public static void main(String[] args) {
		/* 증감연산자의 기본사용법을 살펴봅시다. */
		int x = 10;
		int y = 10;
		int z;
		
		// 증가연산자 ++
		// 구분선 출력
		System.out.println("-------------------------------------------");
		System.out.println("증가연산 전 기본값 x = " + x);
		x++; // 후치 증가 연산
		System.out.println("후치 증가연산 x++ = " + x);
		++x; // 전치 증가 연산
		System.out.println("전치 증가연산 ++x = " + x);
		
		// 감소연산자 --
		System.out.println("-------------------------------------------");
		System.out.println("감소연산 전 기본값 y = " + y);
		y--; // 후치 감소 연산		
		System.out.println("후치 감소연산 y-- = " + y);
		--y; // 전치 감소 연산
		System.out.println("전치 감소연산 --y = " + y);
		
		// 증감연산자와 다른 변수의 상호 작용
		System.out.println("------증가연산자와 다른변수의 상호작용------");
		z = x++; // 후치증가연산은 z =x를 먼저 실행
				 // 그후에 x++(x = x + 1) 실행
			 	 // z변수의 값과 x 변수의 값은 +1 차이가 난다.
		System.out.println("z = " + z);
		System.out.println("x = " +x);
		
		System.out.println("-------------------------------------------");
		z = ++x; //전치 증가연산은 ++x(x = x +1)를 먼자 실행하여 x변수의 내용이 +1증가한다.
		  		 // 그 변경된 x의 값을 z에 대입. 따라서 x도 변하고 z도 변한다.
				 // x의 값이 변한 후 z에 대입된다.
		System.out.println("z = " + z);

	}

}
