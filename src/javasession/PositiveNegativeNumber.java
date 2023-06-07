package javasession;

import java.util.Scanner;

public class PositiveNegativeNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		/*2. Write a Java program to test a number is positive or negative.
		Test Data
		Input number: 35 -- positive number
		Input number: -11 -- negative number*/
		
		System.out.println("Enter Number");
		sc = new Scanner(System.in);
		int num =sc.nextInt();
		if(num<0)
			System.out.println(num+": is negative number");
		else if(num>0)
			System.out.println(num+": is positive number");
		else
			System.out.println("Number is Zero");
				


	}

}
