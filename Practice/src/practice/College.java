package practice;

public class College {
static String college="cegep";
int num;
String name;
void college(int i,String j) {
	num=i;
	name=j;
	
}
void display() {
	System.out.println("name is"+" "+name+" "+"and roll no is"+num);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
College c=new College();
College d=new College();
c.college(2, "god");
d.college(1, "guru");
c.display();
d.display();
	}

}
