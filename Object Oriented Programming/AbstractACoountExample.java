abstract class RBI


{
	RBI()
	{
		super();
	}
	abstract void rateOfInterest();
	abstract void withdrawLimit();
	abstract void depositLimit();
}
abstract class SBI extends RBI
{
	String username;
	String accountType;

	SBI(String username,String accountType)
	{
		super();
		this.username=username;
		this.accountType=accountType;
	}
	void displayDetails()
	{
		System.out.println("Username : "+username);
		System.out.println("Account Type :"+accountType);
	}
}
class Saving extends SBI
{
	Saving(String username,String accountType)
	{
		super(username,accountType);
		this.username=username;
		this.accountType=accountType;
	}
	void rateOfInterest()
	{
		System.out.println("Rate of Interest : "+8.5+" %");
	}
	void withdrawLimit()
	{
		System.out.println("Withdraw Limit : "+50000+" rs");
	}
	void depositLimit()
	{
		System.out.println("Deposit Limit : "+100000+" rs");
	}
}
class Current extends SBI
{
	Current(String username,String accountType)
	{
		super(username,accountType);
		this.username=username;
		this.accountType=accountType;
	}

	void rateOfInterest()
	{
		System.out.println("Rate of Interest : "+8.5+" %");
	}
	void withdrawLimit()
	{
		System.out.println("Withdraw Limit : "+50000+" rs");
	}
	void depositLimit()
	{
		System.out.println("Deposit Limit : "+100000+" rs");
	}
}
class AbstractACoountExample
{
	public static void main(String[] args) {
		Saving obj = new Saving("ramesh","Saving");
		obj.displayDetails();
		obj.rateOfInterest();
		obj.withdrawLimit();
		obj.depositLimit();

		Current obj1 = new Current("Suresh","Current");
		obj1.displayDetails();
		obj1.rateOfInterest();
		obj1.withdrawLimit();
		obj1.depositLimit();
	}
}