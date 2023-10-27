package ch08.sec02.exam04;

public class Bus implements Vehicle{
	


	public void checkFare() {
		System.out.println("승차 요금을 확인합니다.");
	}

	@Override
	public void run() {
			System.out.println("버스가 달립니다.");			
	}

}
