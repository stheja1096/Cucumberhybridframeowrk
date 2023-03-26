/**
 * 
 */
package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author LENOVO
 *
 */
public class Readconfig {
	
	public static Properties ininitializeproperties()  {
		Properties prop=new Properties();
		File propfile=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Config\\Config.properties");
		
		try {
		FileInputStream fis=new FileInputStream(propfile);
		prop.load(fis);
	}
		catch(Throwable e){
			e.printStackTrace(); 	
		}
	return prop;

		}
	}

