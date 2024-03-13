/*import java.util.Scanner;
class EnergyCalculation
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
Double Q;
Double M=55.5;
Double finalTemperature=10.5;
Double initialTemperature=3.5; 
Q= M*(finalTemperature-initialTemperature)*4184;
System.out.println("Q is = "+Q);
}
}
*/


import java.util.Scanner;
class EnergyCalculation
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("M is =");
double m=sc.nextDouble();
System.out.println("Final Temperature is =");
double finalTemperature=sc.nextDouble();
System.out.println("initial Temperature is =");
double initialTemperature=sc.nextDouble();
double Q= m*(finalTemperature-initialTemperature)*4184;
System.out.println("Q is = "+Q);
}
}