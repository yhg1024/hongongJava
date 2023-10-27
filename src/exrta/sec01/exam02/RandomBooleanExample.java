package exrta.sec01.exam02;

public class RandomBooleanExample {
	// 0이 나오면 false
	// 1이 나오면 true

	public static void main(String[] args) {
		boolean stop = false; // 프로그램을 처음 시작할때 보통 bool 값은 false로 둠

		// Math.random() : 0.0 <= rand < 0.99999999999 난수
		// Math.random() * 2 : 0.0 *2 <= rand * 2 < 0.99999999 * 2
		// (int) (Math.random() * 2) : 난수 값보다 작은 정수
		int choice = (int) (Math.random() * 2);

		if (choice == 1) {
			System.out.println("프로그램을 종료합니다.");
		} else {
			System.out.println("프로그램을 시작합니다.");
		}
		
	}
}
