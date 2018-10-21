package practice;

import java.util.Scanner;

public class Strngarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
Scanner sa=new Scanner(System.in);
System.out.println("enter the size of array");
String a[]=new String [s.nextInt()];
System.out.println("enter the values in String");
for (int i=0;i<a.length;i++) {
	String num=sa.nextLine();
	a[i]= num;
}
for(int j=0;j<a.length;j++) {
System.out.println(a[j]);	
}
	

	
	
	}

}
