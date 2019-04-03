package synchronization;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.By; 
import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions; 
import org.openqa.selenium.support.ui.WebDriverWait; 
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class WebelementHighlightDemo
{
	WebDriver driver = new FirefoxDriver();
	@BeforeTest
	public void beforetest()
	{
		driver.manage().window().maximize(); 
		driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@AfterTest
	public void aftertest()
	{
		driver.quit();
	}
	@Test
	public void test ()
	{
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("My Name");
	
		HighlightMyElement(driver.findElement(By.xpath("//input[@name='fname']")));
		//HighlightMyElement(driver.findElement(By.xpath("//h3[contains(text(),'New')]"))); 
		//HighlightMyElement(driver.findElement(By.xpath("//a[contains(text(),'book')]")));
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#submitButton"))); 
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='text3']"))); 
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@id='text4']")));
		//wait.until(ExpectedConditions.alertIsPresent());
		//wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='timeLeft']"), "Time left: 7 seconds"));
		driver.findElement(By.cssSelector("#submitButton")).click();
	}
	public void HighlightMyElement(WebElement element) 
	{
		for (int i = 0; i < 10; i++) 
		{
			
			JavascriptExecutor javascript = (JavascriptExecutor) driver;
			javascript.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: orange; border: 4px solid orange;"); 
			javascript.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: pink; border: 4px solid pink;"); 
			javascript.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: yellow; border: 4px solid yellow;");
			javascript.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
		}
	}
}
