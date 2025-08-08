import java.util.Scanner;
class D12
{
	
	static Scanner sc=new Scanner(System.in);
	float m1(String s)
	{
		System.out.println(s);
		return sc.nextFloat();
	}
	static boolean m2(float f)
	{
		System.out.println(f);
		return sc.nextBoolean();
	}
	static boolean m3(int i)
	{
		System.out.println(i);
		boolean b=m2(sc.nextFloat());
		System.out.println(b);
		return b;
	}
public static void main(String[] args)
{
	D12 obj=new D12();
	System.out.println(obj.m1(sc.next()));
	System.out.println(D12.m3(sc.nextInt()));
}}
	
