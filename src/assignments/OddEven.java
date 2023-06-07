package assignments;

public class OddEven {
	
	public boolean oddeven(int n)
	{
		if (n%2==0)
		return true;
		else
		return false;
	}
	public static void main(String[] args) {
		// Def﻿ine a program to find out whether a given number is even or odd - return true/false.
		
		OddEven e=new OddEven();
		boolean ans=e.oddeven(615);
		if(ans==true)
		{
			System.out.println("Number is even");
		}
		else
			System.out.println("Number is odd");
	}
		
		

}
