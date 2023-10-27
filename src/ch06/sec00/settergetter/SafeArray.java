package ch06.sec00.settergetter;

public class SafeArray {
	private int a[]; // 안전한 배열의 저장역할
	public int length; // 실제 안전한 배열의 최대 크기
	                   // 코드에 집중하기 위해 속성함수 대신 public으로 설정

	// 생성자 = 클래스를 이용해서 객체를 생성할 때 객체를 생성한 방안의 맴버필드를 초기화 하는데 
	// 여기서는 a[] 생성시 배열의 크기 설정
	//  배열의 값을 0에 가까운 값으로 초기화
	//  length 필드 초기화
	// 생성자는 클래스이름과 같은 이름으로 시작하고 초기화할 맴버필드의 값을 매개변수로 제공
	
	public SafeArray(int size) {
		a = new int[size];
		length = size;
	}

	// 배열에 들어 있는 값을 읽을 때 get(읽을인덱스
	public int get(int index) {
		// 정상적인 경우 0 <= 인덱스 < length
		if (0 <= index && index < length) {
			return a[index];
		}
		// index < 0 이거나 index >= length인 경우 Out of bound(=범위초과 에러) 예외이므로
		// 인덱스에서 사용하지 않는 -1 리턴
		return (length - 1) - index;
		// 인덱스는 무조건 0이상이므로 잘못된 인덱스를 나타낼때는 -1이 제격

	}

	// 배열에 값을 대입하기 위해 put(인덱스 값)
	// 변수 하나에 저장할 때 set
	// 동일한 변수가 여러개일 때 인덱스로 가르킬때 put(현재 인덱스, 저장할 값)
	public void put(int index, int value) {
		// 정상적인 배열 인덱스 범위 0 <= index < length
		if (0 <= index && index < length) {
			a[index] = value;
		} else {
			// index < 0 또는 index >= length
			// 에러를 출력
			System.out.println("잘못된 인덱스는 " + index + "입니다.");
		}

	}

}
