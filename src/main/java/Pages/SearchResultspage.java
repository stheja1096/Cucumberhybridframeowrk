/**
 * 
 */
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author LENOVO
 *
 */
public class SearchResultspage {
	
	WebDriver driver;
	public SearchResultspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=("//div[@id='content']/h1"))
	private WebElement validproduct;
@FindBy(xpath=("//input[@type='button']/following-sibling::p"))
private WebElement textmessage;
public boolean  statussearchvalidresults() {
	return validproduct.isDisplayed();
}
public String gettextmessage() {
	return textmessage.getText();
}
}
