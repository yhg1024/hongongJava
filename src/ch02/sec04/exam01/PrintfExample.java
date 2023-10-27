package ch02.sec04.exam01;

public class PrintfExample {
	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);
		System.out.printf("상품의 가격:%6d원\n", value); // 오른쪽 정렬 6자리
		System.out.printf("상품의 가격:%-6d원\n", value); // 왼쪽 정렬 6자리
		System.out.printf("상품의 가격:%06d원\n", value); // 왼쪽 빈자리에 0 채움, 6자리
		System.out.printf("상품의 가격:%02d원\n", value); // 왼쪽 빈자리에 0을 채워야하지만 2자린대 3개라
		
		double area = 3.14159 *10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area); 
		// %10.2f는 10칸 소수점 이하 두자리 실수형
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
		
		System.out.printf("1st: %1$03.2f, 2nd: %2$010.2f\n", 100f, 200.00);
		System.out.printf("2nd: %2$03.2f, 1st: %1$010.2f\n", 100f, 200.00); 
		// % : 형식 문자열의 시작 
		// 2$ : argument_index$ 값의 순번
		// 03.2f : 3칸 소수점 아래 두자리
		
		int num1 = 10;
        double num2 = 5.5;
        String str = "20";
        
        // 아래 줄에 적절한 형변환을 수행하여 결과를 계산하고 출력하세요.
        double result = num1 + num2 + Double.parseDouble(str);
        
        System.out.println("Result: " + result);
	}

}
