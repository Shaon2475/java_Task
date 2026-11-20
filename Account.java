public class Account {
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	public Account()
	{}
public Account(int accountNumber,String accountHolderName, double balance)
{
	setAccountNumber(accountNumber);
	setAccountHolderName(accountHolderName);
	setBalance(balance);
}

public void setAccountNumber(int accountNumber)
{
	this.accountNumber=accountNumber;
}
public int getAccountNumber()
{
	return accountNumber;
}
public void setAccountHolderName(String accountHolderName)
{
	this.accountHolderName= accountHolderName;
}
public String getAccountHolderName()
{
	return accountHolderName;
}
public void setBalance(double balance)
{
	this.balance=balance;
}
public double getBalance()
{
	return balance;
}


public void deposit(double amount)
{
	balance+=amount;
	//System.out.println("Total balance after deposit "+balance )
}
public void showDetails()
{
	System.out.println("Account Number: "+accountNumber);
	System.out.println("Account Holder Name: "+accountHolderName);
	System.out.println("Account Balance: "+balance);	
}
	
}