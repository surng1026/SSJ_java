package Day08.Ex06_UserException;


//사용자 정의 예외
//public class ??Exception extends Exception {}
public class BalanceException extends Exception {

	public BalanceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BalanceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public BalanceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BalanceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public BalanceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
