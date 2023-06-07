package javasession;

public class GreatestNumber {

	public static void main(String[] args) {
		//Find out the greatest number out of three different given numbers:
			//Input the 1st number: 25 
			//Input the 2nd number: 78 
			//Input the 3rd number: 87
			//Expected Output :
			//The greatest﻿: 87
		int a=25;
		int b=78;
		int c=87;
		if(a>b && a>c)
			System.out.println("The greatest number is:"+a);
		else if(b>c && b>a)
			System.out.println("The greatest number is: "+b);
		else 
			System.out.println("The greatest number is: "+c);
		


	}

}
