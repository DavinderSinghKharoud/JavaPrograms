package practice;

public class Fact {
public static int fac(int count) {
	if(count==0) {
		return 1;
	}
	else {
		return(count*fac(count-1));
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=fac(4);
System.out.println(i);
	}

}
