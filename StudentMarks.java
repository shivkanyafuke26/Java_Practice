import java.util.Scanner;
class StudentMarks
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Percentage of student : ");
double marks=sc.nextDouble();
if(marks<35)
{
System.out.println("Student is failed");
}
else if(marks<60)
{
System.out.println("Student get pass with First class");
System.out.println("with Grade B Second Class ");
}
else if(marks<75)
{
System.out.println("Student pass the exam");
System.out.println("with Grade A First  Class ");
}
else if(marks<90)
{
System.out.println("Student pass the exam");
System.out.println("with Grade A+ Distinction ");
}
else if(marks<100)
{
System.out.println("Student pass the exam");
System.out.println("with Grade O first Class with Distinction ");
}
else
{
System.out.println("Invalid Input");
}
System.out.println("Percentage of student is : " +marks +"%");
}
}