package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.flipkart.com");
        Thread.sleep(1000);
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click() ;      
        driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("dress");
        
        Thread.sleep(1000);
        
        List<WebElement> sugglist=driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']//li/descendant::a[@class='_3izBDY']"));
       
		System.out.println(sugglist.size());
		String expectedResult="dress";
		
		for(int i=0;i<=sugglist.size()-1;i++)
			
		{
			String actualResult=sugglist.get(i).getText();
			System.out.println(actualResult);
			if(actualResult.equalsIgnoreCase(expectedResult))
			{
				sugglist.get(i).click();
				break;
			}
			
		}
		
		driver.quit();

	}

}
