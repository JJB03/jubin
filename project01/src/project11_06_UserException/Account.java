package project11_06_UserException;

public class Account {
	private long balance; //예금 잔액
	
	public Account() {
		
	}
	
	//getter
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		//입금
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceException { //예외 전가
		//잔고 < 출금액 : 출금x
		if(balance < money) {
			//예외 강제 발생 키워드 : throw new ???Exception();
			throw new BalanceException("잔고가 부족합니다." + (money-balance)); 
			
		}
		balance -= money;
	}

}
