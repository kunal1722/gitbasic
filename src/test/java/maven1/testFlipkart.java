package maven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import flipkart.Flipkartlogin;

public class testFlipkart {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Komal Krishna\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		Flipkartlogin a = new Flipkartlogin(driver);
		//a.clickloginbutton();
		//Thread.sleep(4000);
		a.enteruserid("7875528751");
		Thread.sleep(4000);
		a.enterpwd("Ranjit07@");
		Thread.sleep(5000);
		a.clickonloginsubmit();
		
		}

}
