package assignments;

public class EmployeeInfo {
	
	
	int empId;
	static final String companyName="IBM";
	String firstName;
	String lastName;
	String designation;
	String department;
	int age;
	String dateofjoining;
	boolean status;
	double salary;
	

	public static void main(String[] args) {
		
		EmployeeInfo e1=new EmployeeInfo();
		e1.empId=1001;
		e1.firstName="Teena";
		e1.lastName="Rane";
		e1.designation="Manager";
		e1.department="Engineering";
		e1.age=40;
		e1.dateofjoining="12/12/2018";
		e1.status=true;
		e1.salary=90;
		
		System.out.println(EmployeeInfo.companyName+" "+e1.empId+" "+e1.firstName+" "+e1.lastName+" "+e1.designation+" "+e1.department+" "+e1.age+" "+e1.dateofjoining+" "+e1.status+" "+e1.salary);
		System.out.println("------------------------------");
		
		EmployeeInfo e2=new EmployeeInfo();
		e2.empId=1023;
		e2.firstName="Tom";
		e2.lastName="TR";
		e2.designation="QA";
		e2.department="Quality";
		e2.age=30;
		e2.dateofjoining="31/5/2015";
		e2.status=false;
		e2.salary=40;
		
		System.out.println(EmployeeInfo.companyName+" "+e2.empId+" "+e2.firstName+" "+e2.lastName+" "+e2.designation+" "+e2.department+" "+e2.age+" "+e2.dateofjoining+" "+e2.status+" "+e2.salary);
		System.out.println("------------------------------");
		
		EmployeeInfo e3=new EmployeeInfo();
		e3.empId=2034;
		e3.firstName="Peter";
		e3.lastName="John";
		e3.designation="Manager";
		e3.department="production";
		e3.age=45;
		e3.dateofjoining="12/12/2015";
		e3.status=true;
		e3.salary=100;
		
		System.out.println(EmployeeInfo.companyName+" "+e3.empId+" "+e3.firstName+" "+e3.lastName+" "+e3.designation+" "+e3.department+" "+e3.age+" "+e3.dateofjoining+" "+e3.status+" "+e3.salary);
		System.out.println("------------------------------");
		
		
		EmployeeInfo e4=new EmployeeInfo();
		e4.empId=3014;
		e4.firstName="smith";
		e4.lastName="Jorden";
		e4.designation="Developer";
		e4.department="Engineering";
		e4.age=35;
		e4.dateofjoining="12/5/2020";
		e4.status=true;
		e4.salary=90;
		
		System.out.println(EmployeeInfo.companyName+" "+e4.empId+" "+e4.firstName+" "+e4.lastName+" "+e4.designation+" "+e4.department+" "+e4.age+" "+e4.dateofjoining+" "+e4.status+" "+e4.salary);
		
		
		
		
		
		
	}

}
