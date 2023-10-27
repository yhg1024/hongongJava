package ch07.sec01.exam02;

public class Student extends People{
	//Student 추가 필드
	public int studentNo; // 학생번호 추가
	
	// 생성자에 추가 필드가 필요
	// 부모가 생성자를 가지고있으면 자식이 그것도 가져와야한다.
	
	public Student(String name, String ssn) {
		super(name, ssn);
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		// TODO Auto-generated constructor stub
		this.studentNo = studentNo;
	}

}
