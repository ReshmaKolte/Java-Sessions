package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrikant\\eclipse-workspace\\Introduction\\src\\seleniumPractice\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
        Thread.sleep(1000);
        System.out.println(driver.getTitle());
       
      driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("testing");
      Thread.sleep(1000);
    
      List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
       
      System.out.println(list.size());
      String expectedResult="Testing Life Cycle";
      
      for(int i=0;i<list.size();i++)
      {
    	 String actualResult= list.get(i).getText();
    	 if(actualResult.equalsIgnoreCase(expectedResult))
    	 {
    		 list.get(i).click();
    		 break;
    	 }
      }
       
      
       
        driver.close();


	}

}
