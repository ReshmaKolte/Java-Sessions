package constructor_Assignment;

public class Person {

	String name;
	int age;
	char gender;
	double height;

	public Person(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;

	}

	public static void main(String[] args) {
//		Assignment 1:
//			Create a Java class named "Person" with the following instance variables:
//			name (String)
//			age (int)
//			gender (char)
//			height (double)
//			Create a constructor for the Person class that takes in the name, age, gender, and height as parameters and initializes the instance variables.
//			Create a main method that creates two instances of the Person class using the constructor and prints out their information.
//			Questions:
//			1.What is the purpose of a constructor in Java?-->to initialize the class variables
//			2.How does a constructor differ from a regular method in Java?-->no return type,same as class name,no business logic
//			3.Can a Java class have multiple constructors? If so, how are they differentiated?-->Yes,Thy are different in no of parameters,type of parameter,sequence of parameter
//			4.What happens if a constructor is not defined in a Java class?--->Java will call default construct when we create an object
//			5.Can a constructor call other methods or constructors within the same class?--->

		Person p1 = new Person("Reshma", 30, 'f', 5.5);
		// p1.name="Kriti";
		System.out.println(p1.name + " " + p1.gender + " " + p1.age + " " + p1.height);

		Person p2 = new Person("shrikant", 35, 'm', 5.8);
		System.out.println(p2.name + " " + p2.gender + " " + p2.age + " " + p2.height);

	}

}
