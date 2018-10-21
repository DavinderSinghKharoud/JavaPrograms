package practice;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int marks=344;
if(marks>=90 && marks<=100) {
	System.out.println("excellent");
}
else if(marks<90 && marks>=70) {
	System.out.println("best");
}
else if(marks<70 && marks>=30) {
	System.out.println("pass");
}
else if(marks<30) {
	System.out.println("fail");
}
else {
	System.out.println("Invalid");
}
	}

}
