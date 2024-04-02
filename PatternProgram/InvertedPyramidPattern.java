



/*
class InvertedPyramidPattern
{ 
	public static void main(String[] args) { 
	for(int i=1;i<=5;i++)
	{
		for(int j=i-1;j>=1;j--)
		{
			System.out.print(" ");
    }
		for(int j=5;j>=i;j--)
		{
		System.out.print("* ");
		}
  System.out.println();
  }
} 	
}



import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (odd number): ");
        int rows = scanner.nextInt();

        int spaces = rows / 2;
        int stars = 1;

        // Upper half of the diamond
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++)
                System.out.print(" ");
            for (int j = 1; j <= stars; j++)
                System.out.print("*");

            if (i <= rows / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
            System.out.println();
        }
    }
}
*/


