public class Player{
	
	private int id;
	private String name;
	private double salary;
	
public Player()
{
	
}
public Player(int id, String name ,double salary )
{
	setId(id);
	setName(name);
	setSalary(salary);
}	

public void setId(int id)
{
	this.id=id;
}
public void setName(String name)
{
	this.name=name;
}
public void setSalary(double salary)
{
	this.salary=salary;
}
public int getId()
{
	return id;
}
public String getName()
{
	return name;
}
public double getSalary()
{
	return salary;
}
	

public void showDetails()
{
	System.out.println(id);
	System.out.println(name);
	System.out.println(salary);
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
}