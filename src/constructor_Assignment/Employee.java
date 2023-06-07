package constructor_Assignment;

public class Employee {

//	Assignment 3:
//		Create a Java class named "Employee" with the following instance variables:
//		id (int)
//		name (String)
//		salary (double)
//		Create a constructor for the Employee class that takes in the id, name, and salary as parameters and initializes the instance variables.
//		Create getter methods for each of the instance variables.
//		Create a main method that creates an instance of the Employee class using the constructor, prints out the employee's information using the getter methods, and gives the employee a 10% raise using the setter method for the salary instance variable.
//		Questions:
//		What is the purpose of a getter method in Java?-->To Get input
//		Can a getter method return void?-->No
//		What is the access level of a getter method in Java?-->public
//		What is the purpose of a setter method in Java?--->to update the value
//		Can a setter method return a value other than void?--->No

	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		Employee e1=new Employee(12,"Resham",23.5);
	System.out.println(e1.name+" "+e1.id+" "+e1.salary);
	System.out.println("---------------");
	System.out.println(e1.getId());
	System.out.println(e1.name);
	System.out.println(e1.salary);
	System.out.println("---------------");
	e1.setSalary(30.00);
	System.out.println(e1.name+" "+e1.id+" "+e1.salary);
	System.out.println(e1.getId());
	System.out.println(e1.name);
	System.out.println(e1.salary);
	
	
		

	}

}
