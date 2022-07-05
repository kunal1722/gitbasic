package IRCTC_test_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IRCTC2.bookticket_b;
import IRCTC2.login_a;
import IRCTC2.logout_d;
import IRCTC2.trainlist_c;

public class Test_by_TestNG {
	private WebDriver driver;
	login_a login;
	bookticket_b book;
	trainlist_c trainsearch;
	logout_d logout;
	
	@BeforeClass
	public void launchbrowser () throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Komal Krishna\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@BeforeMethod
	public void launchloginpage() throws InterruptedException {
		login = new login_a (driver);
		login.okpopup();
		login.clickonloginbutton();
		login.enterusername("kukr1722");
		   Thread.sleep(2000);
		login.enterpwd("Myjaya1722");
		   Thread.sleep(2300);
		login.clickonsigninbutton();   
	}
	
	@Test
	public void testsearchtrain() throws InterruptedException {
		book = new bookticket_b (driver);
		book.clickonsearchsource1();
		   Thread.sleep(3000);
		}
	
	
	

}
