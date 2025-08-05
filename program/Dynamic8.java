import java.util.Scanner;
class Dynamic8{
	static Scanner sc=new Scanner(System.in);
	static Dynamic8 obj=new Dynamic8();
	static void m1()
	{
		System.out.print("m1");
	}
	void m2()
	{
		System.out.print("m2");
		obj.m1();
	}
	static void m3(int i)
	{
		System.out.print(i);
		obj.m2();
		
	}
	void m4(long l)
	{
		System.out.print(l);
		obj.m3(sc.nextInt());
	}
	static float m5()
	{
		obj.m4(sc.nextLong());
		return sc.nextFloat();
	}
	boolean m6()
	{
		System.out.print(obj.m5());
		return sc.nextBoolean();
	}
	static int m7(char c)
	{
		System.out.print(c);
		System.out.print(obj.m6());
		return sc.nextInt();
	}
	double m8(String s)
	{
		System.out.print(s);
		System.out.print(obj.m7(sc.next().charAt(0)));
		return sc.nextDouble();
	}
public static void main(String[] args)
{
	System.out.print(obj.m8(sc.next()));
}}		