package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Shrikant\\eclipse-workspace\\Introduction\\src\\seleniumPractice\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.facebook.com");
        Thread.sleep(1000);
        System.out.println(driver.getTitle());
        
        //driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("reshmachikhale389@gmail.com");
        //driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("adhirajkolte3519890");
        //driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Reshma");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kolte");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8408886156");
        driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @data-type='password']")).sendKeys("23456sxc");
        
        driver.findElement(By.xpath("//select[@id='day']")).sendKeys("4");
        driver.findElement(By.xpath("//select[@id='month']")).sendKeys("May");
        driver.findElement(By.xpath("//select[@id='year']")).sendKeys("2012");
        
     driver.findElement(By.xpath("//span[@class='_5k_3']//input[preceding-sibling::label[text()='Female']]")).click();
      //System.out.println(radios.size());
//      String expectedResult="Female";
//      
//      for(int i=0;i<radios.size();i++)
//      {
//    	  
//    	   String actualResult=radios.get(i).getText();
//    	  if(actualResult.equalsIgnoreCase(expectedResult))
//    {
//    		  radios.get(i).click();
//    		  System.out.println("Expected match is found");
//    	       break;
//    	  }
     
    	  driver.findElement(By.xpath("//button[@type='submit' and  @name='websubmit']")).click();
    	  System.out.println("login sucessfully");
    	  
  
        Thread.sleep(1000);
        
        driver.quit();
        
	}

	}
	

