package ch06.sec05.exam05;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "황진이");
		
		System.out.println("국가 : " + p1.nation);
		System.out.println("ssn : " + p1.ssn);
		System.out.println("이름 : " + p1.name);
		
		//////////////////////////////////////
		Person p2 = new Person("USA", "123456-1234567", "jane");
		System.out.println("국가 : " + p2.nation);
		System.out.println("ssn : " + p2.ssn);
		System.out.println("이름 : " + p2.name);
		
		////////////////////////////////////////////////////
		// p2.nation = "ENG";
		
	}

}
