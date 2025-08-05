class D10{
static java.util.Scanner sc=new java.util.Scanner(System.in);
	String m1(float f)
	{
		System.out.print(f);
		return "hello";
	}
	static boolean m2(int i)
	{
		System.out.print(i);
		return true;
	}
public static void main(String[] args)
{
	D10 obj=new D10();
	obj.m1(sc.nextFloat());
	m2(sc.nextInt());
}}