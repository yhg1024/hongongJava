package ch06.sec00.settergetter;

public class Account {
	private int regNumber; // 계좌 번호
	private String name; // 소유자
	private int balance; // 잔고
	
	Account() {
		
	}
	
	Account(int regNumber) {
		this.regNumber = regNumber;
	}

	// 속성 함수 정의	
	void setName(String name) {
		this.name = name;
	}
	
	void setBalance(int balance) {
		// 만약 입금액이 < 0이면 입금액을 0으로 설정
		if (balance < 0) {
			this.balance = 0;
		} else {
			this.balance = balance;
		}
	}
	
	
	// 읽기만 가능한 속성함수	
	int getRegNumber() {
		return this.regNumber;
	}// return 하려면 반환값 (타입)이 있어야한다.
	
	String getName() {
		return this.name;
	}
	
	int getBalance() {
		return this.balance;
	}

}
