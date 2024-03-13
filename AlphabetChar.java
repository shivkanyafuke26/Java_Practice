
//write a java program to find wheather the character is alphabet or not

import java.util.Scanner;
class AlphabetChar
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Character: ");
char ch=sc.next().charAt(0);
System.out.println(((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))?"alphabet":"not alphabet");
}
}			