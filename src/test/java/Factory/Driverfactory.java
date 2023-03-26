/**
 * 
 */
package Factory;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utils.Readconfig;
import Utils.commonutils;

/**
 * @author LENOVO
 *
 */
public class Driverfactory {
	private static final String CommonUtils = null;
	static  WebDriver driver=null;

	
	public static WebDriver   initializebrowser(String browsername) {
		Properties pro=Readconfig.ininitializeproperties();

		if(browsername.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
			
		}
		else if(browsername.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();

	}
		else if(browsername.equalsIgnoreCase("edge")){
			driver = new EdgeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(commonutils.PAGE_LOAD_TIME));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(commonutils.IMPLICIT_WAIT_TIME));
		}
			return driver;
		
		
	
	}
	public  static  WebDriver getdriver() {
		return driver;

		
	}
	}

	
