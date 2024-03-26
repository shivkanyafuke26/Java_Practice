import java.util.Scanner; 
class FindGCD  
{  
public static void main(String[] args)   
{  
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter number: ");
	int num1=sc.nextInt();

	System.out.println("Enter number: ");
	int num2=sc.nextInt();

	int temp, gcd=0;  
	while(num2 != 0)  
	{  
	temp = num2;  
	num2 = num1 % num2;  
	num1 = temp;  
	}  
	gcd = num1;  
	System.out.println("\n GCD =  " + gcd);  
}  
}  