import java.util.Scanner;
class Season 
{
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  
  System.out.println("Enter a Month");
  String month=sc.next().toLowerCase();
   
  switch(month)
  {
   case "october": 
   case "november": 
   case "december": 
   case "january": System.out.println(month+" It's Winter.");break;
   case "february":
   case "march" :
   case "april":
   case "may":System.out.println(month+" It's Summer.");break; 
   case "jun":  
   case "july": 
   case "august": 
   case "september": System.out.println(month+" It's RainySeason.");break;
   
   default:System.out.println("Invalid Input");
}
}  
}