package practice;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int b[][]= {{3,4},{4,5}};
int sum=0;
for(int i=0;i<b.length;i++) {
	for(int j=0;j<b.length;j++) {
		sum+=b[i][j];
	}
}
	System.out.println(sum);}

}
