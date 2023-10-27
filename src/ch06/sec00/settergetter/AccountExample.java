package ch06.sec00.settergetter;

public class AccountExample {
	public static void main(String[] args) {
		// 톰의 계정을 하나 만든다.
		Account tomAccount = new Account();
		tomAccount.setName("tom");
		tomAccount.setBalance(100_000);
		System.out.println(
				"이름은 " + tomAccount.getName() + 
				"통장잔고는 " + tomAccount.getBalance() + 
				"입니다.");
		
		// 제인의 계정을 하나 만든다. (객체 생성)
		Account janeAccount = new Account();
		janeAccount.setName("Jane");
		janeAccount.setBalance(1_000_000);
		System.out.println(
				"이름은 " + janeAccount.getName() + 
				"통장잔고는 " + janeAccount.getBalance() + 
				"입니다.");
		
		// 리리의 계정을 하나 만듭니다. (객체생성)
		// 매개변수가 하나인 Account생성자 메소드로 Account객체 초기
		Account liliAccount = new Account(100010001);
		liliAccount.setBalance(-100_000);
		liliAccount.setName("Lili");
		System.out.println(
				"계좌번호는 " + liliAccount.getRegNumber() +
				"이름은 " + liliAccount.getName() + 
				"통장잔고는 " + liliAccount.getBalance() + 
				"입니다.");
	}

}
