package oops;

public class Employee {

	String empname;
	int empid;
	
	public Employee(String empname,int empid)
	{
		this.empname=empname;
		this.empid=empid;
	}
	public static void main(String[] args) {
		
Employee emp1=new Employee("rani",101);
System.out.println(emp1.empid);
System.out.println(emp1.empname);
	}

}
