import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChkboxAssignment {

	public static void main(String[] args) {
		
System.setProperty("webdriver.edge.driver","E:\\Software\\edgedriver_win64\\msedgedriver.exe");
		
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkbox-example")).click();
		

	}

}
