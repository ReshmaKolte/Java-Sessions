package assignments;

public class GenerateResult {
	
	public void result(int marks)
	{
			if(marks>90 && marks<=100)
			{
				System.out.println("Grade is AA");
			}
			else if(marks>80 && marks<=90)
			{
				System.out.println("Grade is AB");
			}
			else if(marks>70 && marks<=80)
			{
				System.out.println("Grade is BB");
			}
			else if(marks>60 && marks<=70)
			{
				System.out.println("Grade is BC");
			}
			else if(marks>50 && marks<=60)
			{
				System.out.println("Grade is CD");
			}
			else if(marks>40 && marks<=50)
			{
				System.out.println("Grade is DD");
			}
			else
				System.out.println("Fail");
				
		}
	
	public static void main(String[] args) {
		//  Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
		//Marks        Grade
		//91-100         AA
		//81-90          AB
		//71-80          BB﻿
		//61-70          BC
		//51-60          CD
		//41-50          DD
		//<=40          Fail
		
		GenerateResult r1=new GenerateResult();
		r1.result(45);
		r1.result(40);
		r1.result(89);
		r1.result(99);
	}

}
