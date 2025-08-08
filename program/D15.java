import java.util.Scanner;
class D15
{
	static Scanner sc=new Scanner(System.in);
	static D15 obj=new D15();
	boolean m1(int i)
	{
		System.out.print(i);
		return sc.nextBoolean();
	}
	static double m2(String s)
	{
		System.out.print(s);
		return sc.nextDouble();
	}
	long m3(char c)
	{
		System.out.print(c);
		return sc.nextLong();
	}
}
class Test
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int c=s.nextInt();
		switch(c)
		{
			case 1:
			System.out.print(D15.obj.m1(s.nextInt()));
			break;
			case 2:
			System.out.print(D15.m2(s.next()));
			break;
			case 3:
			System.out.print(D15.obj.m3(s.next().charAt(0)));
			break;
			default:
			System.out.print("invalid input.enter 1,2 or 3");
		}
	}
}