import java.util.Scanner;
class Election
{
 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your age : ");
	int age = sc.nextInt();
	
	if(age>=18){
 	  System.out.println("Do you have a voter Id (yes/no) : ");
	  String voterId = sc.next().toLowerCase();
	  if(voterId.equals("yes"))
	   {
		System.out.println("******* Welcome ********");
		System.out.println("1. BJP ");
		System.out.println("2. Congress ");
		System.out.println("3. AAP ");
		System.out.println("4. MNS ");
		System.out.println("5. ShivSena ");
		System.out.println("6. NCP ");
		System.out.println("7. NOTA ");

	    System.out.println("Enter the option to vote your favourite party: ");
	    String vote =sc.next().toUpperCase();
            if(vote.equals("BJP")){
		System.out.println("you have voted for BJP");
	    }
		else if(vote.equals("CONGRESS")){
		System.out.println("you have voted for Congress");
	   }
	    else if(vote.equals("AAP")){
		System.out.println("you have voted for AAP");
	   }

	   else if(vote.equals("MNS")){
		System.out.println("you have voted for MNS");
	   }
	   else if(vote.equals("SHIVSENA")){
		System.out.println("you have voted for ShivSena");
	   }
	   else if(vote.equals("NCP")){
		System.out.println("you have voted for NCP");
	   }
	   else if(vote.equals("NOTA")){
		System.out.println("you have voted for Nota");
	   }
	  else
	   {
		System.out.println("Invalid Input");
         
           }
}
	else{
		System.out.println("you can go");
      }

}
else{
		System.out.println("you can vote after"+(18-age)+"years");
      }

}
}