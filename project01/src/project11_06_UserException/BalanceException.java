package project11_06_UserException;
//예외 강제발생

/* ----
 * 사용자 정의 예외 클래스
 * 일반 예외 : Exception 상속, public ???Exception
 * 실행 예외 : RuntimeException 상속, public class ??Exception extends Exception{ }
 */
public class BalanceException extends Exception {

	public BalanceException() {
		super();
	
	}

	public BalanceException(String message) {
		super(message);
		
	}

}
