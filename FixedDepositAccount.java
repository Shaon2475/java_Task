public class FixedDepositAccount extends Account {
	private int tenureYear;
	public FixedDepositAccount()
	{}
	public FixedDepositAccount(int accountNumber,String accountHolderName, double balance, int tenureYear)
	{
		super(accountNumber , accountHolderName , balance);
		setTenureYear(tenureYear);
	}
	public void setTenureYear(int tenureYear)
	{
		this.tenureYear=tenureYear;
	}
	public int getTenureYear()
	{
		return tenureYear;
	}
	
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Tenure Year: "+tenureYear);
	}
}