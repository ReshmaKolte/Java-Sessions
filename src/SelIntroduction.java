import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		//Invoking Browser
		//Chrome--> ChromeDriver--> Methods close
		//firefox-->geckodriver
		//System.setProperty("webdriver.chrome.driver","E:\\Software\\chromedriver_win32\\chromedriver.exe");
		
	
		//WebDriver driver=new ChromeDriver();
		
		//Edge Driver
		System.setProperty("webdriver.edge.driver","E:\\Software\\edgedriver_win64\\msedgedriver.exe");
		
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		String name=driver.getTitle();
		System.out.println(name);
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		//driver.close();
		
	}

}
