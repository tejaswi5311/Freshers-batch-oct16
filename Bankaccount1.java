
public class Bankaccount1 {

	public static void main(String[] args) {
		CurrentAccount c = new CurrentAccount();
		SavingsAccount s = new SavingsAccount();
		c.deposits(500.00);
		s.deposite(500.00);
		doWithdrawl(c);
		doWithdrawl(s);
	}
	public static void doWithdrawl(BankAccount acc) {
		boolean result = acc.doWithdrawl(1000.00);
		if (result) {
			System.out.println("Withdraw succeed."); }
		else {
			System.out.println("Withdraw failed."); 
		}
		
	}
}	


	