package ch05.sec02.exam03;

import java.time.LocalDateTime;

public class MonthGetSeasonFindExample {
	
	public static void main(String[] args) {
		
		final int SEASON_SPRING = 0;
		final int SEASON_SUMMER = 1;
		final int SEASON_FALL = 2;
		final int SEASON_WINTER = 3;
		
		// 사계절 이름을 배열로 선언 및 초기화
		// seasons 배열변수 현재 만들어지면서
		// "봄"/"여름"/"가을"/"겨울"의 힙을 바로 가르키고 있다.
		String[] seasons = new String[] {
				"봄", "여름", "가을", "겨울"
		};
		// 이 가르키는 것을 중지시킨다. (가비지 컬렉터가 작동)
		seasons = null;
		// 영어로 출력하기를 원해서 새로운 힙창고에
		// 새로운(new) String[4] 크기의 스트링배열을 만든다
		// 데이터는 "Spring/Summer/Fall/Winter"로 초기와를 한다.
		// {}안의 초기화 데이터로 배열의 크기를 알 수 있다.
		seasons = new String[] {
				"Spring", "Summer", "Fall", "Winter"
		};
		
		// 오늘 날짜 구하기
		// LocalDateTime이라는 라이브러리가 필요
		// 오늘 날짜는 LocalDateTime.now()메소드로 구할 수 있습니다.
		LocalDateTime today = LocalDateTime.now();
		// 이번달을 얻어볼까요 int LocalDateTime.getMonthValue()
		int month = today.getMonthValue();
		
		// 자바 17부터 적극적으로 권장하는 문자열 표기법
		// 프론트언어에서는 템플릿 문자열이라고 부르는 Multi-Line String
		// 멀티라인 문자열은 """ 시작 """로 닫습니다.
		String msg = """ 
				%s월은(는) %s입니다.	
				"""; // 마지막줄을 기준으로 시작 라인을 잡는다.(이 라인이 앞으로 땡겨지면 들여쓰기가 된다)
		// 달을 이용하여 계절을 판별합시다.
		// 3 <= month <= 5 : 봄 = seasons[Season_SPRING]
		if ( 3 <= month && month <= 5) {
			// 월에 따라 출력메세지를 만듭니다.
			msg = msg.formatted(month, seasons[SEASON_SPRING]);
		} else if (6 <= month && month <= 8) {
			// 6 <= month <= 8 : 여름 = seasons[SUMMER]
			msg = msg.formatted(month, seasons[SEASON_SUMMER]);
		} else if (9 <= month && month <= 11) {
			// 9 <= month <= 11 : 가을 = seasons[FALL]
			msg = msg.formatted(month, seasons[SEASON_FALL]);
		} else if (12 <= month && month <= 2) {
			// 12 <= month <= 2 : 여름 = seasons[WINTER]
			msg = msg.formatted(month, seasons[SEASON_WINTER]);
		}
		
		
		// msg 출려문자열을 화면에 출력합니다.
		System.out.println(msg);
	}

}
