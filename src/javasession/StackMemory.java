package javasession;

public class StackMemory {
	
	public static void t1()
	{
		System.out.println("t1 Method");
		t2();
	}
	public static void t2()
	{
		System.out.println("t2 Method");
		t3();
		
	}
	public static void t3()
	{
		System.out.println("t3 Method");
		//t1();
		
	}
	
	
	public void m1()
	{
		System.out.println("m1 Method");
		m2();
	}
	public void m2()
	{
		System.out.println("m2 Method");
		m3();
	}
	public void m3()
	{
		System.out.println("m3 Method");
		//m1();
		StackMemory.t1();
	}

	public static void main(String[] args) {
		
		StackMemory obj=new StackMemory();
		obj.m1();
	}

}
