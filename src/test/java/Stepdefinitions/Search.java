package Stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Factory.Driverfactory;
import Pages.Homepage;
import Pages.SearchResultspage;
import io.cucumber.java.en.*;

public class Search {
	WebDriver driver;
	private SearchResultspage srp;
	private Homepage hp;
	//private Driverfactory driverfactory;

	@Given("User opens the Application")
	public void user_opens_the_application() {
		// driverfactory=new Driverfactory();
		driver=Driverfactory.getdriver();
		
	}

	@When("User enters valid product {string} into Search box field")
	public void user_enters_valid_product_into_search_box_field(String validproduct) {
	 hp=new Homepage(driver);
		hp.enterproductintosearchbox(validproduct);
		
	}

	@And("User clicks on Search button")
	public void user_clicks_on_search_button() {
		srp=hp.clickonsearchbutton();
		//driver.findElement(By.xpath("//button[contains(@class,'btn-default')]")).click();
	}

	@Then("User should get valid product displayed in search results")
	public void user_should_get_valid_product_displayed_in_search_results() {
		SearchResultspage srp=new SearchResultspage(driver);
		srp.statussearchvalidresults();
		
		Assert.assertTrue(srp.statussearchvalidresults());

	}

	@When("User enters invalid product {string} into Search box field")
	public void user_enters_invalid_product_into_search_box_field(String invalidproduct) {
	//	Homepage hp=new Homepage(driver);
		hp.enterproductintosearchbox(invalidproduct);


		//driver.findElement(By.xpath("//input[@name='search']")).sendKeys(invalidproduct);

		
	}

	@Then("User should get a message about no product matching")
	public void user_should_get_a_message_about_no_product_matching() {
	//	SearchResultspage srp=new SearchResultspage(driver);
		srp.gettextmessage();
		//Assert.assertEquals("There is no product that matches the search criteria.","driver.findelement(By.xpath("//input[@type='button']/following-sibling::p)").gettext();


	}

	@When("User dont enter any product name into Search box field")
	public void user_dont_enter_any_product_name_into_search_box_field() {
//intentionally kept blank
		hp=new Homepage(driver);
		
	}


}
