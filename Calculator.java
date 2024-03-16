import java.util.Scanner;
class Calculator
{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter Num1");
  double num1=sc.nextDouble();
  
  System.out.println("Enter Operation");
  char operator=sc.next().charAt(0);

  System.out.println("Enter Num2");
  double num2=sc.nextDouble();
  
  boolean flag=true;
  double output=0;
  
  switch(operator)
  {
   case '+':output=num1+num2; break;
   case '-':output=num1-num2; break;
   case '*':output=num1*num2; break;
   case '/':output=num1/num2; break;
   case '%':output=num1%num2; break;
   default:System.out.println("Invalid Input"); flag=false;
}
if(flag)
{System.out.println(num1+""+operator+""+num2+" = "+output);
}
}
}
