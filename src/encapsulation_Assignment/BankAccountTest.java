package encapsulation_Assignment;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount b1=new BankAccount("123445",40000,"Tom");
		b1.printStatement();
		b1.setBalance(60000);
		b1.printStatement();
		System.out.println("Balance:"+b1.getBalance());
		b1.setOwner("Peter");
		b1.printStatement();
		b1.deposit(20000);
		b1.printStatement();
		b1.withdraw(2000);
		b1.printStatement();
		System.out.println("Account Number:"+b1.getAccountNumber());
		
	}

}
