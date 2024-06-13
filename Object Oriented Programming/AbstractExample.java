abstract class Arithmetic
{
	abstract int addition (int a,int b);
	abstract int substraction (int a,int b);
	abstract int multiplication (int a,int b);
	abstract int division (int a,int b);
	abstract int modulus (int a,int b); 
}
class ArithmeticImplemention extends Arithmetic
{
	 int addition(int a,int b)
	{
		return (a+b);
	}

	int substraction(int a,int b)
	{
		return (a-b);
	}
	int division(int a,int b)
	{
		return (a/b);
	}

	int multiplication(int a,int b)
	{
		return (a*b);
	}
	int modulus(int a,int b)
	{
		return (a%b);
	}

}
class AbstractExample
{
	public static void main(String[] args) 
	{
	 ArithmeticImplemention obj = new ArithmeticImplemention();
	 System.out.println(obj.addition(4,3));
	 System.out.println(obj.division(4,3));
	 System.out.println(obj.multiplication(4,3));
	 System.out.println(obj.substraction(4,3));
	 System.out.println(obj.modulus(4,3));
	}
}