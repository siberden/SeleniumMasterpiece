package windowHandle;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SwitchBetTabsDemo {
	
	
	@Test
	public void testTabs() {
		System.setProperty("webdriver.chrome.driver","F:\\HARI PERSONAL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://auroriansrocks.blogspot.in/p/mca-projects.html");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    // considering that there is only one tab opened in that point.
	    String oldTab = driver.getWindowHandle();
	    driver.findElement(By.linkText("BG Verification")).click();
	    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	    newTab.remove(oldTab);
	    // change focus to new tab
	    driver.switchTo().window(newTab.get(0));
	 
	    // Do what you want here, you are in the new tab
	    driver.findElement(By.linkText("Mingle Spot")).click();
	    
	    driver.close();
	    // change focus back to old tab
	    driver.switchTo().window(oldTab);
	   WebDriverWait wait=new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Back to My Village"))).click();
	   // driver.close();
	   

	    // Do what you want here, you are in the old tab
	}
}
