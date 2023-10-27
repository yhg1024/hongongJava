package ch06.sec02.checkPioint;

public class CheckPoint02 {

	public static void main(String[] args) {
		//Member member = new Member();
		String name = "최하얀";
		int age = 23;
	}

}

class Member {
	String name;
	String id;
	String password;
	int age;
	
	Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	Member user1 = new Member("홍길동", "hong");
}
