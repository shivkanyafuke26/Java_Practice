import java.util.Scanner;
class SunnyNumber{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		int sum=num+1;
		int sqrrt=0;
		boolean flag=false;

		for(int i=1;i<=sum/2;i++){

			if(i*i==sum){

			flag=true;

			sqrrt=i;

			break;
				}
			}
		if(flag){
			System.out.println(sum+" is a Sunny Number ");
		}
		else{
			System.out.println(sum+ " it is not a Sunny Number");
		}
	}
}

