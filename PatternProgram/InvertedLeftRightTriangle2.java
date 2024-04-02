
class InvertedLeftRightTriangle2{
	public static void main(String[] args) {

		for(int i=3;i>=1;i--)
	{												//      *
		for(int j=i-1;j>=1;j--)                     //	  * *
		{										    //  * * *
			System.out.print("  ");                 //* * * *
    	}
		for(int j=3;j>=i;j--)
		{
		System.out.print("* ");
		}
  System.out.println();
  }
	}
}

