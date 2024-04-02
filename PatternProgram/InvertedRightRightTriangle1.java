/*
class InvertedRightRightTriangle1{
	public static void main(String[] args) {

		for(int i=1;i<=5;i++)
	{												//*
		for(int j=1;j<i;j++)                        //* *
		{										    //* * *
			System.out.print("  ");					//* * * *
    	}
		for(int j=i;j<=5;j++)
		{
		System.out.print("* ");
		}
  System.out.println();
  }
	}
}
*/


class InvertedRightRightTriangle1{
	public static void main(String[] args) {                  //* * * 
		//outer for loop shows the rows.                      //* *
		for(int i=5;i>=1;i--){                                //* 
              for(int j=1 ;j<=i;j++){
              	System.out.print("* ");
              }
              System.out.println();
		}                                           
	}
}