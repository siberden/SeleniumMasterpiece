package browser;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;
public class MultiBrowserDemo {
	//program to open one website in chrome,firefox,IE
	WebDriver driver;
	
	Logger log = Logger.getLogger(MultiBrowserDemo.class); 
	
	@Test
	public void firefoxBrowser()
	{
		driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/");
				
		log.info("worked on firefox browser.");
		System.out.println("worked on firefox browser");
		driver.quit();
	}
	@Test
	public void chromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","F:\\HARI PERSONAL\\chromedriver.exe");
	    driver= new ChromeDriver();
		driver.navigate().to("http://toolsqa.com/");
		System.out.println("worked on chrome browser");
		driver.close();
	}
	@Test
	public void internetExplorer()
	{
		System.setProperty("webdriver.ie.driver","F:\\HARI PERSONAL\\IEDriverServer.exe");
		driver= new ChromeDriver();
		driver.navigate().to("http://toolsqa.com/");
		System.out.println("worked on ie browser");
		driver.quit();
	}
	@Test
	
	public void headLessBrowser()
	{
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("http://toolsqa.com/");
		System.out.println("worked on headless browser");
		log.info("worked on HeadLess browser.");
		driver.quit();
	}

}
