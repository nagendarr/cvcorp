import java.util.Scanner;
class D19
{
	static Scanner sc=new Scanner(System.in);
	static D19 obj=new D19();
	int m1(char c)
	{
		System.out.print(c);
		return sc.nextInt();
	}
	float m2(long l)
	{
		System.out.print(l);
		return sc.nextFloat();
	}
	String m3(double d)
	{
		System.out.print(d);
		return sc.next();
	}
	long display(int a,float b,String c)
	{
		return sc.nextLong();
	}
}
class Test
{
	public static void main(String[] args)
	{
		Scanner s2=new Scanner(System.in);
		System.out.print(D19.obj.display(D19.obj.m1(s2.next().charAt(0)),D19.obj.m2(s2.nextLong()),D19.obj.m3(s2.nextDouble())));
	}
}