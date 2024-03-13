/*
import java.util.Scanner;
class EvenOdd
{
 public static void main(String[]args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a Number: ");
 int num =sc.nextInt();
 String[] evenOdd = {"Even", "Odd"};
 System.out.println(num + " is " + evenOdd[num % 2] + ".");
}
}
 
*/

import java.util.Scanner;
class EvenOdd
{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number..");
int num=sc.nextInt();
//System.out.println(((num%2)==num)?"Even":"Odd");
System.out.println(((num/2.0)==num/2)?"Even":"Odd");
} 
}