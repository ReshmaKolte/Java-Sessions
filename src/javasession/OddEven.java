package javasession;

import java.util.Scanner;

public class OddEven {

	private static Scanner sc;

	public static void main(String[] args) {
		//WAP to check number is odd or even using If - Else
		System.out.println("Enter Number");
		sc = new Scanner(System.in);
		int num =sc.nextInt();
		if(num%2==0)
			System.out.println(num+": is even number");
			
		else 
			System.out.println(num+": is odd number");
		
			
			

	}

}
