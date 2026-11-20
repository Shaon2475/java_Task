public class Cricketer extends Player
{
	private int matchPlayed;
	private int totalRun;
	private int totalWicket;
	
	public Cricketer()
	{
		
	}
	public Cricketer(int id, String name, double salary, int matchPlayed, int totalRun, int totalWicket)
	
	{
		super(id, name, salary);
		setMatchPlayed(matchPlayed);
		setTotalRun(totalRun);
		setTotalWicket(totalWicket);
			
	}
	public void setMatchPlayed(int matchPlayed)
	{
		this.matchPlayed=matchPlayed;
	}
	public void setTotalRun(int totalRun)
	{
		this.totalRun=totalRun;
	}
	public void setTotalWicket(int totalWicket)
	{
		this.totalWicket=totalWicket;
	}
	
	public int getMatchPlayed()
	{
		return matchPlayed;
	}
	public int getTotalRun()
	{
		return totalRun;
	}
	public int getTotalWicket()
	{
		return totalWicket;
	}
	
	
	public double avgRun()
	{
		float avgRun= (float)(totalRun / matchPlayed);
         return	avgRun;	
	}
	public double avgWic()
	{
		float avgWic= (float)(totalWicket / matchPlayed);
         return	avgWic;	
	}
	public double anualSalary()
	{
		float anualSalary= (float)(getSalary() * 12);
         return	anualSalary;	
	}
	
	public void showDetails()
	{
		super.showDetails();
		System.out.println(avgRun());
		System.out.println(avgWic());
		System.out.println(anualSalary());
	}
	
	
	
	
	
	
} 