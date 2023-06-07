package javasession;

public class VowelForLoop {

	public static void main(String[] args) {
		// Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		
		for(char ch='a';ch<='z';ch++)
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println(ch);
				ch++;
			}
		}
		
		System.out.println("------------------");
		char ch='a';
		while(ch<='z')
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println(ch);
			
			}
			ch++;
		}

	}

}
