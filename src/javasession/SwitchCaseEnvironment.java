package javasession;

public class SwitchCaseEnvironment {

	public static void main(String[] args) {
		// WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case
	String ch="UAT";
	switch (ch) {
	
	case "QA":
			System.out.println("QA environment");
			break;
			
	case "Stage":
			System.out.println("Stage environment");
			break;
	case "UAT":
			System.out.println("UAT environment");
			break;
	case "Prod":
			System.out.println("Prod environment");
			break;
		
	default:
			System.out.println("Please enter correct Environment");
			break;
	}
	
	}

}
