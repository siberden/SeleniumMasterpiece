package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RobotClassDemo {
	
	@Test
	public void robotClass() throws AWTException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.mycontactform.com/samples/basiccontact.php");
		Robot r=new Robot();
        driver.findElement(By.name("q[1]")).sendKeys("");
        r.keyPress(KeyEvent.VK_H);
        r.keyRelease(KeyEvent.VK_H);
      	driver.findElement(By.name("email")).sendKeys("hi");
    	driver.findElement(By.name("q[2]")).sendKeys("hi");
		driver.findElement(By.name("submit")).click();
		
	}

}
