/*
import java.util.Scanner;
class KrishnamurthyNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();  //145
		int dup=num;            //145 
		int sum=0;
		while(num>0)      //145>0p 7
		{  
		 int rem=num%10;  
		// System.out.println(rem); 	
		 	int fact=1;
			for(int i=rem;i>=1;i--)
			{
			fact=fact*i;
	     	}
		// System.out.println(fact);
		 sum+=fact; 
		 num/=10;
		}

		if(dup==sum){
			System.out.println(dup +" is a krishnmurthy number");
		}
		else{
			System.out.println(dup +" is a krishnmurthy number");
		}
	
}
}

*/

class KrishnamurthyNumber{
	public static void main(String[] args) {
		
		for(int j=1;j<=50000;j++)
		{
		int num=j;  //145
		int dup=num;            //145 
		int sum=0;
		while(num>0)      //145>0p 7
		{  
		 int rem=num%10;  
		// System.out.println(rem); 	//ctrl+alt(for cursor)
		 	int fact=1;
			for(int i=rem;i>=1;i--)
			{
			fact=fact*i;
	     	}
		// System.out.println(fact);
		 sum+=fact; 
		 num/=10;
		}

		if(dup==sum){
			System.out.println(dup + " is a krishnmurthy number");
		}
		
}
}
}
