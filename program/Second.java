class Second{
void m1()
{
System.out.println("method1");
}
static void m2()
{
System.out.print("method2");
}
public static void main(String[] args)
{
 Second x = new Second();
 x.m1();
 m2();   
}
}