package javasession;

public class Multiplication {

	public static void main(String[] args) {
		//  Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
		
		
     for(int i=1;i<=100;i++)
     {
    	 
    	 if(i%5==0)
    	 System.out.println(i);
     }
     
     System.out.println("-----------");
     int i=1;
     while(i<=100) {
    	 if(i%5==0)
        System.out.println(i);
    	 i++;
    	 
     }
     System.out.println("-----------");
     
     int k=1;
     do
     {
    	 if(k%5==0)
    	  System.out.println(k);
    	    	 k++;
    	 
     }while(k<=100);
	}

}
