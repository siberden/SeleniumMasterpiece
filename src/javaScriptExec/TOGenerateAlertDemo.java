package javaScriptExec;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TOGenerateAlertDemo {
	@Test
	public void toGenerateAlert() throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.mycontactform.com/samples.php");
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("alert('Test Case Execution Is started Now..');");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
}
