package javasession;

import java.util.ArrayList;
import java.util.*;

public class ArrayReverse {

	public static void main(String[] args) {
		// . Reverse this array List:
		//ArrayList<String> studentNames = new ArrayList<String>();
		//  studentNames.add("Varun");
		// studentNames.add("Reena");
		//studentNames.add("Naveen");
		// studentNames.add("Robin");
		//studentNames.add("Peter");
		
		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Varun");
		studentNames.add("Reena");
		studentNames.add("Naveen");
		studentNames.add("Robin");
		studentNames.add("Peter");

//		ArrayList<String> reversestudentNames = new ArrayList<String>();
//		
//		for(int i=studentNames.size()-1;i>=0;i--)
//		{
//			reversestudentNames[i]=studentNames[i];
//		}
	System.out.println("Before Reverse");
	System.out.println(studentNames);
	
	System.out.println("After Reverse");
	Collections.reverse(studentNames);
	System.out.println(studentNames);
	

	}

}
