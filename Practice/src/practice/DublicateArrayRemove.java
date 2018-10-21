package practice;

import java.util.Arrays;

public class DublicateArrayRemove {
	public static void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 4, 5, 5, 2, 3, 7, 8 };
		int j = 0;
		sort(a);
		System.out.print("sorted array" + " ");
		for (int i : a) {
			System.out.print(+i + " ");
		}
		System.out.println();

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				a[j] = a[i];
				j++;
			}

		}
		a[j] = a[a.length - 1];
		int b[] = Arrays.copyOf(a, j + 1);
System.out.println("after removing duplicate elements:");
		for (int k : b) {
			System.out.println(k);
		}

	}

}
