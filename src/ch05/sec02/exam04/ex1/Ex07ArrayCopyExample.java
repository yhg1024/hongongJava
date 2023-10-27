package ch05.sec02.exam04.ex1;

// Shallow 얕은 복사 = 공유
// 고치면 양쪽다 바뀐다
// 참조 복사 또는 얕은 복사는 같은 메모리를 가르킨다. 
// 같은 내용물을 가르킨다. list == numbers
public class Ex07ArrayCopyExample {

	public static void main(String[] args) {
		int[] list = { 10, 20, 30, 40, 50 };
		// 얕은 복사(Shallow Copy)를 이용한 배열요소 복사하기
		int[] numbers = list;

		// 원본 배열 출력
		for (int number : list) {
			System.out.println(number);
		}

		System.out.println("-----------------------------");
		// 복사된 배열 출력
		for (int number : numbers) {
			System.out.println(number);
		}

		System.out.println("----------------------------------");
		// numbers와 list가 서로 같은가 참조비교
		if (list == numbers) {
			System.out.println("list배열과 numbers배열이 완전히 같습니다.");
		} else {
			System.out.println("list배열과 number배열이 다릅니다.");
		}

		// numbers와 list의 개별 배열요소를 비교
		for (int i = 0; i < list.length; i++) {
			if (list[i] == numbers[i]) {
				System.out.println("list와 numbers의 개별요소가 같습니다.");
			} else {
				System.out.println("list와 numbers의 개별요소가 다릅니다.");
			}
		}

		// 내용을 비교하는 equals()메소드 확인
		if (list.equals(numbers)) {
			System.out.println("list배열과 numbers배열이 같습니다.");
		} else {
			System.out.println("list배열과 numbers배열이 다릅니다.");
		}

		// numbers와 list의 개별 배열요소를 비교
		for (int i = 0; i < list.length; i++) {
			if (list[i] == numbers[i]) {
				System.out.println("list와 numbers의 개별요소가 같습니다.");
			} else {
				System.out.println("list와 numbers의 개별요소가 다릅니다.");
			}

		}

		System.out.println("==================================");
		// 데이터객체 정보의 특징을 해쉬값으로 출력하라
		// toString() 데이터를 약식으로 보여주가나 유일코드(해쉬코드)로 보여준다.
		System.out.println(list.toString());
		System.out.println(numbers.toString());
		 //list = null;
		// System.out.println(list.toString());
		 //System.out.println(numbers.toString());

		// 복사본 numbers의 데이터값을 데이터요소 * 10을 해서 내용을 바꿉니다.
		// list 원본에 영향이 있을지 살펴보겠습니다.
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i] * 10;
		}

		// numbers배열의 내용이 바뀌었는지 확인
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("---------------------------------");
		// 원본 list배열의 내용이 바뀌었는지 확인해봅시다.
		for (int i = 0; i < list.length; i++) {
			System.out.println(list);
		}

	}

}
