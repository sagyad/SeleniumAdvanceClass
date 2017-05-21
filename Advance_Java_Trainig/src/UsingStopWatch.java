import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingStopWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long starttime = System.currentTimeMillis();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadavs\\Desktop\\Selenium_Advance\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		StopWatch s = new StopWatch();
		s.start();
		driver.get("https://nextgen.lloydslistintelligence.com");
		s.stop();

		System.out.println(s.getTime());

	}

}
