import java.util.Scanner;
class Withoutobj
{
static Scanner sc=new Scanner(System.in);
	String display(boolean b,float f)
	{
		System.out.print(b+" "+f);
		return sc.next();
	}
public static void main(String[] args)
{
	System.out.print(new Withoutobj().display(sc.nextBoolean(),sc.nextFloat()));
}} 