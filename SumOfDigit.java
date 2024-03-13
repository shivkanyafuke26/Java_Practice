/*
import java.util.Scanner;
class SumOfDigit
{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number: ");
int num=sc.nextInt();
int dup = num;
int sum = 0;
sum = sum + num % 10;
num = num/10;
sum = sum + num % 10;
num = num/10;
sum = sum + num % 10;
System.out.println("Sum of Digits Is "+sum+" and the number: "+dup);
}
} 
*/


import java.util.Scanner;
class SumOfDigit
{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number: ");
int num=sc.nextInt();
int dup = num;
int sum = 0;
sum = sum + num % 10;
num = num/10;
sum = sum + num % 10;
num = num/10;
sum = sum + num % 10;
num = num/10;
sum = sum + num % 10;
System.out.println("Sum of Digits Is "+sum+" and the number: "+dup);
}
} 
