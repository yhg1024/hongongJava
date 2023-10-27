package ch11.sec02.exam15;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "자바프로그래밍";
		
		// "프로그래밍"을 찾은 위치 인덱스 출력
		int location = subject.indexOf("프로그래밍");
		System.out.println("location : " + location);
		
		// "자바"라는 단어문자열을 찾았는가
		// 찾았다면 -1 이외의 숫자 리턴
		if (subject.indexOf("자바") != -1 ) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			// 찾지못했다면 -1리턴
			System.out.println("자바와 관련없는 책이군요.");
		}
	}
}
