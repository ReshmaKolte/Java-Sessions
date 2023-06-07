package javasession;

public class Series {

	public static void main(String[] args) {
		//  Print the following series: 
		//1.0 2.0 3.0  ...... 10.0 
		//0 9 18 27 36 …99
		
		for(float i=1;i<=10.00;i++)
		{
			System.out.print(i);
		}
		System.out.println();
		//System.out.println("--------------");

		for(int i=0;i<=100;i++)
		{
			if(i%9==0)
			System.out.print(i);
		}
	}
	

}
