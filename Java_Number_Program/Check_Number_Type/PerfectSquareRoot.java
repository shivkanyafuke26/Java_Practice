import java.util.Scanner;
class PerfectSquareRoot{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		int sqrrt=0;
		boolean flag=false;

		for(int i=1;i<=num/2;i++){

			if(i*i==num){

			flag=true;

			sqrrt=i;

			break;
				}
			}
		if(flag){
			System.out.println(sqrrt+" is a perfect SquareRoot of " +num);
		}
		else{
			System.out.println(num+ " it is not a perfect squareRoot");
		}
	}
}

