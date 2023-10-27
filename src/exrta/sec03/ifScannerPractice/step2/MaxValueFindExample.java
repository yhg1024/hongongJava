package exrta.sec03.ifScannerPractice.step2;

public class MaxValueFindExample {
	
	public static void main(String[] args) {
		// 두개의 정수를 비교하여 큰 정수를 max변수에 대입
		// 원본데이터 변수는 손상되면 안됨
		int max = 0; // 현재 비교한 최대값이 없음 뜻함
		// 데이터 정수 변수 두개 선언
		int i = 100;
		int j = 200;
		
		// i > j를 비교해서 큰 값을 max변수에 대입해주세요
		// 크다는 비교연산자 사용
		if (i > j) {
			max = i; // i가 j보다 크다.
		} else if (i == j) {
			max = i; // i와 j가 같다.
		} else {
			max = j; // j가 i보다 크다.
		}
		
		System.out.println(
				"i = " + i + ", j = " +j + 
				"=> max = " + max + "\n");
		
	}

}
