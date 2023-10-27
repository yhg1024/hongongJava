package ch07.sec01.exam01;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "녹색", 10);
		
		// 필드 초기화
		// DmbCellPhone 필드가 있나요?
		// DmbCellPhone객체를 생성자로 초기화 하므로
		// 주석처리
		// dmbCellPhone.color = "보라색";
		// dmbCellPhone.model = "자바폰";
		
		// 필들 내용 출력
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		System.out.println("채널: " + dmbCellPhone.channel);
		
		
		// dmbCellPhone을 작동시킵니다.
		String msg = """
					현재 DmbCellPhone 클래스는
					cellPhone클래스부터 상속(extends)받았으나
					아무것도 추가한 것이 없습니다.
					""";
		System.out.println(msg);
		
		// 전원을 켤수 있을까요?
		dmbCellPhone.powerOn();
		// 전화벨소리가 들릴수 있을까요?
		dmbCellPhone.bell();
		// "여보세요"라는 메세지를 보낼 수있을까요
		dmbCellPhone.sendVoice("여보세요");
		// "안녕하세요"라는 메세지를 받을 수 있을까요
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동입니다.");
		// "아~ 반갑습니다."라는 메세지를 받을 수 있을까요
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		// 통화를 종료 할 수 있을까요
		dmbCellPhone.hangUp();
		// 전원을 끌 수 있을까요
		dmbCellPhone.powerOff();
		
		// DmbCellPhone 객체 전용메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(7);
		dmbCellPhone.turnOffDmb();
	}
}
