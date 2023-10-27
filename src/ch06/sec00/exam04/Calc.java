package ch06.sec00.exam04;

public class Calc {
	
	public static void main(String[] args) {
		
		// Math객체를 생성하고 작업
		// 익숙해지기위해 Math Object  => mathObj 객체 선언
		Math mathObj = new Math();
		
		int x = 100;
		int y = 50;
		
		// 덧셈객체 mathObj의 메소드 실행 결과
		int addResult = mathObj.add(2, 3);
		System.out.println("2와 3의 합은 : " + addResult + "입니다.");
		
		// 뺄셈객체 mathObj의 메소드 실행 결과
		int subResult = mathObj.sub(x, y);
		System.out.println("100와 50의 빼기는 : " + subResult + "입니다.");
		
		// 곱셈객체 mathObj의 메소드 실행 결과
		int mulResult = mathObj.mul(10, 20);
		System.out.println("10와 20의 곱하기는 : " + mulResult + "입니다.");
		
		// 나눗셈객체 mathObj의 메소드 실행 결과
		int divResult = mathObj.div(x, y);
		System.out.println("100와 50의 나누기는 : " + divResult + "입니다.");
		
		// 나머지 구하기 객체 mathObj의 메소드 실행 결과
		int modResult = mathObj.mod(x, 3);
		System.out.println("100와 3의 나머지는 : " + modResult + "입니다.");
		
		
		
		
	}

}
