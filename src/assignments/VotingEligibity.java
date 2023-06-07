package assignments;

public class VotingEligibity {
	
	public boolean eligibity(int age)
	{
		if(age>=18)
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		//  A person is eligible to vote if his/her age is greater than or equal to 18.
		// Define a method to find out if he/she is eligible to﻿ vote. - return true/false

		VotingEligibity p1=new VotingEligibity();
		boolean ans=p1.eligibity(6);
		if(ans==true)
		{
			System.out.println("Person is eligible to vote");
		}
		else
		{
			System.out.println("person is not eligible to vote");
		}
		
	}

}
