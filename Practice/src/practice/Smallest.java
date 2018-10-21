package practice;

public class Smallest {

public static int  s(int i,int j,int k) {
	int []array= {i,j,k};
	int a=array[0];

	for(int l=1;l<array.length;l++) {
		if(a>array[l]) {
			a=array[l];
		}
		}
return a;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=s(5,1,3);
System.out.println(x);
	}

}
