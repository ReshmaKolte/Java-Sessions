package constructor_Assignment;

public class Car {
//	Create a Java class named "Car" with the following instance variables:
//		make (String)
//		model (String)
//		year (int)
//		Create a constructor for the Car class that takes in the make, model, and year as parameters and initializes the instance variables.
//		Create a default constructor for the Car class that sets the make, model, and year to "Unknown".
//		Create a main method that creates three instances of the Car class using both constructors and prints out their information.
//		Questions:
//		What is the purpose of a default constructor in Java?--->initialized object
//		Can a default constructor take in parameters?--->No
//		Can a constructor be overloaded in Java? If so, what does it mean to overload a constructor?-->yes,to restrict unnecessary object
//		Can you create an object of a Java class without calling a constructor?--->yes Java will call default constructor 
//		How are instance variables accessed and modified outside of the class they are defined in?---->

	String make;
	String model;
	int year;

	public Car() {

	}

	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public static void main(String[] args) {
	 Car c1=new Car();
	 c1.make="Unknown";
	 System.out.println(c1.year+" "+c1.make+" "+c1.model);
	 Car c2=new Car("2020","Top",2022);
	 System.out.println(c2.year+" "+c2.make+" "+c2.model);

	}

}
