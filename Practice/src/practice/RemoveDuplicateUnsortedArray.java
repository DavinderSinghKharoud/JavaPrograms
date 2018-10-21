package practice;

import java.util.Arrays;

public class RemoveDuplicateUnsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,2,3,4,5,4,7,7,8,8};
int size=a.length;
int j = 0;
for(int i=0;i<size;i++) {
	for( j=i+1;j<size;j++) {
		if(a[i]==a[j]) {
			a[j]=a[size-1];
			size--;
			
		
			
		}
	}
}
int b[]=Arrays.copyOf(a,j);
System.out.println("after removing duplicate elements");
for(int k:b) {
	System.out.println(k);
}

	}

}
