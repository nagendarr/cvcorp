import java.util.Scanner;
class D13{
static Scanner sc=new Scanner(System.in);
static D13 obj=new D13();
String m1(D13 obj){
System.out.print(obj);
return sc.next();
}
static D13 m2(double y){
System.out.print(y);
return new D13();
}
public static void main(String[] args){
System.out.print(new D13().m1(new D13()));
System.out.print(sc.nextDouble());
}}