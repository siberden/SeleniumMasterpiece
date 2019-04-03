package alerts_popups;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class UnexpectedAlertHandling
{
	WebDriver driver;
	@BeforeTest public void setup() throws Exception
	{ 
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2014/06/alert_6.html");
	}
	@AfterTest public void tearDown() throws Exception
	{
		driver.quit();
	}
	@Test public void Text() throws InterruptedException
	{
		//To handle unexpected alert on page load.
		try{
			driver.switchTo().alert().dismiss();
		   }
		catch(Exception e)
		{
			System.out.println("unexpected alert not present");
		}
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("fname");
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("lname");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
} 
