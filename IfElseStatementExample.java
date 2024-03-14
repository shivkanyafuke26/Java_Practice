//To Check Eligibility for Marriage
/*
import java.util.Scanner;
class IfElseStatementExample
{
 public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter age : ");
	int age=sc.nextInt();
	System.out.println("Enter Property : ");
	double property =sc.nextDouble();
	System.out.println("SurName is : ");
	String surName =sc.next().toUpperCase();
 
        if((age>=21 && property>=10000000)|| (surName.equals("AMBANI")))
	{
  	System.out.println("you are Eligible");
	}
	else
	{
	System.out.println("you are not Eligible");
	}
}
}


if compiler do not take output then we have three methods:
1} use nextLine i.e. sc.nextLine();
2}create object of scanner i.e. Scanner sc1= new Scanner(System.in);
3}reset the Scanner Object sc.reset
*/



//To chack Interview Eligibility 

/*

import java.util.Scanner;
class IfElseStatementExample
{
 public static void main(String[] args)
 {
  
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter Percentage: ");
  double percentage =sc.nextDouble();
   
  if(percentage>=60)
  {
   System.out.println("You are eligible for Interview");
  }
  else
  {
  
  System.out.println("You are not Eligible for Interview");
  }
}
}

//for Positive and Negative Number

import java.util.Scanner;
class IfElseStatementExample
 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter num : ");
 double num = sc.nextDouble();
 if(num>0)
 {
 System.out.println("Entered Number is Positive");
 }
 else if(num<0)
 {
 System.out.println("Entered Number is Negative"); 
 }
 else
 {
 System.out.println("Entered number is Neutral");
}
}
}

//for even and odd Number

import java.util.Scanner;
class IfElseStatementExample
{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter num : ");
 double num = sc.nextDouble();
 if(num/2==0)
 {
 System.out.println("Entered Number is Even");
 }
 else 
 {
 System.out.println("Entered Number is Odd"); 
 }
 }
}


*/

import java.util.Scanner;

public class IfElseStatementExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the employee's monthly target score: ");
        int targetScore = sc.nextInt();
        
        System.out.print("Enter the employee's current pay: ");
        double currentPay = sc.nextDouble();
        
        double payIncreasePercentage;
        
        if (targetScore > 90) {
             System.out.println("payIncreasePercentage = 0.03"); // 3%
        } else {
             System.out.println("payIncreasePercentage = 0.01"); // 1%
        }
        
               
    }
}

