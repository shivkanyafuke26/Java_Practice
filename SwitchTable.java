import java.util.Scanner;
class SwitchTable
{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Enter Num1 ");
  int num1=sc.nextInt();
  
  int a=1;

  int output=0;  
  switch(a)
  {
   case 1:output=num1*1;  System.out.println(output+"");  
   case 2:output=num1*2;  System.out.println(output+"");
   case 3:output=num1*3;  System.out.println(output+"");
   case 4:output=num1*4;  System.out.println(output+"");
   case 5:output=num1*5;  System.out.println(output+"");
   case 6:output=num1*6;  System.out.println(output+"");
   case 7:output=num1*7;  System.out.println(output+"");
   case 8:output=num1*8;  System.out.println(output+"");
   case 9:output=num1*9;  System.out.println(output+"");
   case 10:output=num1*10;System.out.println(output+"");break;

   }

 
}
}
