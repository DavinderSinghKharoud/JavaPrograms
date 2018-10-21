package practice;

public class StaticBlock {
static int i,j;
static {
	i=34;
	j=534;
	System.out.println("good");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(i+" "+j);
	}

}
