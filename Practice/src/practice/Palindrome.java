package practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=4550,temp,r,sum=0;
temp=num;
while(num>0) {
	r=num%10;
	sum=(sum*10)+r;
	num=num/10;
	
}
	if(temp==sum) {
		System.out.println("number is palindrome");
	}
	else {
		System.out.println("number is not palindrome");
	}
	}

}
