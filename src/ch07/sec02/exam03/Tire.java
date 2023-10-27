package ch07.sec02.exam03;

public class Tire {
	// 필드
	public int maxRotation; // 최대 회전수( 타이어 수)
	public int accumulatedRotation; // 누적 회전수 //~ed 이전부터 계속 사용해왔다 앞으로도 계속 사용한다.
	public String location;
	
	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// 메소드
	// 타이어의 교체시기를 알려주는 역할
	public boolean roll() {
		++accumulatedRotation; // 누적 회전수 1증가
		
		// 정상 회전일 경우 (타이어가 정상적으로 타이어 수명이 다함)
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명: " +
			(maxRotation - accumulatedRotation) + "회");
			return true;
		} else { // 타이어 회전수 > 최대회전수 == 타이어 펑크
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}

}
