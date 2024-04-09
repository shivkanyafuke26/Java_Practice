class ZeroOnePyramid
{
	public static void main(String[] args) 
	{
		int n=2;
		for(int i=5;i>=1;i--){
			for(int j=i-1;j>=1;j--){
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--){
				//System.out.print(n+ " ");
				n++;
				if(n%2==0){
					System.out.print("0 ");
				}
				else{
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}
}