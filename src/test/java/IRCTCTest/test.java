package IRCTCTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import IRCTC.BookTicket_2;
import IRCTC.Login_1;
import IRCTC.Logout_4;

public class test {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Komal Krishna\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Login_1 a = new Login_1(driver);
		a.okpopup();
		a.clickonloginbutton();
		a.enterusername("kukr1722");
		   Thread.sleep(3000);
		a.enterpwd("Myjaya1722");
		   Thread.sleep(9000);           // for entering captcha manually
		a.clickonsigninbutton();
		
		
		BookTicket_2 b = new BookTicket_2(driver);
		b.clickonsearchsource1();
		   Thread.sleep(3000);
		b.clickonsearchsource2("GKP");
		   Thread.sleep(3000);
		b.clickonsource();
		   Thread.sleep(3000);
		b.clickonsearchdestination1();
		   Thread.sleep(3000);
		b.clickonsearchdestination2("LKO");
		   Thread.sleep(3000);
		b.clickondestination();
		   Thread.sleep(3000);
		b.selectcoach();
		   Thread.sleep(3000);
		b.ac1class();
		   Thread.sleep(3000);
		b.selectflexiblewithdate();
		   Thread.sleep(3000);
		b.selectavavilableberth();
		   Thread.sleep(3000);
		b.clickonsearch();
		
		/*TrainList_3 c = new TrainList_3(driver);
		c.clickondesiredtrain();
		   Thread.sleep(3000);
		c.clickondesiredcoach();
		   Thread.sleep(3000);*/
		
		Logout_4 d = new Logout_4(driver);
		d.clickonlogoutbutton();
	    driver.close();

	}

}
