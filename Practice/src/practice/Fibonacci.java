package practice;

public class Fibonacci {
static int n1=0,n2=1,n3=0;
static void fibo(int count) {
	if(count>0) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.println(n3);
		fibo(count-1);
	}
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int i=0;
int j=1;
System.out.print(i+" "+j+" ");
int count=10;
for(int k=2;k<count;k++) {
	int l=i+j;
	i=j;
	j=l;
	System.out.print(l+" ");
*/
		int count=10;
		System.out.println(n1+" "+n2);
		fibo(count-2);
		}



	
}
