package assignments;

public class MethodChaining {

	//NS -- NS -- Yes (No object)
		//S -- S --> Yes (No Object)
		//NS --> S --> : directly/class name, no object
		//S --> NS  --> need object
		//stack --> LIFO
		//Queue--> FIFO
		//stack --> out of memory: Stack Overflow error
		
		//3 static
		//3 ns
		//static -- static
		//staic -- NS
		//NS - S
		// NS - NS
		 public static void add(int a,int b)
		 {
			 System.out.println("Addition"+(a+b));
			 sub(12,30);//static to static
		 }
		 public static void sub(int a,int b)
		 {
			 System.out.println("subtraction"+(a-b));
			 mul(12,3);//static to static
		 }
		 public static void mul(int a,int b)
		 {
			 System.out.println("Multiplication"+(a*b));
			 
			 MethodChaining m1=new MethodChaining();
			m1.getData();//static to non-static

		 }
		 public void print()
		 {
			 System.out.println("Non static method");
			 employee(); //non-static to non-staic
		 }
		 public void employee()
		 {
			 System.out.println("Non static employee method");
			 getData();//non-static to non-static
             MethodChaining.add(20,30);//non-static-static
		 }
		 public void getData()
		 {
			 System.out.println("non static getData method");
		 }
		 

		
		public static void main(String[] args) {
			MethodChaining mc=new MethodChaining();
			mc.print();//non-static
			
		}
	}


