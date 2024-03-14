
import java.util.Scanner;
class FutureInvestment
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter the investment Amount : ");

double investmentAmount = sc.nextDouble();
 
System.out.print("Enter the monthly interestRate: ");

double monthlyinterestRate = sc.nextDouble();
        
System.out.print("Enter the number Of Years: ");

double numberOfYears = sc.nextDouble();
                
double futureInvestmentValue = investmentAmount*(1+monthlyinterestRate)numberOfYears*12;

System.out.print("Enter the side length of the hexagon: "+futureInvestmentValue);

}

}       
      
