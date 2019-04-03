package javaScriptExec;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScrollBarDemo {
	
	@Test
	public void scrollBar()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.guru99.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,400)");
		
	}

}
