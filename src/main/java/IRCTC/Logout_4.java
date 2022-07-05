package IRCTC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_4 {

	@FindBy(xpath="(//span[text() = 'Logout']) [1]")
	private WebElement logout;
	
	public Logout_4 (WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	
	public void clickonlogoutbutton() {
		logout.click();
	}
	
}


