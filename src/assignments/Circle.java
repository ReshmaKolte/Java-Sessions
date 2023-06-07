package assignments;

public class Circle {
	
	public double circumference(double radius)
	{
		double circumferenceofcircle= 2*3.14*radius;
		return circumferenceofcircle;
	}
	
	public double areaofcircle(double radius)
	{
		double area=3.14*radius*radius;
		return area;
	}

	public static void main(String[] args) {
		// .Write a program to print the circumference and area of a circle of radius entered by user by defining your own method. 
		
		Circle c1=new Circle();
		double ans=c1.areaofcircle(12.3);
		System.out.println("Area of circle="+ ans);
		double d=c1.circumference(12);
		System.out.println("circumference="+ d);
		
		
		
	}

}
