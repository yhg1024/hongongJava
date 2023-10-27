package ch05.sec02.exam04.ex1;

public class Ex3ArrayPrintExample {
	
	public static void main(String[] args) {
		// 피자 토핑을 저장하는 변수를 선언하세요
		String[] topping;
		// 초기화를 이용하여 피자토핑값을 변수에 대입하세요
		topping = new String[] {"Pepperoni", "Mushroom", "Onions", "Sausage", "Vacon"};
		// 피자토핑변수의 내용을 화면에 출력하세요		
		// 단 데이터로 루프출력
		for(int i = 0; i < 5; i++) {
			System.out.println(topping[i]);
		}
	}

}
