
import java.util.Scanner;
class AreaOfHexagon
{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Side : ");
double s=sc.nextDouble();
double area=(3*Math.sqrt(3)*s*s)/2;
System.out.println("Area = " +area);
}
}

/*
import java.util.Scanner;

class AreaOfHexagon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side length of the hexagon: ");

        double sideLength = sc.nextDouble();
        
        double area = (3 * Math.sqrt(3) * sideLength * sideLength) / 2;
       
        System.out.println("Area of the hexagon: " + area);
        
    }
}

*/