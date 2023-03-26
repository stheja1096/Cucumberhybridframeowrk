/**
 * 
 */
package Hooks;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Factory.Driverfactory;
import Utils.Readconfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

/**
 * @author LENOVO
 *
 */
public class Myhooks {
	WebDriver driver;
	@Before
	public void setup() throws IOException {
		Properties pro=new Readconfig().ininitializeproperties();
		//Properties pro=Readconfig.ininitializeproperties();
	driver=	Driverfactory.initializebrowser(pro.getProperty("browser"));
	driver.get(pro.getProperty("url"));


	}
	@After
	public void teardown(Scenario Scenario) {
String scenarioName = Scenario.getName().replaceAll(" ","_");
		
		if(Scenario.isFailed()) {
			
			byte[] srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			Scenario.attach(srcScreenshot,"image/png", scenarioName);
		driver.quit();
	}


}
}
