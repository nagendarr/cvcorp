class Methods{
	void m5(boolean a){
	System.out.println(a);
	}
	double m6(double b){
	return b;
	}
	static long m7(long c){
	return c;
	}
	public static void main(String[] args){
	Methods x=new Methods();
	x.m5(true);
	double z=x.m6(172827.26);
	System.out.println(z);
	long l=Methods.m7(277272828);
	System.out.println(l);
	}}
	
	