class Parent{
	String str="Hello I am str1";
	void m1()
	{
		System.out.println("Hello from non static context of parent");
	}
	static void m3()
	{
		System.out.println("Hello from static context of parent");
	}
}

class Child extends Parent
{
	String str="Hello I am str2";
	void m2()
	{
		//m1();
		m3();
		System.out.println(str);
		System.out.println(super.str);
		System.out.println("Hello i am non static context of child");
	}
	static void m3()
	{
		//m3();
		System.out.println("Hello i am static context of child");
	}
}

class InheritanceDriver  // constructor not static or static they are just special member of class stored in the method area invoked during object creation and used to initialize java member
{
	public static void main(String[] args) 
	{
		Child obj=new Child ();
		obj.m2();
		System.out.println(obj.str);
		obj.m1();
		
	}

}