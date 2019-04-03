package mouseEvents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragNDropPixel {

	WebDriver driver = null;
	@BeforeTest
	public void setup() throws Exception
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2014/09/drag-and-drop.html");
	}
	@Test
	public void dragAndDrop() throws InterruptedException
	{
		//Locate element which you wants to drag. 
		WebElement dragElementFrom = driver.findElement(By.xpath("//div[@id='dragdiv']"));
		//To drag and drop element by 100 pixel offset In horizontal direction X. 
		new Actions(driver).dragAndDropBy(dragElementFrom, 100, 0).build() .perform();
		//To generate alert after horizontal direction drag and drop. VIEW EXAMPLE
		JavascriptExecutor javascript = (JavascriptExecutor) driver; 
		javascript.executeScript("alert('Element Is drag and drop by 100 pixel offset In horizontal direction.');"); 
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		//To drag and drop element by 100 pixel offset In Vertical direction Y. 
		new Actions(driver).dragAndDropBy(dragElementFrom, 0, 100).build() .perform();
		//To generate alert after Vertical direction drag and drop. 
		javascript.executeScript("alert('Element Is drag and drop by 100 pixel offset In Vertical direction.');"); 
		Thread.sleep(5000); driver.switchTo().alert().accept();
		//To drag and drop element by -100 pixel offset In horizontal and -100 pixel offset In Vertical direction. 
		new Actions(driver).dragAndDropBy(dragElementFrom, -100, -100).build() .perform();
		//To generate alert after horizontal and vertical direction drag and drop. 
		javascript.executeScript("alert('Element Is drag and drop by -100 pixel offset In horizontal and -100 pixel offset In Vertical direction.');");
		Thread.sleep(5000); driver.switchTo().alert().accept();
	}
}
