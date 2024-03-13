class OperatorAll
{
public static void main(String[] args)
{
/*
	int a = 2;
	int b = 3;
	
	System.out.println(a+b);
	System.out.println(a+b);
	System.out.println(a+b);
	System.out.println(a+b);
	System.out.println(a+b);*/

int k=0;
for (int i = 0; i <= 65535; i++) {
            char unicodeChar = (char) i;
            System.out.print(k++ + "  " + unicodeChar+" ");
				}

/*
char ch=128;
System.out.print(ch +"utanu");
*/

}
}