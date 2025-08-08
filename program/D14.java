import java.util.Scanner;
class D14
{
	static Scanner sc=new Scanner(System.in);
	boolean display(int i,float f)
	{
		System.out.print(i+" "+f);
		return sc.nextBoolean();
	}
}
class test
{
	public static void main(String[] args)
	{
		System.out.print(new D14().display(D14.sc.nextInt(),D14.sc.nextFloat()));
	}
}