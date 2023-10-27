package ch08.extra.toy;

// 추상 클래스 : 불완전한(준비가 덜 되어있다) 클래스.
//  객체 생성 불가 클래스. new 클래스명 쓸수 없습니다.
public abstract class Quiz implements HintHelper{
	// 필드 
	// 퀴즈에 필요한 문제, 해답
	String question; // 문제 저장 필드
	String answer; // 정답 저장 필드
	
	// 생성자
	
	
	// 메소드
	// 문제를 출제하는 메소드
	// 문제 출제는 문제 출제 알고리즘에 따라서 
	//  출제내용이 바뀔수 있으므로 추상메소드로 만들어 봅시다.
	// 출제한 질문과 정답은 별도 필드변수에 저장되므로 반환값이 필요없다. 리턴값 void
	abstract void createQuestion (); 
	// 문제를 리턴하는 메소드
	public String getQuestion() {
		return this.question; 
		// this를 안써도 되지만 어떤 question인지 확실하게 하기 위해 쓴다.
		// this는 이 클래스 안의 것을 가리킨다고 알려주는거
	}
	
	// 정답을 리턴하는 메소드
	public String getAnswer() {
		return this.answer;
	}
}
