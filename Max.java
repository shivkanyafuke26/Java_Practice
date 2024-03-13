import java.util.*;
class Max
{
public static void main(String args[])
{
int num1 = 1;
int num2 = 3;
int num3 = 4;
System.out.println((num1<num2)?((num1<num3)?(num1):(num3)):((num2<num3)?(num2):(num3)));
}
}