
import java.util.Scanner;
class FutureInvestment
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter the side length of the hexagon: ");

double investmentAmount = sc.nextDouble();
 
System.out.print("Enter the side length of the hexagon: ");

double monthlyinterestRate = sc.nextDouble();
        
System.out.print("Enter the side length of the hexagon: ");

double numberOfYears = sc.nextDouble();
                
double futureInvestmentValue = investmentAmount*(1+monthlyinterestRate)numberOfYears*12;

System.out.print("Enter the side length of the hexagon: "+futureInvestmentValue);

}

}       
      /*


import java.util.Scanner;

class FutureInvestment  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = sc.nextDouble();

        double monthlyInterestRate = annualInterestRate / 12 / 100;

        double interestForNextMonth = balance * monthlyInterestRate;

        System.out.println("Interest for the next month: " + interestForNextMonth);

        }
}


*/