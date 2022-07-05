package flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkartlogin {
	
	//declaration : private

	@FindBy(xpath="//a[text() = 'Login']")
	private WebElement loginbutton;
	
	@FindBy(xpath= "(//input[@type = 'text'])[2]")
	private WebElement userid;
	
	@FindBy(xpath= "//input[@type = 'password']")
	private WebElement password;
	
	@FindBy(xpath= "(//span[text()='Login'])[2]")
	private WebElement loginsubmitbutton;
	
	
	//initialization : constructor
	public Flipkartlogin (WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	//usage : methods (actions)
	public void clickloginbutton() {
		loginbutton.click();
	}
	public void enteruserid(String user) {
		userid.sendKeys(user);
		}
	
	public void enterpwd(String pwd) {
		password.sendKeys(pwd);
		}
	
	public void clickonloginsubmit() {
		loginsubmitbutton.click();
	}
	
}
