public class OverDraftAccount extends SavingsAccount {
	private double limit ;
	public OverDraftAccount()
	{}
	public OverDraftAccount(int accountNumber, String accountHolderName, double balance,double interestRate, double limit)
	{
		super(accountNumber , accountHolderName , balance, interestRate);
		setLimit(limit);
	}
	public void setLimit(double limit)
	{
		this.limit=limit;
	}
	public double getLimit()
	{
		return limit;
	}
	
	public void withdraw(int amount)
	{
		if (amount > 0 && amount<= getBalance() + limit )
		{
			setBalance(getBalance()-amount);
		}
		 else 
		 {
			 System.out.println("Insufficient Balance Type ");
		 }
	}
	
	
	public void showDetails(){
		super.showDetails();
		System.out.println("Maximum  limit: "+limit);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}