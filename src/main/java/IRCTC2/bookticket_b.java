package IRCTC2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookticket_b {
	@FindBy(xpath="(//input[@aria-autocomplete='list'])[1]")
	private WebElement searchsource;
	
	@FindBy(xpath="//span[text() = 'GORAKHPUR JN - GKP']")
	private WebElement source ;
	
	@FindBy(xpath="(//input[@aria-autocomplete='list'])[2]")
	private WebElement searchdestination ;
	
	@FindBy(xpath="//span[text() = 'LUCKNOW NR - LKO']")
	private WebElement destination ;
	
	@FindBy(xpath="//p-dropdown[@id = 'journeyClass']")
	private WebElement selectcoach;
	
	@FindBy(xpath="//li[@aria-label='AC First Class (1A) ']")
	private WebElement ACcoach;
	
	@FindBy(xpath="//label [text () = 'Flexible With Date']")
	private WebElement flexiblewithdate;
	
	@FindBy(xpath="//label [text () = 'Train with Available Berth ']")
	private WebElement availableberth;
	
	@FindBy(xpath="//button[text() = 'Search']")
	private WebElement search;
	
	
	public bookticket_b (WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	
	public void clickonsearchsource1() {
		searchsource.click();
		
		}
	public void clickonsearchsource2(String src) {
		searchsource.sendKeys(src);
		}
	
	
	public void clickonsource() {
		source.click();
	}
	
	public void clickonsearchdestination1() {
		searchdestination.click();
		
	}
	public void clickonsearchdestination2(String dest) {
		searchdestination.sendKeys(dest);
	}
	
	public void clickondestination() {
		destination.click();
	}
	
	public void selectcoach() {
		this.selectcoach.click();
	}
		
	public void ac1class() {
		ACcoach.click();	
	}
			
	public void selectflexiblewithdate() {
		flexiblewithdate.click();
	}
		
	public void selectavavilableberth() {
		availableberth.click();
	}
		
	public void clickonsearch() {
		search.click();
		
		
	}
	

}
