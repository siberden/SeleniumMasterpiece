package windowHandle;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowHandleDemo {
	@Test
	public void windowHandleMethod()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.naukri.com/");
		String openWindowHandle=driver.getWindowHandle();
		System.out.println(driver.getTitle());
		Set<String> allWindowHandles =driver.getWindowHandles();
	    
				
		for(String currentwindow : allWindowHandles)
	    {
	    	if(!currentwindow.equals(openWindowHandle))
	    	{
	    		driver.switchTo().window(currentwindow);
	    		driver.close();
	    	}
	    }
		
	}

}
