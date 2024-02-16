package project11_06_UserException;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		
		// 10000입금
		account.deposit(10000);
		// 20000출금
		try {
			account.withdraw(20000);
		} catch (BalanceException e) {
			e.printStackTrace();
		}

	}

}
