class AutomorphicNumber{
	public static void main(String[] args) {
		int num=6;
		int dup=num;
		int sqr=num*num;
		int div=1;
		
		while(num>0){

			div*=10;
			num/=10;

		}
		int ld=sqr%div;
		System.out.println(dup==ld?dup+"Automorphic":dup+"not Automorphic");

		}
	
}