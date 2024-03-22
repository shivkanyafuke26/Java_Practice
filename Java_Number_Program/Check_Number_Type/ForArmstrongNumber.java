import java.util.Scanner;
class ForArmstrongNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A num:");
		int num=sc.nextInt();  //let 153
		int dup=num;           // 153
		int dup1=num;          // 153
		int sum=0;          
		int length=0;

		    //(153!=0)
		while(num!=0){
			//
			length++;  //initial length=0 next will be 0(1)   
			num/=10;   //153 / 10 = 15.3   length 0(1)
					   //15 / 10 = 1.53    length 1(2)
					  // 1  / 10 = 0.153   length 2(3)  
		System.out.println("num is: " +num);
	   }

		//(153>0)
		while(dup>0){    // dup=num=153
			int rem=dup%10;  //rem=153 % 10 = 3
			int power=1;	 //rem=15 % 10 = 5
 							 //rem=1 % 10 = 1
		

		 for(int i=1;i<=length;i++){    //(i=1;i<=3;i++) power=3*1=3  loop will iterate 3 times power=3*3=9 and power=9*3=27
		 	 power=power*rem;           //(i=2;i<=3;i++) power=5*1=5  loop will iterate 3 times power=5*5=25 and power=25*5=125
		   System.out.println("power is: " +power);                             //(i=3;i<=3;i++) power=1*1=1  loop will iterate 3 times power=1*1=1 and power=1*1=1
		 	}


		 sum+=power;    // initial 0+27=27 at time of 2nd iteration 27+125=152 for 3rd 152+1=153 
		 dup/=10;      //153/10=15.3 for second 15.3/10=1.53 third 1.53/10=0.153
		 System.out.println(sum);
		 System.out.println("duplicate is : " +dup);
		}
		if(sum==dup1){   // (153=153)

		 System.out.println("Armstrong");  //Armstrong
		}
		else{
			System.out.println("Not Armstrong");
		}

	}
}


