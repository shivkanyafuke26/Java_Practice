class DiamondPattern
{ 
	public static void main(String[] args) { 
	for(int i=10;i>=1;i--)
	{
		for(int j=i-1;j>=1;j--)
		{
			System.out.print(" ");
    }
		for(int j=10;j>=i;j--)
		{
		System.out.print(" *");
		}
  System.out.println();
  }


  for(int i=1;i<=11;i++)
	{
		for(int j=i-1;j>=1;j--)
		{
			System.out.print(" ");
    }
		for(int j=11;j>=i;j--)
		{
		System.out.print("* ");
		}
  System.out.println();
  }
	}
}
