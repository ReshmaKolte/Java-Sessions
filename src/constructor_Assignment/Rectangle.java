package constructor_Assignment;

public class Rectangle {

//	Assignment 2:
//		Create a Java class named "Rectangle" with the following instance variables:
//		length (double)
//		width (double)
//		Create a default constructor for the Rectangle class that sets both the length and width to 0.0.
//		Create a constructor for the Rectangle class that takes in the length and width as parameters and initializes the instance variables.
//		Create a method in the Rectangle class named "calculateArea" that returns the area of the rectangle (length * width).
//		Create a main method that creates two instances of the Rectangle class using both constructors, calculates and prints out their respective areas.
//		Questions:
//		What is the purpose of a default constructor in Java?-->Initialize the object
//		How can you differentiate between a default constructor and a constructor that takes in parameters?-->passing no. of parameters
//		What is the access level of a constructor in Java?--->Public
//		Can a constructor be private? If so, why would you want to make a constructor private?
//		Can a constructor call a method from another class?

	double lenght;
	double width;

	public Rectangle() {

	}

	public Rectangle(double lenght, double width) {

		this.lenght = lenght;
		this.width = width;
	}
	public double calculateArea()
	{
		double area=lenght*width;
		return area;
	}
	
	public static void main(String[]args)
	{
		Rectangle r1=new Rectangle(2.3,4.5);
		double result=r1.calculateArea();
		System.out.println(result);
		
		Rectangle r2=new Rectangle(0.0,0.0);
		double result1=r2.calculateArea();
		System.out.println(result1);
		
		
	}

}
