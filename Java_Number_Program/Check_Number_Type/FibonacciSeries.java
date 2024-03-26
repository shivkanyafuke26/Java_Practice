/*
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = sc.nextInt();
        
        System.out.println("Fibonacci series up to " + n + " terms:");
        int a = 0, b = 1;
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        
      
    }
}
*/


class FibonacciSeries{
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        System.out.print(num1+" "+num2+" ");

        for(int i=0;i<=8;i++){
            int op=num1+num2;
            System.out.print(op+" ");
            num1=num2;
            num2=op;
        }
    }
}