package javaScriptExec;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IsEnabled
{
	@Test
	public void clicks()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.mycontactform.com/samples.php");
		driver.findElement(By.name("email_to[]")).click();
	    JavascriptExecutor javascript = (JavascriptExecutor) driver;
	    String todisable = "document.getElementsByName('email_to[]')[0].setAttribute('disabled', '');";
	    javascript.executeScript(todisable);
	   // String toenable = "document.getElementsByName('email_to[]')[0].removeAttribute('disabled');";
	   // javascript.executeScript(toenable); 
	}
}