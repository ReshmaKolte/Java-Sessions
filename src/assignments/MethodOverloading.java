package assignments;

public class MethodOverloading {
	
	
	public int addition(int a,int b) {
		
		int c=a+b;
		return c;
		
	}
	

	public int subtraction(int a,int b) {
		
		int c=a-b;
		return c;
		
	}

	public int multiplication(int a,int b) {
		
		int c=a*b;
		return c;
		
	}

	public int division(int a,int b) {
		
		int c=a/b;
		return c;
		
	}
	
	public static void main(String[] args) {
		// 1.Write a program to print the addition/subtraction/division/multiplication of two numbers entered by user by defining your own method

		MethodOverloading a =new MethodOverloading();
		int add=a.addition(12,34);
		System.out.println("Addition of two numbers=:"+add);
		int sub=a.subtraction(13,45);
		System.out.println("Subtraction of two numbers=:"+sub);
		int mul=a.multiplication(34,13);
		System.out.println("Multiplication of two numbers=:"+mul);
		int div=a.division(23, 2);
		System.out.println("Division of two numbers=:"+div);
		
	}

}
