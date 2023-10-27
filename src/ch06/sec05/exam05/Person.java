package ch06.sec05.exam05;

public class Person {
	final String nation; // = "Korea";
	final String ssn;
	String name;
	public Person(String ssn, String name) {
		this.nation = "KOREA";
		this.ssn = ssn;
		this.name = name;
	}
	
	public Person(String nation, String ssn, String name) {
		this.nation = nation;
		this.ssn = ssn;
		this.name = name;
	}

}
