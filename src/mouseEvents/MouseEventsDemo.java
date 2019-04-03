package mouseEvents;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseEventsDemo {
	//http://www.guru99.com/keyboard-mouse-events-files-webdriver.html
	//program for mouse events
	@Test
	public void mouseEvents() throws InterruptedException, AWTException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/sortable/droppable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//list the frames using tagName 'iframe'
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		String value=frames.toString();
		System.out.println(value);
		//switching to frame
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']"));
				driver.switchTo().frame(frameElement);
		//creating object for actions class
		Actions action=new Actions(driver);
		//for drag and drop
		action.dragAndDrop(driver.findElement(By.id("draggable")),
				           driver.findElement(By.id("droppable"))).perform();
		//switching back from iframe
		driver.switchTo().defaultContent();
		//for right click
		action.contextClick(driver.findElement(By.linkText("About"))).build().perform();
		//select 'open link in new tab' option from menu after right click using 'Keys' class
		driver.findElement(By.linkText("About")).sendKeys(Keys.ARROW_DOWN);
		//pressing enter using 'Robot' class 
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		action.moveToElement(driver.findElement(By.linkText("Blog")));
		action.click().build().perform();
		
	}

}
