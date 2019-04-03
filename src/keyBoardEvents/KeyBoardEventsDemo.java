package keyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class KeyBoardEventsDemo {
	
	@Test
	public void keywordEvents()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.co.in/");
		driver.manage().window().setSize(new Dimension(400,768));
		
		driver.findElement(By.name("q")).sendKeys("hi");
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		
	}

	
}
