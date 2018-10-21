package practice;

public class ArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,2,9};
int sum=0;
int average=a.length;
for(int i=0;i<a.length;i++) {
	sum+=a[i];
	
}
double x=(double)sum/average;
System.out.println(x);



	}

}
