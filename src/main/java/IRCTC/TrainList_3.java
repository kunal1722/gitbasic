package IRCTC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainList_3 {

	@FindBy(xpath="(//span[text() ='Train Schedule'])[1]")
	private WebElement searchtrain;
	
	@FindBy(xpath="(//strong [text() = 'AC First Class (1A) '])[1]")
	private WebElement selectAC1Tier;
	
	
	public TrainList_3 (WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	
	public void clickondesiredtrain() {
		searchtrain.click();
	}
	
	public void clickondesiredcoach() {
		selectAC1Tier.click();
}
}
