package practice;

public class Employee {


String name;
int employnum;
float salary;
float taken;
	void display(String n,int num,float sal) {
	name=n;
	employnum=num;
	salary=sal;
	System.out.println("His name is"
	+" "+name+".");
	System.out.println("His id number is"+" "+
	employnum+".");
	System.out.println("His salary per "
			+ "month in"
			+ " the past was"+" "+salary+".");
	}
	void salaryy(float sala) {
		salary=sala;
		System.out.println("This month his"
				+ " salary is"+" "+salary);
		
	}
	void salWithdraw(float withdraw) {
	System.out.println("money withdrawn is"
	+" "+withdraw);
	taken=withdraw;
	
	}
	void remainingAmount() {
		float i=salary-taken;
	System.out.println("remaining amount is"+" "+i);
	}
	public static void main(String[] args) {
		Employee manager=new Employee();
		manager.display("kal", 1, 15000);
	manager.salaryy(30000);
	manager.salWithdraw(13000);
	manager.remainingAmount();
	Employee faculty=new Employee();
	faculty.display("Davinder", 0, 10000);
    faculty.salaryy(20000);
    faculty.salWithdraw(10000);
    faculty.remainingAmount();
    Employee Director=new Employee();
    Director.display("God", 0, 1000000);
    Director.salaryy(2000000);
    Director.salWithdraw(1400000);
    Director.remainingAmount();
	
	
	
	}
	
	
	
	}


