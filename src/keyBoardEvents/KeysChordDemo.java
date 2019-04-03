package keyBoardEvents;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	
	public class KeysChordDemo {
	 
	 public WebDriver driver;

	 @Test
	 public void testKeys_Chord() throws Exception {
	  driver.get("https://accounts.google.com/signup");
	  //Element definitions for FirstName and LastName
	  WebElement txtFName=driver.findElement(By.name("FirstName"));
	  WebElement txtLName=driver.findElement(By.name("LastName"));
	  //Type "webdriver" in First Name
	  txtFName.sendKeys("webdriver");
	  //Create an object for Actions Class
	  Actions a = new Actions(driver);
	  //select the value which is typed in FirstName field
	  a.sendKeys(txtFName, Keys.chord(Keys.CONTROL,"a")).perform();
	  //Performing copy action using CTRl+C
	  a.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
	  //Performing paste action using CTRL+V in LastName field
	  a.sendKeys(txtLName, Keys.chord(Keys.CONTROL,"v")).perform();
	  Thread.sleep(2000);
	 }

	 @BeforeClass
	 public void beforeClass() 
	 {
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }

	 @AfterClass
	 public void afterClass() throws Exception 
	 {
	  driver.quit();
	 }
	}


