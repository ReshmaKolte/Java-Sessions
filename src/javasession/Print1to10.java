package javasession;

public class Print1to10 {

	public static void main(String[] args) {
		// WAP to print 1 to 10 using for, while and do-while loop
		//WAP to print 10 to 1 using for, while and do-while loop
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("------------");	
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		System.out.println("------------");	
		int j=1;
		do
		{ 
			System.out.println(j);
			j++;
		}while(j<=10);
		System.out.println("------------");	
		
		for(int k=10;k>=1;k--)
			{System.out.println(k);
		
	}
	System.out.println("------------");	
		
	    int l=10;
		while(l>0)
		{
			System.out.println(l);
			l--;
		}
		System.out.println("------------");	
		int m=10;
		do
		{ 
			System.out.println(m);
			m--;
		}while(m>0);
		
		
		}

}
