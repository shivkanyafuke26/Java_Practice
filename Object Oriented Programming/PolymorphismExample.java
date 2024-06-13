class Addition
{
	public void add() 
	{
		System.out.println("Empty Constructor");
	}
	 void add(int a)
	{
		System.out.println("i"+a);
	}
}
class Subtraction extends Addition
{
	public void sub()
	{
		System.out.println("no argument");
	}
	public void add()
	{
		System.out.println("hii");
	}
}
class PolymorphismExample
{
	public static void main(String[] args) 
	{
		//Subtraction obj=new Subtraction();
		//obj.add(4);

		Addition obj1=new Addition();
		obj1.add();

	}
}