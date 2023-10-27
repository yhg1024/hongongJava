package ch04.sec01.exam06;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		// switch구문에서 break가 없다면 어떻게 될까요
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[현재 시각 :" + time + "시]");
		
		// 시간의 변화에 따라 선택하기
		switch(time) {
		case 8 : // 8시에 뭐 할까요?
			System.out.println(" 출근합니다.");
		case 9 : // 9시
			System.out.println("회의를 합니다.");
		case 10 : // 10시
			System.out.println("업무를 봅니다.");
		default : // 그 이후에는
			System.out.println("외근을 나갑니다.");
		}
	}

}
