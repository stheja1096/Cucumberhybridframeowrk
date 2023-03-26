/**
 * 
 */
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Elementutils;

/**
 * @author LENOVO
 *
 */
public class Homepage {
	WebDriver driver;
	private Elementutils elementutils;
	
	public Homepage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	Elementutils elementutils=new Elementutils(driver);
}
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myAccountDropMenu;
	
	@FindBy(linkText="Login")
	private WebElement loginOption;
	
	@FindBy(linkText="Register")
	private WebElement registerOption;
	
	@FindBy(name="search")
	private WebElement searchBoxField;
	
	@FindBy(xpath="//button[contains(@class,'btn-default')]")
	private WebElement searchButton;
	
	public void clickonmyaccount() {
		elementutils.clickOnElement(myAccountDropMenu, 15);
		//myAccountDropMenu.click();
}
public Loginpage clickonloginoption() {
	elementutils.clickOnElement(loginOption, 20);
	
	// loginOption.click();
	 return new Loginpage(driver);
}
public void enterproductintosearchbox(String producttext) {
	elementutils.typeTextIntoElement(searchBoxField, producttext, 20);
	//searchBoxField.sendKeys(producttext);
}
public SearchResultspage clickonsearchbutton() {
	elementutils.clickOnElement(searchButton, 20);
	//searchButton.click();
	return new SearchResultspage(driver);


}
}
