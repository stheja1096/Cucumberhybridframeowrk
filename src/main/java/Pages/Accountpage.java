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
public class Accountpage {
	WebDriver driver;
	private Elementutils elementutils;

	public Accountpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	Elementutils elementutils=new Elementutils(driver);


}
@FindBy(linkText=("Edit your account information"))
private WebElement statusEdityouraccountinformation;


public boolean  dispalystatusEdityouraccountinformation() {
	elementutils.displayStatusOfElement(statusEdityouraccountinformation, 20);
	return statusEdityouraccountinformation.isDisplayed();
}
}

