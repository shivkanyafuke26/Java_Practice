class OddPyramid{
public static void main(String[] args) 
	{
		int n=1;
		for(int i=5;i>=1;i--)
		{
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print(n+ " ");
				n+=2;
			}
			System.out.println();
		}
	}
}