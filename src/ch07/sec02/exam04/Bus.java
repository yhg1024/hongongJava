package ch07.sec02.exam04;

public class Bus extends Vehicle{
	// vehicle클래스의 run()를 재정의
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
