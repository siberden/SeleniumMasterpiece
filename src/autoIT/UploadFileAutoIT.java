package autoIT;

	import java.io.IOException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

	public class UploadFileAutoIT {
         //not worked properly
		static WebDriver driver;
		String URL = "file:///F:/hari%20vardhan/Demo/samplehtml.html";
		@Test
		public void testUpload() throws InterruptedException, IOException
		{
			driver = new FirefoxDriver();
			driver.get(URL);
			WebElement element = driver.findElement(By.name("upfile"));
			element.click();
	               //Which calls the autoit exe file
			Runtime.getRuntime().exec("F:/hari vardhan/Demo/upload.exe");
		}	
	}


