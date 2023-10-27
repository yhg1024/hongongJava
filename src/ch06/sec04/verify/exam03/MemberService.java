package ch06.sec04.verify.exam03;

public class MemberService {
	boolean login(String id, String password) {
		// id와 password가 일치하는가를 확인하려면 데이터베이스와 연결이 필요
		//  하지만 여기서는 연결해서 정보를 가져온것으로
		// 그 결과 user_id = "hong" user_password  = "12345"로 가정
		String userId = "hong";
		String userPassword = "12345";
		if ((userId.equals(id)) && (userPassword.equals(password) )) {
			return true;
		} else {
			return false;
		}
	}
	
	void logout (String id) {
		System.out.println("로그아웃 되었습니다.");
	}

}
