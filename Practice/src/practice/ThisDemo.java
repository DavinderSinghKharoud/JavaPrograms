package practice;

public class ThisDemo {
int m;
int num;
void set(int num,int m) {
	m=m;
	num=num;
	
}
void woo(int num,int m) {
	this.num=num;
	this.m=m;
	
}
void print() {
	System.out.println(num+" "+m);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisDemo c=new ThisDemo();
ThisDemo d=new ThisDemo();
c.set(2, 4);
d.woo(2, 4);
c.print();
d.print();
	}

}
