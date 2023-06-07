package javasession;

public class Arraycolour {

	public static void main(String[] args) {
		
		//. Write a Java program to create a new array list
		//--add some colors (string) 
		//---and print out the colorslist.
		
		Object color[] = new Object[6];//0-4
		color[0] = "Red";
		color[1] = "Orange";
		color[2] = "Yellow";
		color[3] = "Green";
		color[4] = "White";
		color[5]="Black";
		for(int i=0;i<color.length-1;i++)
		{
			System.out.println(color[i]);
		}
		

	}

}
