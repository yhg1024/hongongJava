package ch11.sec01.exam05;

public class SmartPhone {
	
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.setCompany(company);
		this.setOs(os);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}
	
	// Object에 저의된 메소드
	@Override
	public String toString() {
		return "[company : " + this.company + ", os = " + this.os + "]";
	}
}
