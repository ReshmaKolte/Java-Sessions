package assignments;

public class MaxMin {
	
	public void maximum(int a,int b,int c)
	{
		if(a>b && a>c)
		{
			System.out.println("Maximum number is "+a);
				
		}
		else if(b>a && b>c)
		{
			System.out.println("Maximum number is"+b);
		
		}
		else
			System.out.println("Maximum number is"+c);
		
		
	}
	
	public void minimum(int a,int b,int c)
	{
		if(a<b && a<c)
		{
			System.out.println("Minimum number is "+a);
				
		}
		else if(b<a && b<c)
		{
			System.out.println("Minimum number is"+b);
		
		}
		else
			System.out.println("Minimum number is"+c);
		
	}
	public static void main(String[] args) {
		//  Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.

		MaxMin m1=new MaxMin();
		m1.maximum(122, 67, 45);
		m1.minimum(0, 6, 8);
	}

}
