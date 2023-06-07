package javasession;

public class Student {
	
	// //WAF
			//create a method -- getStudentMarks
			//pass a parameter: studentName (String)
			//return the student marks --> int
			
	public int getStudentMarks(String studentName)
	{
		int marks=-1;
		
		switch(studentName)
		{

		case "Riya":
			System.out.println("getting marks for : " + studentName);
			marks=90;
			break;
		case "Priya":
			System.out.println("getting marks for : " + studentName);
			marks=50;
			break;
		case "Siya":
			System.out.println("getting marks for : " + studentName);
			marks=40;
			break;
		case "Tiya":
			System.out.println("getting marks for : " + studentName);
			marks=80;
			break;
		default:
			System.out.println("no student found...pls pass the right student name...." + studentName);
			break;
		
		}
		return(marks);
	}

	public static void main(String[] args) {
		
		Student s1=new Student();
		int m1=s1.getStudentMarks("Riya");
		System.out.println(m1);
		
		int m2=s1.getStudentMarks("diya");
		System.out.println(m2);

		
		

	}

}
