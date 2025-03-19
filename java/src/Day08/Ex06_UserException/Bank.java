package Day08.Ex06_UserException;

public class Bank {

	public static void main(String[] args) {
		Account account = new Account();
		
		//10000 dlqrma
		account.deposit(10000);
		
		try {
			account.withdraw(20000);
		} catch (BalanceException e) {
			
		e.printStackTrace();
		
		}
		
		
	}
	
}
