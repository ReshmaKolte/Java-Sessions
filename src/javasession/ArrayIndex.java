package javasession;

public class ArrayIndex {

	public static void main(String[] args) {
		//  Write a Java program to retrieve an element at a specified index from a given array list.
		//Write a Java program to update specific array element by given element.
		// Write a Java program to remove the third element from an array list. 
	int a[]=new int[5];
	a[0]=123;
	a[1]=234;
	a[2]=345;
	a[3]=456;
	a[4]=567;
	System.out.println(a[3]);
	System.out.println(a[4]);//567
	System.out.println(a.length);
	// System.out.println(a[5]);//AIOB
	a[4]=789;
	System.out.println(a[4]);//789
	

	}

}
