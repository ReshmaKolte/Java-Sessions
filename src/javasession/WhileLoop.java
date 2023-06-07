package javasession;

public class WhileLoop {

	public static void main(String[] args) {
		//Print 100 times “Naveen“ with while loop
		int i=1;
		while(i<=100)
		{
			System.out.println("Naveen");
			i++;
		}
	System.out.println("------------------------------------------------------");
		int k = 1;
		while(true) {
			System.out.println("Naveen");//12
			if(k==100) {//no no
				break;
			}
			k++;
		}
	}

}
