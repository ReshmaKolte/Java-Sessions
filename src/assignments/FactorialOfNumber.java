package assignments;

public class FactorialOfNumber {
	
	
	public int fact(int num)
	{
		int result=1;
		while(num>0)
		{
			
			 result=result*num;
			 num--;
			 }
		return result;
		
	}

	public static void main(String[] args) {
//		8. Write a program to print the factorial of a number by defining a method named 'Factorial'.
//		Factorial of any number n is represente﻿d by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
//		4! = 1*2*3*4 = 24
//		3! = 3*2*1 = 6
//		2! = 2*1 = 2
//		Also,
//		1! = 1
//		0! = 0
		FactorialOfNumber  f1=new FactorialOfNumber();
		int ans=f1.fact(9);
		System.out.println("Factorial of number is:"+ ans);
		
		
	}

}
