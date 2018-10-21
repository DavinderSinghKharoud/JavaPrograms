package practice;

public class Boss {
int salary;
int deposit;
int withdraw;
String name;
void Employ(int i,String j) {
	salary=i;
	name=j;
}
void deposit(int i) {
	salary+=i;
}
void withdraw(int i) {
	if(i>salary) {
	
System.out.println("Insufficient funds");
	}
	else {	salary-=i;
	}
}
	void display() {
	System.out.println("name is"+" "+name+" "+"and money remaining is"+salary);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Boss emp=new Boss();
emp.Employ(3000, "god");
emp.deposit(200);
emp.display();
emp.withdraw(40);
emp.display();
	}

}
