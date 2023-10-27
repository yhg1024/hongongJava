package ch02.sec03.exam05;

public class OperationPromotionExample {
	public static void main(String[] args) {
		// 정수형으로 되어 있는건 더블형으로 변환하면 소수점 이하는 버림한다.
		// 소수점 이하가 없기때문에 소수점 이하는 계산하지 않는다.
		// 정수 / 정수 = 정수
		// 연산하고 변수에 저장하므로
		int x = 1;
		int y = 2;
		double result = x / y;
		System.out.println("x / y = " + result);
		
		// x,y를 강제로 더블형으로 변환해보자
		// 더블형은 소수점 이하 15자리까지 남는다.
		result = (double)x / y;
		System.out.println("(double)x / y = " + result);
		
	}
}
