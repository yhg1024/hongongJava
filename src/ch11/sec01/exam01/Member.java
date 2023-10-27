package ch11.sec01.exam01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	// 보통 매개 변수로 데이터를 넘길때 일반적으로 부모클래스(주로 Object) 타입으로
	//  작업한다. 그래서 매개 변수의 형식을 검사함
	
	@Override // object 클래스의 equals 메소드를 꼭 재정의하
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			// obj Memeber 타입이므로 실제 세부검사 시행
			Member member = (Member) obj;
			if (id.equals(member.id)) {
				return true;
			}
		}
		
		// 매개값이 Member 타입이 아니거든 id필드값이 다르다.
		return false;
	}

}
