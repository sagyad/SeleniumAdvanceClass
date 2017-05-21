import org.openqa.selenium.chrome.ChromeDriver;

public class ClientSideperformance_SystemTime {

	public static void main(String[] args) {
		
		// Declaring Firefo2x driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadavs\\Desktop\\Selenium_Advance\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		long starttime = System.currentTimeMillis();
		
		driver.get("http://www.bbc.co.uk");
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime - starttime);
		
	}
	
}
