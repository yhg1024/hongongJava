package ch09.exercise.sec01.exam05;

public class AnonymousExample {
	public static void main(String[] args) {
		// 체크박스 위젯 객체 생성
		CheckBox checkBox = new CheckBox();
		
		// 위젯에 "Select" 이벤트 핸들러 등록
		// OnSelectListener : 이벤트 핸들러 이름
		// SetOnSelectListener : 이벤트 핸들러 등록함수
		checkBox.setOnSelectListener(
				// 익명구현객체를 사용하여 이벤트 핸들러를
				//  즉석에서 생성 등록하자
				new CheckBox.OnSelectListener() {
					
					@Override
					public void onSelect() {
						System.out.println("배경을 변경");
					}
				});
		// 이벤트처리 객체를 만들었으므로 이벤트가 발생하기만을 대기
		// 여기서는 select()메소드로 강제 이벤트 발생
		checkBox.select();
	}
}
