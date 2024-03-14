import java.util.Scanner;
class BloodDonation
{
	public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your age: ");
	 int age=sc.nextInt();
	 System.out.println("Do you have Consume Cigarettes (yes/no) : ");
	  String cigarette = sc.next().toLowerCase();
	
	   if(cigarette.equals("yes"))
	   {
	   System.out.println("you are not eligible");
	   }
	   else
	   {
	   System.out.println("you are eligible");
	   }

	   System.out.println("Do you have Consume Alcohol (yes/no) : ");
	   String alcohol = sc.next().toLowerCase();

	   if(alcohol.equals("yes"))
	   {
	   System.out.println("you are not eligible");
	   }
	   else
           {
       	   System.out.println("you are eligible");
	   }
	   if(age<20){
	   System.out.println("you are Eligible to donate the blood ");
	   } 
	   else{
           System.out.println("your are not Eligible");
	   }
           System.out.println("your age is : " +age);
}
}
	
   