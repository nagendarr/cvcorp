import java.util.Scanner;
class Dynamic6{
	static Scanner sc=new Scanner(System.in);
	boolean m1(float f)
	{
	System.out.print(f);
	return sc.nextBoolean();
	}
	static int m2(float g)
	{
	System.out.print(g);
	Dynamic6 obj=new Dynamic6();
	System.out.print(obj.m1(sc.nextFloat()));
	return sc.nextInt();
	}
	public static void main(String[] args)
	{
	System.out.print(Dynamic6.m2(sc.nextFloat()));
	}}
	
	