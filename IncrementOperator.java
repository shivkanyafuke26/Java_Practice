class IncrementOperator{
public static void main(String[] args)
{
/*
int a=4;
int b=a++;
int c=a;
int d=b++;	
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(a++ + b + c++ + d++);
*/

/*
int a=2;    //2
int b=++a;  //3
int c=a++;  //3(4)
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.print(a++ + b + c++ + a + b + c);
//               4(5) + 3 + 3(4) + 5 + 4 + 4 ;



int a=2; 
int b=++a; // 3
int c=b++; //3
int d=c++; //4
System.out.println(a+b+c+d++);
//                3+ 4 + 4 +3(4)



int a=3;  //3
int b=4;  //4
int c=a++; //3(4)
int d=++b; //5
System.out.println(++a + b++ + ++c + d++);
//                 5(6) + 5(6) + 4(5) + 5(6) 



int a=3;
int b=4;
int c= ++a;  //3(4)
int d= a++;  //4(5)
System.out.println (a);
System.out.println(a+b+ ++b + c + ++d);
//                 5+ 4  + 5 + 4 + 5 


int a=3;
int b=5;
System.out.println(a++ + b++ + a++ + ++a + ++b +a +b);
// 3(4) + 5(6) + 4(5) + 5 + 7+ 6 + 7
System.out.println(a);
System.out.println(b);


int a=3;
//System.out.println(++a + ++a); 
//System.out.println(++a);
// 3(4) + 5
System.out.println(++a + ++a + a++ + a++ + ++a + ++a + a++ + a++ + ++a + ++a);
//                  4  +  5  +5(6) +6(7)+  8  +   9  + 9(10)+ 10(11) +12 + 13


int a=3;
int b=a++;
System.out.println(b);
System.out.println(a);
*/

int a=4;
int b=6;
int c=a++;  //4(5)
System.out.println(c);
System.out.println(a++ + c + ++b +a + c++ + b);
//                 5(6)+ 4 + 7   +6 + 5(6) + 7
}
}


