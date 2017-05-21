import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class HeadlessBrowser {

	public static void main(String[] args) throws IOException {
		
//		HtmlUnitDriver htmlDriver = new HtmlUnitDriver();
		
		System.setProperty("phantomjs.binary.path","C:\\Users\\yadavs\\Desktop\\Selenium_Advance\\PhatomJS\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		WebDriver phjsDriver = new PhantomJSDriver();
		
		phjsDriver.get("https://nextgen.lloydslistintelligence.com");
		System.out.println(phjsDriver.getTitle());
		
		File scrfile= ((TakesScreenshot)phjsDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile, new File("C:\\Users\\yadavs\\Desktop\\Selenium_Advance\\ScreenShots\\1.png"));
		

	}

}
