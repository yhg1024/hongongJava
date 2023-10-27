package ch05.sec02.exam04.ex1;

public class Ex07DeepArrayCopyExample {
	
	public static void main(String[] args) {
		// 원본 배열
		int[] list = { 10, 20, 30, 40, 50 };
		
		// 복사본 배열
		// 깊은 복사는 
		//   1. 공간을 확보해야합니다.
		//   2. 복사할 원본과 크기가 같아야 하므로 배열타입 크기만큼
		//      new 배열타입[원본의 배열크기] 으로 공간확보가 필요
		//   3. 루프를 통하여 원본의 개별요소를 복사본의 개별요소에 저장해주면됩니다.
		int[] numbers = new int[list.length];
		
		// 다른 메모리의 내용을 내 메모리에 복사
		// 원본의 갯수만큼 복사를 해주세요		
		for (int i = 0; i < list.length; i++) {
			numbers[i] = list[i];
		}
		
		// 1. 원본과 복사본이 같은가
		// 원본 배열의 내용정보를 보여주는 toString() 출력
		System.out.println(list.toString());
		//복사본배열의 내용정보를 보여주는 toString() 출력
		System.out.println(numbers.toString());
		
		// 비교 연산자를 사용하여 정확한 비교를 해보자
		if (list == numbers) {
			System.out.println("list == numbers");
		} else {
			System.out.println("list != numbers");
		}
		
		// 3. 두 배열의 내용을 출력
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		System.out.println("---------------------------");
		for (int i = 0; i < list.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// 4. 복사본(numbers)의 배열요소를 고치면 원본에 변화가 있는가?
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 0;
		}
		
		// 변경되 복사본(numbers) 내용 출력
		for (int i = 0; i < list.length; i++) {
			System.out.println(numbers[i]);
		}
		// 원본(list)에 배열요소가 전부 0으로 바뀌었는가
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

}
