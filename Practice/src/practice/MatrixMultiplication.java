package practice;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter");
		int a[][] = new int [3][3];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				int num=s.nextInt();
				a[i][j]=num;
			}
		}
			
		int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
			System.out.print(a[i][j]+b[i][j]+" ");
			
			}System.out.println();

		}
		
	}

}
