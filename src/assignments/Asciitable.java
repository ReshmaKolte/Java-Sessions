package assignments;

public class Asciitable {

	public static void main(String[] args) {
		//Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.
		
		for(char ch='a';ch<='z';ch++)
		{
			System.out.println(ch+"="+(byte)ch);
		}
		
		System.out.println("-------------------------");
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch+"="+(byte)ch);
		}
		System.out.println("-------------------------");
		for(char i='0';i<='9';i++)
		{
			System.out.println(i+"="+(byte)i);
		}
		
		System.out.println("-------------------------");
		char ch='a';
		while(ch<='z')
		{
			System.out.println(ch+"="+(byte)ch);
			ch++;
		}
		System.out.println("-------------------------");
		char cha='A';
		while(cha<='Z')
		{
			System.out.println(cha+"="+(byte)cha);
			cha++;
		}
		
		System.out.println("-------------------------");
		char c='0';
		while (c<='9')
		{
			System.out.println(c+"="+(byte)c);
			c++;
		}
				
		
	}

}
