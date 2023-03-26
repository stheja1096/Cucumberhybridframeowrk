/**
 * 
 */
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Elementutils;

/**
 * @author LENOVO
 *
 */
public class Loginpage {
	WebDriver driver;
	private Elementutils elementutils;

	public Loginpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	Elementutils elementutils=new Elementutils(driver);

}
@FindBy(id=("input-email"))
private WebElement email;

@FindBy(id=("input-password"))
private WebElement password;

@FindBy(xpath="//input[@type='submit']")
private WebElement submit;

@FindBy(xpath="//div[contains(@Class, 'alert-dismissible')]")
private WebElement warningmessg;

public void clickonemail(String emailtext) {
	elementutils.typeTextIntoElement(email, emailtext, 20);
//email.sendKeys(emailtext);
}
public void clickonpassword(String passwordtext) {
	elementutils.typeTextIntoElement(email, passwordtext, 20);
email.sendKeys(passwordtext);
}
public Accountpage clickonsubmit() {
	elementutils.clickOnElement(submit, 20);
	//submit.click();
	return new Accountpage(driver);
}
public void statusdisplaywarningmessge() {
	elementutils.getTextFromElement(warningmessg, 20);
	//warningmessg.isDisplayed();	
}


}
