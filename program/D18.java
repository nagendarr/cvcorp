import java.util.Scanner;
class D18
{
	static Scanner s1=new Scanner(System.in);
	long m3(int i)
	{
		System.out.print(i);
		return s1.nextLong();
	}
	static long m4(char c)
	{
		D18 obj1=new D18();
		System.out.print(c);
		return obj1.m3(s1.nextInt());
	}
}
class Test
{
	public static void main(String[] args)
	{
		System.out.print(D18.m4(D18.s1.next().charAt(0)));
	}
}