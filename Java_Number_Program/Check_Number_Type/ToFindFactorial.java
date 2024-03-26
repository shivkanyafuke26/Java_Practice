import java.util.*;
class ToFindFactorial{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num");
		int num=sc.nextInt();
		int fact=1;
		for(int i=num;i>=2;i--){
			fact=fact*i;
			//fact*=i;
		}
		System.out.println(fact);
	}
	
}