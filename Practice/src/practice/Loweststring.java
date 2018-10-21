package practice;



public class Loweststring {

	public static void main(String[] args) {
		// TODO Auto-generated method st
	String a[]= {"god","god"};	
String low=a[0];
for(int i=0;i<a.length;i++) {
	if(low.length()>a[i].length()) {
		low=a[i];
	}
}System.out.println(low);
	}

	}
