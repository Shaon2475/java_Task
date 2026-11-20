public class SavingsAccount extends Account{
	private double interestRate;
	public SavingsAccount()
	{}
	public SavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate )
	{
		super(accountNumber , accountHolderName , balance);
		setInterestRate(interestRate);
	}
	
	public void setInterestRate(double interestRate)
	{
		this.interestRate=interestRate;
	}
	public double getInterestRate()
	{
		return interestRate;
	}
	
	public void withdraw(int amount)
	{
		
		if (amount > 0 && amount<=getBalance())
		{
		double newBalance= getBalance()-amount;
      
        setBalance(newBalance);	   
		}
		else {
			System.out.println("Insufficient Balance");
		}
        		
		
	}
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Interest Rate is: "+interestRate + " percent");
	}
	
	
	
	
	
	
	
	
	
}