package javaScriptExec;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ElementHighlight {
	
	WebDriver driver;
	public void elementHighlight(WebElement searchBox)
	{
		for (int i = 0; i < 2; i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(
					"arguments[0].setAttribute('style', arguments[1]);",searchBox, "color: red; border: 3px solid red;");
			js.executeScript(
					"arguments[0].setAttribute('style', arguments[1]);",searchBox, "");
		}
	}
	
@Test
public void GoogleSearch() throws Exception, SQLException {

	//System.setProperty("webdriver.chrome.driver","");
	driver=new FirefoxDriver();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.xpath("//center/div[2]")).click();
	WebElement searchBox = driver.findElement(By.xpath("//div[3]/div/input"));
	elementHighlight(searchBox);
	driver.findElement(By.xpath("//div[3]/div/input")).clear();
	driver.findElement(By.xpath("//div[3]/div/input")).sendKeys("Test");
	driver.findElement(By.xpath("//button")).click();

}
	

}
