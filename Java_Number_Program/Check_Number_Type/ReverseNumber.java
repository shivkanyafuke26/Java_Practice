/*
import java.util.Scanner;
public class ReverseNumber   
{  
public static void main(String[] args)   
{  
Scanner sc=new Scanner(System.in);
int number = sc.nextInt();
int reverse = 0;  
while(number != 0)   //565
{  
int remainder = number % 10;         //565 % 10=5    //56%10=6     //5%10=5
reverse = reverse * 10 + remainder;  //0*10+5= 5     //5*10+6=56   //56*10+5=565
number = number/10;                  //565/10=56.5   //56/10=5     //5/10=0
}  
System.out.println("The reverse of the given number is: " + reverse);  
}  
} 

*/

//100 % 10   //10% 10  //1



import java.util.Scanner;
public class ReverseNumber   
{  
public static void main(String[] args)   
{  
Scanner sc=new Scanner(System.in);
int number = sc.nextInt();
String reverse = "" ;  
while(number != 0)   //565
{  
int remainder = number % 10;         //565 % 10=5    //56%10=6     //5%10=5
reverse = reverse + remainder;       //0*10+5= 5     //5*10+6=56   //56*10+5=565
number = number/10;                  //565/10=56.5   //56/10=5     //5/10=0
}  
System.out.println("The reverse of the given number is: " + reverse);  
}  
} 