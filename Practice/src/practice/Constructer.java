package practice;

public class Constructer {
int marks;
int rollno;
public Constructer() {
	System.out.println("good");
	// TODO Auto-generated constructor stub
}
public Constructer(int i) {
	System.out.println(i);
}
public Constructer(int i,int j) {
	marks=i;
	rollno=j;
	System.out.println(marks+" "+rollno);
}
public Constructer(Constructer s) {
	s.marks=34;
	s.rollno=342;
	System.out.println(s.marks+" "+s.rollno);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructer c=new Constructer();
Constructer d=new Constructer(34);
Constructer e=new Constructer(45,56);
Constructer f=new Constructer(e);

	}

}
