import java.util.Scanner;
class D11
{
static Scanner sc=new Scanner(System.in);
static D11 obj=new D11();
	boolean m3(double d)
	{
		System.out.print(d);
		return sc.nextBoolean();
	}
	static String m4(boolean b)
	{
		System.out.print(b);
		return sc.next();
	}
public static void main(String[] args)
{
	System.out.print(m4(obj.m3(sc.nextDouble())));
}}