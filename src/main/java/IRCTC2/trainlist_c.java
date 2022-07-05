package IRCTC2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class trainlist_c {
	@FindBy(xpath="(//span[text() ='Train Schedule'])[1]")
	private WebElement searchtrain;
	
	@FindBy(xpath="(//strong [text() = 'AC First Class (1A) '])[1]")
	private WebElement selectAC1Tier;
	
	
	public trainlist_c (WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	
	public void clickondesiredtrain() {
		searchtrain.click();
	}
	
	public void clickondesiredcoach() {
		selectAC1Tier.click();
}

}
