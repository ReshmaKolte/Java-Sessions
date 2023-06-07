package javasession;

public class SwitchLoan {

	public static void main(String[] args) {
		//WAP to define the interest rate on the basis of Loan type using Switch Case
		//Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
		//For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan

        String loantype="Housing Loan";
        int salary=15000;
        
        switch(loantype)
        {
        case "Car Loan":
        	System.out.println("Loan type is car loan");
        	break;
        case "Housing Loan":
        	System.out.println("Loan type is Housing loan");
        	if(salary<35000)
        		System.out.println("NOT APPLICABLE FOR Housing Loan");
        	break;
        case "Personal Loan":
        	System.out.println("Loan type is Personal Loan");
        	break;
        case "Education Loan":
        	System.out.println("Loan type is Education Loan");
        	break;
        default:
        	System.out.println("Invalid type of loan");
        	
        }
	}

}
