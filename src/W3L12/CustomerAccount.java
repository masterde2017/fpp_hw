package W3L12;

public class CustomerAccount {
	 private String Cus_name;
	 private String Acc_No;
	 private double Balance;
	 
	 
	 
	public CustomerAccount(String cus_name, String acc_No, double balance) {
		super();
		Cus_name = cus_name;
		Acc_No = acc_No;
		Balance = balance;
	}
	
	 public void deposit(double i) {
		 this.Balance+=i;
	 }
	 
	 public void withdraw(double i) {
		
			try {
				 if(Balance<i) throw new WithdrawExceedException("Excetpion: withdrawing amount exceed balance");
				 this.Balance = this.Balance-i;
				 if( this.Balance < 100) throw new  BalanceException("Excetpion: the balanse is less than 100 $");
			} catch (WithdrawExceedException e) {
				// TODO Auto-generated catch block
				
				System.out.println(e.getMessage());
				
			} catch (BalanceException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			
				
			}
		
		
	 }
	 
	 class WithdrawExceedException extends Exception{
		// String s;
		 public WithdrawExceedException(String s) {
			super(s);
		 }
		 
	 }
	 
	 class BalanceException extends Exception{
		// String s;
		 public BalanceException(String s) {
			 super(s);
		 }
	 }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerAccount  ca = new CustomerAccount(" He","1235",200);
		ca.withdraw(201);
		System.out.println(ca.Balance);
		
		ca.withdraw(105);
		System.out.println(ca.Balance);
		
	}

}
