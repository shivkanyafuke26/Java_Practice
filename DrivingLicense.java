import java.util.Scanner;
class DrivingLicense 
{
	public static void main(String[] args){
	  double marks;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Your age: ");
	  int age = sc.nextInt();
	  if(age<18){
	   System.out.println("You are not Eligible for driving License ");
		}
	  else if(age>18){
	   System.out.println("Enter Marks Obtained in RTO Exam ");
	   marks=sc.nextDouble();
		if(marks>60){
		System.out.println("You are Eligible");
		}
		else{
		System.out.println("You are Not Eligible");
		}
}
	  else{
	   System.out.println("Invalid Input");
	     }
          
          
 	 }
}
