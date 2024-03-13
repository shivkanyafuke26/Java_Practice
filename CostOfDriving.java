import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance to drive (miles): ");
        double distance = sc.nextDouble();

        System.out.print("Enter the fuel efficiency of the car (miles per gallon): ");
        double efficiency = sc.nextDouble();

        System.out.print("Enter the price per gallon: ");
        double pricePerGallon = sc.nextDouble();

        double gallonsNeeded = distance / efficiency;

        double totalCost = gallonsNeeded * pricePerGallon;

        System.out.println("Total cost of the trip: " + totalCost);

        }
}
