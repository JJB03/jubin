package project06_01;

/*
 * 통장계좌
 * 예금주
 * 예금액
 * 계좌번호
 * 은행명
 */
public class account {

	private int deposit;
	private String depositor;
	private String depoNumber;
	private String bank;
	
	//기본 생성자
	public account() {
		this(0,"예금주 없음", "000000-00-000000", "은행없음");
	}
	
	// 모든 매개변수가 있는 생성자
	public account(int deposit, String depositor, String string, String bank) {
		this.deposit = deposit;
		this.depositor = depositor;
		this.depoNumber = string;
		this.bank = bank;
	}
	
	//getter , setter
	public int getDeposit() {
		return deposit;
	}
	
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	
	public String getDepositor() {
		return depositor;
	}
	
	public void setDepositor(String depositor) {
		this.depositor = depositor;
	}
	
	public String getDepoNumber() {
		return depoNumber;
	}
	
	public void setDepoNumber(String depoNumber) {
		this.depoNumber = depoNumber;
	}
	
	public String getBank() {
		return bank;
	}
	
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	// toString 
	@Override
	public String toString() {
		return "account [deposit=" + deposit + ", depositor=" + depositor + ", depoNumber=" + depoNumber + ", bank="
				+ bank + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}




}
