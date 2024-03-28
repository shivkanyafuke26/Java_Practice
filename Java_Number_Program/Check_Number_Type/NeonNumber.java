class NeonNumber{
	public static void main(String[] args) {
	
		int num=9;
		int sqr=num*num;
		int dup=num;
		int sum=0;
		while(sqr>0){
			int rem=sqr%10;
			sum+=rem;
			sqr/=10;
		}
		if(sum==dup){
			System.out.println(num+" is a Neon Number");
		}
		else{
			System.out.println(num+" is not a Neon Number");
		}
	
	}
}










/*
class NeonNumber{
	public static void main(String[] args) {
		
		for(int j=1;j<=100;j++)
		{
		int num=j;
		int sqr=num*num;
		int dup=num;
		int sum=0;
		while(sqr>0){
			int rem=sqr%10;
			sum+=rem;
			sqr/=10;
		}
		if(sum==dup){
			System.out.println(num+" is a Neon Number");
		}
		else{
			System.out.println(num+" is not a Neon Number");
		}
	}
	}
}
*/