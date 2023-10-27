package ch09.sec02.exam01;

public class AnonymousExample {

	public static void main(String[] args) {
		// 익명객체를 담고 있는 객체생성
		Anonymous anony = new Anonymous();

		// 익명객체를 필드 사용
		// 익명객체의 wake()를 부르면 work()를 실행
		anony.field.wake();

		// 익명객체의 로컬 변수 사용
		// 익명객체를 호출하는 메소드이용
		anony.method1();

		// 익명 객체를 메소드의 파라미터(인수)로 전달하는 경우
		anony.method2(
				/* 익명클래스 */
				new Person() {
					void study() {
						System.out.println("공부를 합니다.");
					}

					void wake() {
						System.out.println("8시에 일어납니다.");
						study();
					}
				}
			);
		// 실제 구현 클래스 student 객체 참조
		anony.student.wake();
	}
}
