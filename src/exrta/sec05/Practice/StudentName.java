package exrta.sec05.Practice;

public class StudentName {
	
	public static void main(String[] args) {
		
		String[] studentName = new String[5]; // 배열의 선언
		studentName = new String[] {"홍길동", "홍이동", "홍삼동", "홍사동", "홍오동"};
		int[] score = new int[] {90, 85, 93, 95, 87};
		
		int total = 0;
		int avg = 0;
		
		// -1로 두는 이유는 아직 비교하지 않습니다. 라는 뜻이다.
		int maxScore = -1; // 가장 높은 점수
		int maxIndex = -1; // 가장 높은 인덱스
		
		int minScore = score[0];
		int minIndex = -1;
		
		for (int i = 0; i < 5; i++) {
			System.out.print(studentName[i]);
			System.out.println(score[i]);
		}
			
			
		for (int i = 0; i < 5; i++) {	
			total = total +score[i];	
			
			if(maxScore < score[i]) {
				maxScore = score[i];
				maxIndex = i;
			}			
		}
		
		avg = total / score.length;
		
		for (int i = 0; i < 5; i++) {
			
			if(minScore > score[i]) {
				minScore = score[i];
				minIndex = i;
			}
		}
		
		
/*		System.out.println("총점 : " + total);
 * 		
		System.out.println("평균 : " + avg);		
		
		System.out.println("가장높은 점수 : " + maxScore);
		System.out.println("최고점 학생 : " + studentName[maxIndex]);
		System.out.println("가장낮은 점수 : " + minScore);
		System.out.println("최저점 학생 : " + studentName[minIndex]);*/
		
		
		// 최고 점수 출력
		String msg = """
				총점 : $total
				평균 : $avg
				최고 점수 ; $maxScore
				최고 점수 학생 : $maxStudent
				최저 점수 : $minScore
				최저 점수 학생 : $minStudent
				""";
		
		msg = msg.replace("$total", "" + total)
		.replace("$avg", "" + avg)
		.replace("$maxScore", "" + maxScore)
		.replace("$maxStudent", "" + studentName[maxIndex])
		.replace("$minScore", "" + minScore)
		.replace("$minStudent", "" + studentName[minIndex]);
		
		System.out.println(msg);
	}

}
