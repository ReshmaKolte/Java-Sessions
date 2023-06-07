package javasession;

public class SwitchCar {

	public static void main(String[] args) {
		//WAP to book the specific type of car from the Uber app using Switch - Case. 
		//Car Type: Mini, Sedan, SUV, Premium
		//If user passes wrong car type, print please select the right car type
		
		String carType="SUV";
				switch(carType)
				{
				case "Mini":
					System.out.println("car type is mini");
					break;
				case "Sedan":
					System.out.println("car type is Sedan");
					break;
				case "SUV":
					System.out.println("car type is SUV");
					break;
				case "Premium":
					System.out.println("car type is Premium");
					break;
				default:
					System.out.println(" please select the right car type");
					break;
					
					
				}
				

	}

}
