   
import java.util.Scanner;
class PalindromeNumber1{  
 public static void main(String args[]){  
  int r,sum=0,dup; 
  String s="";   
  Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

 // int n=454;//It is the number variable to be checked for palindrome  
  
  dup=n;                //454                
  while(n>0){           //454>0             //  for second 45.4         // for third 4
   r=n%10;              //454 % 10 = 4      //for second  45%10=5       // for third  4%10=4 
   sum=(sum*10)+r;      //0 *10+4=4         // for second 4*10+5=45     // for third 45*10+4
   n=n/10;              //454=45.4          // for second 45/10=4.5     // for third  4/10=0   (terminated)
  }    
  if(dup==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
} 


