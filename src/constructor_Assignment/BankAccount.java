package constructor_Assignment;

public class BankAccount {

//	Create a Java
//	class named"BankAccount"with the following instance variables:
//	     accountNumber (String)
//		balance (double)
//		Create a constructor for the BankAccount class that takes in the accountNumber and balance as parameters and initializes the instance variables.
//		Create a method in the BankAccount class named "deposit" that takes in a double value as a parameter and adds it to the balance instance variable.
//		Create a method in the BankAccount class named "withdraw" that takes in a double value as a parameter and subtracts it from the balance instance variable.
//		Create a main method that creates an instance of the BankAccount class using the constructor and performs multiple deposits and withdrawals using the deposit and withdraw methods. Print out the updated balance after each transaction.
//		Questions:
//		What is the purpose of an instance variable in Java?
//		How are instance variables different from local variables in Java?
//		What is the access level of an instance variable in Java?
//		What is the purpose of a method in Java?
//		Can a method call other methods within the same class?
	String accountNumber;
	double balance;

	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public double deosite(double money) {
		balance=this.balance+money;
		return balance;
		
	
	}

	public double withdraw(double money) {
		balance=this.balance-money;
		return balance;
				
	}

	
	public static void main(String[] args) {
		
		BankAccount b1=new BankAccount("1223455",5000);
		double amount=b1.deosite(1000);
		System.out.println("After Deposite Updated Balance is: "+amount);
		double amount2=b1.withdraw(1200);
		System.out.println("After withdrawal Updated Balance is: "+amount2);
		
		

	}

}
