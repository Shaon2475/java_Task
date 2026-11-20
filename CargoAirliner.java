public class CargoAirliner extends Airtransporter{
	private int maxCargoWeight;
	public CargoAirliner()
	{
		//System.out.println("E-Constructor");
	}
	public CargoAirliner(String manufacturer, double maxAltitude, double maxSpeed, int maxCargoWeight)
	{
		super(manufacturer,maxAltitude,maxSpeed);
		setmaxCargoWeight(maxCargoWeight);
		
	}
	public void setmaxCargoWeight(int maxCargoWeight)
	{
		this.maxCargoWeight=maxCargoWeight;
	}
	public int getmaxCargoWeight()
	{
		return this.maxCargoWeight;
	}
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Max Weight Capacity: "+maxCargoWeight + " KG");
	}
}