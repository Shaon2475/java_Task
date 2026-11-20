public class BankAccount{
	public static void main (String [] args){
		System.out.println();
		System.out.println("Common Account Details");
		
		Account a1= new Account(112678, "Shaon",15670);
		a1.deposit(5000);
		a1.showDetails();
		System.out.println();
		System.out.println("Savings account Details");
		System.out.println();
		
		SavingsAccount s1= new SavingsAccount(134345, "Shahin",15700,6.5);
		s1.deposit(6000);
		s1.withdraw(15000);
		s1.showDetails();
		System.out.println();
		System.out.println("Over Draft Account Details ");
		System.out.println();
		
		OverDraftAccount o1= new OverDraftAccount(112698,"kakon",18797,6.0,30000);
		o1.deposit(7000);
		o1.withdraw(49000);
		o1.showDetails();
		System.out.println();
		System.out.println("Fixed Deposit Account DEtails");
		System.out.println();
		
		FixedDepositAccount f1= new FixedDepositAccount();
		f1.setAccountNumber(11267);
		f1.setAccountHolderName("Shaon");
		f1.setBalance(15670);
		f1.setTenureYear(1);
		f1.deposit(5430);
		f1.showDetails();
	}
}