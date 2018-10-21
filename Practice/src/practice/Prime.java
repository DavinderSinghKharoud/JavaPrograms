package practice;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=37;
boolean b=true;
for(int i=2;i<=num/2;i++) {
	if(num%i==0) {
	//	System.out.println("number is not prime");
	b=false;
	break;}
	
}
if(b==true) {
	System.out.println("number is  prime");
}
else {
	System.out.println("number is not  prime");
}
	}

}
