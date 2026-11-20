class Mobile{
	String mobileOwnerName;
	String mobileNumber;
	double mobileBalance;
	String mobileOSName;
	boolean lock;
                                                            //cd C:\Users\HP\Desktop\java

public Mobile() 
{
  System.out.println("E-Constructor");
	
}
public Mobile (String mobileOwnerName,String mobileNumber,double mobileBalance,String mobileOSName,boolean lock)
{
	
	setMobileOwnerName(mobileOwnerName);
	setMobileNumber(mobileNumber);
	setMobileBalance(mobileBalance);
	setMobileOSName(mobileOSName);
	setLock(lock);
}

public void setMobileOwnerName(String mobileOwnerName)
{
	this.mobileOwnerName=mobileOwnerName;
}
public String getMobileOwnerName()
{
	return mobileOwnerName;
}
public void setMobileNumber(String mobileNumber)
{
	this.mobileNumber=mobileNumber;
}
public String getMobileNumber()
{
	return mobileNumber;
}
public void setMobileBalance(double mobileBalance)
{
	this.mobileBalance=mobileBalance;
}
public double getMobileBalance()
{
	return mobileBalance;
}
public void setMobileOSName(String mobileOSName)
{
	this.mobileOSName=mobileOSName;
}
public String getMobileOSName()
{
	return mobileOSName;
}
public void setLock(boolean lock)
{
	this.lock=lock;
}
public boolean isLock()
{
	return lock;
}

public void showDetails()
{
	if(!lock)
	{
	System.out.println("Mobile owner name: " + mobileOwnerName);
	System.out.println("Mobile Number: " + mobileNumber);
	System.out.println("Mobile Balance: " + mobileBalance);
	System.out.println("Mobile OS name: " + mobileOSName);
	System.out.println("Mobile Lock? : " + lock);
	
   }
   else {
	   System.out.println("This phone is locked cannot show you information. ");
   }
}

public void recharge(int amount) {
        if (!lock) {
            double mobileBalance = getMobileBalance() + amount;
            System.out.println("Recharged amount" + amount + "and New mobile balance: " + mobileBalance);
        } else {
            System.out.println("your Phone is locked you Cannot make any recharge.");
        }
    }

    
    public float adjustAfterCall(float timeDuration, float costPerMinute)
	{
        if (!lock) {
            float cost = (timeDuration * costPerMinute);
			
            if (mobileBalance >= cost) 
			{
               mobileBalance =  mobileBalance - cost;
                System.out.println("Call cost is: " + cost + "and your Remaining balance for call is: " + mobileBalance);
                return cost;
            }
			else 
			{
                System.out.println("Insufficient balance for the call.");
                return 0;
            }
        }
		else 
		{
            System.out.println("Phone is locked you Cannot make a call.");
            return 0;
        }

   }
}


public class Start03{
	
	public static void main(String args []){
		Mobile m1= new Mobile("Note9","016XXXXXXXXX",19.6,"Andriod",false);
		Mobile m2= new Mobile("J6","019XXXXXXXXX",18.6,"Andriod",true);
		Mobile m3= new Mobile("Iphone","018XXXXXXXXX",50,"ios",false);
		Mobile m4= new Mobile("Samsung","016XXXXXXXXX",30,"Andriod",true);
		 System.out.println("Details for mobile number m1:");
		m1.showDetails();
		m1.recharge(20);
		m1.adjustAfterCall(1.23f,0.6f);
		System.out.println();
		 System.out.println("Details for mobile number m2:");
		m2.showDetails();
		m2.recharge(30);
		m2.adjustAfterCall(5.6f,1.02f);
		System.out.println();
		 System.out.println("Details for mobile number m3:");
		m3.showDetails();
		m3.recharge(15);
		m3.adjustAfterCall(6.8f,0.74f);
		System.out.println();
		 System.out.println("Details for mobile number m4: ");
		m4.showDetails();
		m4.recharge(20);
		m4.adjustAfterCall(10,0.67f);
	} 	
	
}