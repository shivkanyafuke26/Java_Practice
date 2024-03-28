class SpyNumber{
	public static void main(String[] args) {
	
		int num=1124;
		int sum=0;
		int dup=num;
		int product=1;
		while(num>0){
			int rem=num%10;
			sum+=rem;
			product*=rem;
			num/=10;
		}
		System.out.println(sum);
		System.out.println(product);
	if(sum==product){
		System.out.println(dup+ " is a spy num ");
	}
	else{
		System.out.println(dup+ " is not spy number");
	}
	}
}