package testNG.dataProviderDemo1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.testng.annotations.BeforeTest; 
import org.testng.annotations.Test; 
public class FormSubmit
{ 
	private static WebDriver driver;
	@BeforeTest public void setUp() 
	{
		driver = new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html"); 
	}
	//This Submit method will access data from dataProvider_Repository.java class file where dataProvider name Is FormData. 
	@Test(dataProviderClass=DataProvider_Repository.class,dataProvider="FormData") 
	public static void Submit(String fname, String lname, String email, String mobile, String company)
	{
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(fname); 
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(lname);
		driver.findElement(By.xpath("//input[@name='EmailID']")).sendKeys(email); 
		driver.findElement(By.xpath("//input[@name='MobNo']")).sendKeys(mobile);
		driver.findElement(By.xpath("//input[@name='Company']")).sendKeys(company); 
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 
		driver.switchTo().alert().accept();
	}
}