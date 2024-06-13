interface InterfaceImplent1
{
	void m1();
}
interface InterfaceImplent2
{
	void m2();
}
interface Child extends InterfaceImplent1,InterfaceImplent2
{
	
	void m3();
}
class MultipleInterface implements Child
{
	public void m1()
	{
		System.out.println("Hello from m1 of InterfaceImplent1");
	}
	public void m2()
	{
		System.out.println("Hello from m2 of InterfaceImplent2");
	}
	public void m3()
	{
		System.out.println("Hello from m3 of InterfaceImplent3");
	}
}
class InterfaceImplementation1
{
	public static void main(String[] args) 
	{
		MultipleInterface obj=new MultipleInterface();
		obj.m1();
		obj.m2();
		obj.m3();
		
	}
}

