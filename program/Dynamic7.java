import java.util.Scanner;
class Dynamic7{
static Scanner sc=new Scanner(System.in);
	String m1(int a){
	System.out.println(a);
	return sc.next();
	}
	static float m2(Boolean b){
	System.out.println(b);
	System.out.println(m4(sc.next()));
	return sc.nextFloat();
	}
	double m3(char c){
	System.out.println(c);
	System.out.print(m1(sc.nextInt()));
	return sc.nextDouble();
	}
	static long m4(String d){
	System.out.println(d);
	Dynamic7 obj=new Dynamic7();
	System.out.println(obj.m3(sc.next().charAt(0)));
	return sc.nextLong();
	}
public static void main(String[] args){
	System.out.println(Dynamic7.m2(sc.nextBoolean()));
	
	}}
	