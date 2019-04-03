package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CLickDemo {
	
	@Test
	public void clicks()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.mycontactform.com/samples.php");
		driver.findElement(By.name("email_to[]")).click();
		driver.findElement(By.id("subject")).sendKeys("Hi");
		driver.findElement(By.xpath("//textarea[@id='q2']")).sendKeys("very large text");
		
		Select dropdown= new Select(driver.findElement(By.name("q3")));
		dropdown.selectByVisibleText("Second Option");
		dropdown.selectByIndex(3);
		dropdown.selectByValue("");
		dropdown.deselectByValue("");
		dropdown.deselectAll();
		boolean value=dropdown.isMultiple();
		System.out.println(value);
		driver.findElement(By.xpath("//input[@value='Second Option']")).click();
		driver.findElement(By.xpath("//input[@value='Second Option']")).isEnabled();
		
		driver.findElement(By.xpath("//input[@value='First Check Box']")).click();
		driver.findElement(By.xpath("//input[matches(@value,'Second Check Box')]")).click();
		driver.findElement(By.xpath("//input[contains(@value,'Second')]")).click();
		driver.findElement(By.xpath("//input[starts-with(@value,'Third']")).click();
		driver.findElement(By.xpath("//input[ends-with(@value,'Box']")).click();
		
	}

}
