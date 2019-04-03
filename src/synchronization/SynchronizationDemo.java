package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
//import com.thoughtworks.selenium.Selenium;

public class SynchronizationDemo {
// used implicitly wait, Explicitly wait, thread.sleep
	
	@Test
	public void syncDemo() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.fb.com");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("omhareram@gmail.com");
		//Runs each command in after setSpeed delay by the number of milliseconds mentioned in setSpeed.
		//--string time in milliseconds
		//Selenium.setSpeed("2000");
		driver.findElement(By.id("pass")).sendKeys("0029587hari");
		driver.findElement(By.xpath("//input[@id='u_0_w']")).click();
		//Thread.sleep
		//Waits for only once at the command given at sleep ---integer time in milliseconds
		Thread.sleep(1000);
		driver.findElement(By.id("userNavigationLabel")).click();
		//explicitly wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='uiScrollableAreaContent']/ul/li[12]/a")));
		element.click();
		driver.quit();
	}
}



