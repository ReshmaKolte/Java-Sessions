package assignments;

public class ProductOfDouble {
	public double product(double a,double b)
	{
		double pro=a*b;
		return pro; 
	}

	public static void main(String[] args) {
		// Define a method that returns the product of two double numbers entered by user.
		
		ProductOfDouble  d1=new ProductOfDouble();
		double p=d1.product(34,50);
		System.out.println(p);

	}

}
