import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weightPounds = sc.nextDouble();

        System.out.print("Enter your height in inches: ");
        double heightInches = sc.nextDouble();

        double weightKg = weightPounds * 0.45359237;

        double heightMeters = heightInches * 0.0254;

        double bmi = weightKg / (heightMeters * heightMeters);

        System.out.println("Your Body Mass Index (BMI) is: " + bmi);

           }
}
