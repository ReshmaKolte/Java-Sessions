package javasession;

public class Employee {
	
	String name;
	int age;
	String city;
	String designation;
	
	public static void main(String[] args) {
	
		
		Employee emp1=new Employee();
		emp1.name="Reena";
		emp1.age=30;
		emp1.city="Pune";
		emp1.designation="Tester";
		System.out.println(emp1.name +"  " +emp1.age+ " " +emp1.city+ " "+emp1.designation);
		
		Employee emp2=new Employee();
		emp2.name="Teena";
		emp2.age=40;
		emp2.city="Mumbai";
		emp2.designation="QA";
		System.out.println(emp2.name +"  " +emp2.age+ " " +emp2.city+ " "+emp2.designation);
		
		
		Employee emp3=new Employee();
		emp3.name="Meena";
		emp3.age=35;
		emp3.city="Banglore";
		emp3.designation="Automation QA";
		System.out.println(emp3.name +"  " +emp3.age+ " " +emp3.city+ " "+emp3.designation);
		
		
		Employee emp4=new Employee();
		emp4.name="Geeta";
		emp4.age=45;
		emp4.city="Delhi";
		emp4.designation="Manager";
		System.out.println(emp4.name +"  " +emp4.age+ " " +emp4.city+ " "+emp4.designation);
		
		System.out.println("=========================");
		
		emp1=emp2;
		System.out.println(emp1.name +"  " +emp1.age+ " " +emp1.city+ " "+emp1.designation);
		System.out.println(emp2.name +"  " +emp2.age+ " " +emp2.city+ " "+emp2.designation);
		System.out.println(emp3.name +"  " +emp3.age+ " " +emp3.city+ " "+emp3.designation);
		System.out.println(emp4.name +"  " +emp4.age+ " " +emp4.city+ " "+emp4.designation);
		
		
		System.out.println("=========================");
		
		emp2=emp3;
		System.out.println(emp1.name +"  " +emp1.age+ " " +emp1.city+ " "+emp1.designation);
		System.out.println(emp2.name +"  " +emp2.age+ " " +emp2.city+ " "+emp2.designation);
		System.out.println(emp3.name +"  " +emp3.age+ " " +emp3.city+ " "+emp3.designation);
		System.out.println(emp4.name +"  " +emp4.age+ " " +emp4.city+ " "+emp4.designation);
		
		
		System.out.println("=========================");
		
		emp3=emp4;
		System.out.println(emp1.name +"  " +emp1.age+ " " +emp1.city+ " "+emp1.designation);
		System.out.println(emp2.name +"  " +emp2.age+ " " +emp2.city+ " "+emp2.designation);
		System.out.println(emp3.name +"  " +emp3.age+ " " +emp3.city+ " "+emp3.designation);
		System.out.println(emp4.name +"  " +emp4.age+ " " +emp4.city+ " "+emp4.designation);
		
		System.out.println("=========================");
		
		emp4=emp1;
		System.out.println(emp1.name +"  " +emp1.age+ " " +emp1.city+ " "+emp1.designation);
		System.out.println(emp2.name +"  " +emp2.age+ " " +emp2.city+ " "+emp2.designation);
		System.out.println(emp3.name +"  " +emp3.age+ " " +emp3.city+ " "+emp3.designation);
		System.out.println(emp4.name +"  " +emp4.age+ " " +emp4.city+ " "+emp4.designation);
		
	//	System.out.println(emp1.name +"  " +emp1.age+ " " +emp1.city+ " "+emp1.designation);
		
		
		
		
		
	

	}

}
