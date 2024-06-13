abstract class Parent

{
	abstract void m1();

	abstract void m2();
	
	void m3()

	{

		System.out.println("hello from parent class M3();");

	}

}

abstract class Child1 extends Parent

{
	
	void m2()
	
	{
	
		System.out.println("Hello from child1 Class M2();");
	
	}
	
	abstract void m4();

}

class Child2 extends Parent

{

	 void m1()

	 {

	 	System.out.println("Hello from Child2 class m1();");

	 }

	 void m2()

	 {

	 	System.out.println("Hello from Child2 class m2();");

	 }

	 void m5()
	
	 {
	
	 	System.out.println("Hello from Child2 class m5();");
	
	 }
}

class SubChild extends Child1

{

	void m1()

	 {

	 	System.out.println("Hello from SubChild class M1();");

	 }

	 void m4()

	 {

	 	System.out.println("Hello from SubChild2 class m4();");
	 
	 }

}

class AbstractExampleDriver

{

	public static void main(String[] args) 

	{

		Child2 obj= new Child2();

		obj.m1();

		obj.m2();

		obj.m3();

		obj.m5();

		SubChild obj1= new SubChild();

		obj1.m1();

		obj1.m3();

		obj1.m4();

	}

} 