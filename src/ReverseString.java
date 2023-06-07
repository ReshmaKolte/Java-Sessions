import java.util.Scanner;

public class ReverseString {
	
		public static void main(String args[])
		{
		System.out.println("Enter String");
		try (Scanner sc = new Scanner(System.in)) {
			String org=sc.nextLine();
			int length=org.length();
			String rev="";
			for(int i=length-1;i>=0;i--)
			{
			rev=rev+org.charAt(i);

			}
			
			System.out.println("Reverse of the entered string is:"+rev);
		}


		}
		}

