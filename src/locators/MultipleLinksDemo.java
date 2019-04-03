package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleLinksDemo {
	
	@Test
	public void multipleLinks()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/selenium-webdriver/selenium-tutorial/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement text:links)
		{
			System.out.println(text.getText());
		}
		
	}

}
