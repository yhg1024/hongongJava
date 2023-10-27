package ch11.sec02.exam12;

public class StringCharAtExample {

	public static void main(String[] args) {
		// 주민등록번호에서 뒤에 7자리의 첫번째 숫자를 이용하여 '남' / '여' 구분
		String ssn = "010624-3230123";
		
		// 7자리중에서 첫번째 글자를 가져오세요
		// ssn에 중간 "-"이 들어 있으므로 인덱스는 7이 됩니다.
		char sex = ssn.charAt(7);
		
		// 성별 판별
		if ((sex == '1') || (sex == '3')) {
			// 1이거나 3이면 남자
			System.out.println("남자입니다.");
		} else {
			// 2이거나 4이면 여자
			System.out.println("여자입니다.");
		}
	}
}
