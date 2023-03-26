/**
 * 
 */
package Stepdefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverService;

import Factory.Driverfactory;
import Pages.Accountpage;
import Pages.Homepage;
import Pages.Loginpage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author LENOVO
 *
 */
public class Login {
	WebDriver driver;
	private Loginpage lp;
	private Accountpage ac;
	//private Driverfactory driverfactory;

	
	@Given("User naviagtes to Login page")
	public void User_naviagtes_to_Login_page() {
		 //driverfactory=new Driverfactory();

		driver=Driverfactory.getdriver();
		Homepage homepage=new Homepage(driver);
		homepage.clickonmyaccount();
	lp=homepage.clickonloginoption();
		
		
}
	@When("User enters the email {string} in email field")
	public void user_enters_the_email_in_email_field(String email) {
		//Loginpage lp=new Loginpage(driver);
		lp.clickonemail(email);
		//driver.findElement(By.id("input-email")).sendKeys(email);
	}

	@And("User enters the password {string} in password field")
	public void user_enters_the_password_in_password_field(String password) {
		//Loginpage lp=new Loginpage(driver);
          lp.clickonpassword(password);
		//driver.findElement(By.id("input-password")).sendKeys(password);
	}

	@And("click on the login button")
	public void click_on_the_login_button() {
		//Loginpage lp=new Loginpage(driver);
ac=lp.clickonsubmit();
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("User gets the success page")
	public void user_gets_the_success_page() {
		//Accountpage ac=new Accountpage(driver);
		ac.dispalystatusEdityouraccountinformation();
		//Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	}

	@When("User enters the invalid email {string} in email field")
	public void user_enters_the_invalid_email_in_email_field(String invalidemail) {
		//Loginpage lp=new Loginpage(driver);
		lp.clickonemail(invalidemail);
		//driver.findElement(By.id("input-email")).sendKeys(invalidemail);

	}

	@And("User enters the invalid password {string} in password field")
	public void user_enters_the_invalid_password_in_password_field(String invalidpassword) {
		lp.clickonpassword(invalidpassword);

	//	driver.findElement(By.id("input-password")).sendKeys(invalidpassword);

	}

	@Then("User gets the proper warning messages mismatch")
	public void user_gets_the_proper_warning_messages_mismatch() {
		lp.statusdisplaywarningmessge();
		//Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@Class, 'alert-dismissible')]")).getText().contains("Warning: No match for E-Mail Address and/or Password."));
	}

	@When("User enters the valid email {string} in email field")
	public void user_enters_the_valid_email_in_email_field(String validemail) {
		lp.clickonemail(validemail);
		//driver.findElement(By.id("input-email")).sendKeys(validemail);

	}

	@And("User enters the innvalid password {string} in password field")
	public void user_enters_the_innvalid_password_in_password_field(String invalidpassword) {
		lp.clickonpassword(invalidpassword);
		//driver.findElement(By.id("input-password")).sendKeys(invalidpassword);

	}

	@When("User enters the without email  in email field")
	public void user_enters_the_without_email_in_email_field() {
		lp.clickonemail("");
	}

	@And("User enters the with out password  in password field")
	public void user_enters_the_with_out_password_in_password_field() {
		lp.clickonpassword("");
	}

		

}
