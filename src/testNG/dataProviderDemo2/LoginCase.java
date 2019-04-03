package testNG.dataProviderDemo2;

import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest; 
import org.testng.annotations.Test; 
public class LoginCase 
{
	private static WebDriver driver; 
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html");
	}
	//This LogIn method will access data from dataProvider_Repository class file where dataProvider name Is BothData. 
	@Test(dataProviderClass=DataProvider_Repository.class,dataProvider="BothData") 
	public static void LogIn(String UID, String PASS) 
	{
		driver.findElement(By.xpath("//input[@name='userid']")).sendKeys(UID);
		driver.findElement(By.xpath("//input[@name='pswrd']")).sendKeys(PASS);
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 
		driver.switchTo().alert().accept(); 
	} 
}