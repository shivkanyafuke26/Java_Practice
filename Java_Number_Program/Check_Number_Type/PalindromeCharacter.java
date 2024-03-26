import java.util.*;
class PalindromeCharacter
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name=sc.next();
		String revName="";
		//String revName=" ";   ( get an error)
		for(int i=name.length()-1;i>=0;i--){
			revName+=name.charAt(i);
			//System.out.println(name);

		}
		System.out.println((revName.equals(name))?name+" Palindrome":name +" Not Palindrome");
	}
}