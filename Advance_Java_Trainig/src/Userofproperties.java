import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Userofproperties {

	public static void main(String[] args) throws IOException {
		
		String browserfromfile = null;
		String urlfromfile = null;
		
	//	System.out.println(System.getProperty("user.dir")+"\\src\\object.properties");
		
		String filelocation = System.getProperty("user.dir")+"\\src\\object.properties";
		
		FileInputStream reader = new FileInputStream(filelocation);
		Properties prop = new Properties();
		prop.load(reader);
		System.out.println(prop.getProperty("URL"));
		
		 browserfromfile = prop.getProperty("BROWSER");
		 urlfromfile = prop.getProperty("URL");
		
		if(browserfromfile.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\yadavs\\Desktop\\Selenium_Advance\\ChromeDriver\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get(urlfromfile);
		}
		if(browserfromfile.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\yadavs\\Desktop\\Selenium_Advance\\ChromeDriver\\chromedriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
			driver.get(urlfromfile);
		}
	}

}
