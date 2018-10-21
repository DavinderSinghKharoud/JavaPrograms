package practice;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);


System.out.println("enter the size of array");
int a[]= new int [s.nextInt()];
System.out.println("enter the values for array");
for(int i=0;i<a.length;i++) {
int num=s.nextInt();
a[i]= num;
}
for(int j=0;j<a.length;j++) {
	System.out.println(a[j]);
}
int low=a[0];
for(int k=0;k<a.length;k++) {
if(low>a[k]) {
	low=a[k];
}
}
System.out.println("Lowest value is"+low);	


	}

}
