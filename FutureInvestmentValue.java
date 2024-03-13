import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.print("Enter the investment amount: ");
        double investmentAmount = sc.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = sc.nextDouble();

        System.out.print("Enter the number of years: ");
        int numberOfYears = sc.nextInt();

        double monthlyInterestRate = annualInterestRate / 12 / 100;
        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

        System.out.println("Future investment value after " + numberOfYears + " years: $" + futureValue);

       }
}
