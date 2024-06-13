interface Arithmetic
{
	int add(int a,int b);
	int multi(int a,int b);
}

class Child implements Arithmetic
{
	public int add(int a,int b)
	{
		System.out.println(a+b);
		return a+b;
	}
	public int multi(int a,int b)
	{
		System.out.println(a*b);
		return a*b;
	}
}
class InterfaceImplementation
{
	public static void main(String[] args) 
	{
		Child obj=new Child();
		obj.add(2,3);
		obj.multi(2,3);
		
	}
}