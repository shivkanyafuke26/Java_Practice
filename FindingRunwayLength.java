/*
import java.util.Scanner;
class FindingRunwayLength
{
public static void main(String[] args){
double speed=60;
double acceleration=3.5;
double length= (speed*speed)/(2*acceleration);
System.out.println("Length is = "+length);
}
}

*/



import java.util.Scanner;

public class FindingRunwayLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter velocity : ");
        double v = sc.nextDouble();

        System.out.print("Enter acceleration : ");
        double a = sc.nextDouble();

        double length = (v * v) / (2 * a);

        System.out.println("Minimum runway length required: " + length + " meters");

            }
}
