package javasession;

import java.util.*;

public class DynamicArrayColour {

	public static void main(String[] args) {
		// Write a Java program to search an element in an array list using for loop. Once we find that element, break the loop.
		
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Red");
		ar.add("Blue");
		ar.add("Green");
		ar.add("Orange");
		ar.add("Red");
		System.out.println(ar);
		for(int i=0;i<ar.size()-1;i++) {
			//System.out.println();
			if(ar.get(i).equals("Blue"))
					{
				
				//System.out.println(ar[i]);
				System.out.println("Colour  is Blue");
				break;
					}
			
		}
		ar.remove(3);
		System.out.println(ar);
			
		
	}

}
