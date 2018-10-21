package practice;

import java.util.Scanner;

public class ArrayAscending {

	public static void ar() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the size of array");
int x=s.nextInt();
int a[]=new int[x];
System.out.println("enter all the elements");
for(int i=0;i<x;i++) {
	a[i]=s.nextInt();
}
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
	if(a[i]>a[j]) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	}
}
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
	}

}
