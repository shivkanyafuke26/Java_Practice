class Parent
{
	private void m1(int a) 
	{
		System.out.println("hii");
	}
}

class Child
{
	private void m1(int a) 
	{
		System.out.println("hello");
	}
}

class AbstractionExample
{
	public static void main(String[] args) 
	{
		Child child=new Child();
		child.m1(5);	
	}
}