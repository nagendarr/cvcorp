import java.util.Scanner;
class Dynamic9{
static Scanner sc=new Scanner(System.in);
	int add(int a,int b)
	{
		return a+b;
	}
	int sub(int a,int b)
	{
		return a-b;
	}
	static int multiply()
	{
		Dynamic9 obj=new Dynamic9();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=obj.add(a,b);
		System.out.println("Addition of "+a+" & "+b+" = "+c);
		int d=obj.sub(a,b);
		System.out.println("Substraction of "+a+" & "+b+" = "+d);
		return c*d;
	}
public static void main(String[] args)
	{
	System.out.print("Multiplication of add & sub = "+multiply());
	}}