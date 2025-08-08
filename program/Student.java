import java.util.Scanner;
class Student
{
	void display(int studentid,String studentname,float studentmarks)
	{
		System.out.print(studentid+studentname+studentmarks);
	}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	Student obj=new Student();
	System.out.print("enter number of students");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		obj.display(sc.nextInt(),sc.next(),sc.nextFloat());
		
	}
}}	