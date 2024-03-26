/*
import java.util.Scanner;
public class FindNumberFactor{

  public static void main(String[] args) {

    // positive number
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    System.out.print("Factors of " + number + " are: ");

    // loop runs from 1 to 60
    for (int i = 1; i <= number; ++i) {

      // if number is divided by i
      // i is the factor
      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}


import java.util.Scanner;
public class PositiveNumberFactor {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    if (num < 0) {
            int positiveNumber= num * -1;
              System.out.println("Positive number: " + positiveNumber);
        } else {
            
            System.out.println("Original number: " + num);
        }
    

        
    }
}


*/


import java.util.Scanner;
public class FindNumberFactor{

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    if (number < 0) {
            number *= -1;
            System.out.print("Factors of " + number + " are: ");

        } else {
            
            System.out.print("Factors of " + number + " are: ");

        }
    

    System.out.print("Factors of " + number + " are: ");

    for (int i = 1; i <= number; ++i) {

      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
