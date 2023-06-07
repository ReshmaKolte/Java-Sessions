package encapsulation_Assignment;

public class PersonTest {

	public static void main(String[] args) {
	Person p1=new Person("Peter",30,"Male");
     System.out.println(p1.getName());
     System.out.println(p1.getGender());
     System.out.println(p1.getAge());
     p1.setAge(35);
     System.out.println(p1.getAge());
     p1.printInfo("Reshma",34,"Female");
	

	}

}
