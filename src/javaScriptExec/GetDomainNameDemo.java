package javaScriptExec;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetDomainNameDemo {
	
	
	@Test public void getDomainName()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.mycontactform.com/samples.php");
		String CurrentURL = driver.getCurrentUrl();
		System.out.println("My Current URL Is : "+CurrentURL);
		//Get and store domain name in variable 
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
	    String DomainUsingJS=(String)javascript.executeScript("return document.domain");
	    System.out.println("My Current URL Is : "+DomainUsingJS); }
	}