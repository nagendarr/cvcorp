class Fourth{
	void m3(int a){
	System.out.println(a);
	 }
	static void m4(float b){
	System.out.println(b);
	}
	public static void main (String[] args){
	Fourth fourth=new Fourth();
	fourth.m3(90);
	int y=30;
	fourth.m3(y);
	Fourth.m4(12.3f);
	}}