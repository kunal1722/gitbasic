package IRCTC2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_a {
	@FindBy(xpath="//button[@type='submit']")
	private WebElement okbutton;
	
	@FindBy(xpath="//a[text() = ' LOGIN ']")
	private WebElement loginbutton ;
	
	@FindBy(xpath="//input [@placeholder = 'User Name']")
	private WebElement username ;
	
	@FindBy(xpath="//input [@placeholder = 'Password']")
	private WebElement password ;
	
	@FindBy(xpath="//button[text() = 'SIGN IN']")
	private WebElement signbutton ;
	
	
	
	public login_a (WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	
	public void okpopup() {
		okbutton.click();
	}
	
	public void clickonloginbutton() {
		loginbutton.click();
	}
	
	public void enterusername(String user) {
		username.sendKeys(user);
	}
	
	public void enterpwd(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickonsigninbutton() {
		signbutton.click();
	}
	

}
