package project06_01;

public class bank {

	public static void main(String[] args) {
		account account = new account(0, "국민은행", "202020-04-202020", "한성호");
		//deposit 변수를 private으로 지정했기에 접근 불가
		
		account.setDeposit(10000);
		
		int money = account.getDeposit();
		System.out.println(account);
		System.out.println("예금액: "+ money);
	}
}
