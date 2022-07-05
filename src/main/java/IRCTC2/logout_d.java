package IRCTC2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout_d {
	@FindBy(xpath="(//span[text() = 'Logout']) [1]")
	private WebElement logout;
	
	public logout_d (WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	
	public void clickonlogoutbutton() {
		logout.click();
	}

}
