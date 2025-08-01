class Even{
	static int a=5,b=16;
	static int sum=0,c=0,c1=0;
	static void m1(){
		if(a>b){
			a=a+b-(a-b);
			}
			for(int i=a;i<=b;i++){
					if(i%2==0){
						c++;
						sum=sum+i;
						if(c==1){
							System.out.print(i);
							}
						else{
							System.out.print("+"+i);
							}
							}}
						if(c!=0){
							System.out.println("="+(float)sum/c);
							}}
static void m2(){
	if(a>b){
		a=a+b-(a-b);
			}
			for(int i=a;i<=b;i++){
					if(i%2==1){
						c1++;
						sum=sum+i;
						if(c1==1){
							System.out.print(i);
							}
						else{
							System.out.print("+"+i);
							}
							}}
						if(c1!=0){
							System.out.print("="+(float)sum/c1);
							}}
	
public static void main(String[] args){
	m1();
	m2();
}}