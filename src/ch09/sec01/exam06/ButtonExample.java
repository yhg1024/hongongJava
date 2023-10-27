package ch09.sec01.exam06;

public class ButtonExample {
	public static void main(String[] args) {
		Button button = new Button();
		
		// 실제 버튼을 누르면 실행할 이벤트 핸들 버튼이 눌러지면 자동으로 호출
		button.setOnClickListener(new CallListener());
		// 실제 버튼 동작(toutch)
		button.touch();
	}
}
