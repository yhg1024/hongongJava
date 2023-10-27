package exrta.sec03.ifScannerPractice.step3;

public class MaxValueFindExample {
	
	public static void main(String[] args) {
		
		int max = 0;
		int i = 100;
		int j = 200;
		int k = 300;
		
		// 먼저 i > j비교하고 큰 값을 max에 대입
		if(i > j) {
			max = i;
		} else if (i == j) {
			max = i;
		} else if (i < j) {
			max = j;
		}
		
		// max와 k를 비교 큰값을 max에 대입
		// 이렇게 하면 실제 데이터는 보존된다.
		if (max > k) {
			
		} else if (max == k) {
			
		}else if (max < k) {
			max = k;
		}
		
		System.out.println(
				i + ", " + j + ", " + k  + 
				",  중 max 값은 : " + max);
	}

}
