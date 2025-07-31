class Methodddd{
 	void display1(int i,char c,boolean b){
	System.out.print(i+","+c+","+b);
	}
	static String display2(long l,double d){
	System.out.print(l+","+d);
	return "hello";
	}
	public static void main(String[] args){
	Methodddd x=new Methodddd();
	x.display1(415,'a',true);
	System.out.print(x.display2(61666176717l,5765686876.7668));
	}}