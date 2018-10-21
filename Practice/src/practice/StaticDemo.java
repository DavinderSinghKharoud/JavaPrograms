package practice;

public class StaticDemo {

	static int count;
	int noncount;
	public StaticDemo() {
		// TODO Auto-generated constructor stub
	count++;
	noncount++;
	System.out.println(count+" "+noncount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticDemo c=new StaticDemo();
StaticDemo d=new StaticDemo();
	}

}
