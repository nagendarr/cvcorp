import java.util.Scanner;
class D17
{
	static Scanner s1=new Scanner(System.in);
	static D17 obj=new D17();
	String m1(double d)
	{
		System.out.print(d);
		return s1.next();
	}
	static boolean m2(String s)
	{
		System.out.print(s);
		return s1.nextBoolean();
	}
}
class Test
{
	static Scanner s2=new Scanner(System.in);
	public static void main(String[] args)
	{
		 System.out.print(D17.m2(D17.obj.m1(s2.nextDouble())));
	}
}