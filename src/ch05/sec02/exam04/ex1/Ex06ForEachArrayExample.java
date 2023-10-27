package ch05.sec02.exam04.ex1;

public class Ex06ForEachArrayExample {
	
	public static void main(String[] args) {
		// 1. 5명의 학생 이름을 변수(배열)에 저장하세요
		String name[] = new String[]{"황진이", "영희", "홍길동", "무지개", "가을"};
		
		// 2. 저장된 학생의 이름들을 출력하세요 System.out.println()사용하세요
		for(String i : name) {
			System.out.println(i);
		}
		
		// 3. for ~ each 구문을 사용하세요
		// 데이터 : 학생이름은 황진이, 영희, 홍길동, 무지개, 가을
	}

}
