package ch06.sec04.verify.exam03;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		// 로그인 실행
		boolean result = memberService.login("hong", "12345");
		if(result == true) {
			System.out.println("로그인 되었습니다.");
			
			// 로그인 된 경우에만 logout 가능
			// 로그아웃 해 보았다.
			memberService.logout("hong");
		} else { // 로그인 결과가 로그인 실패(false)라면
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}
