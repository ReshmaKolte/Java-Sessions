package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LaunchUrl {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverBrowser.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
        Thread.sleep(1000);
        System.out.println(driver.getTitle());
        driver.quit();

	}

}
