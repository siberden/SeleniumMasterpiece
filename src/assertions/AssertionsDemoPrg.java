package assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemoPrg {
	//using all assertions
	@Test
	public void assertionDemo()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.yatragenie.com/");
		Assert.assertEquals(driver.getTitle(), "YATRAGENIE | ONLINE BUS BOOKING | CABS BOOKING| HOTEL BOOKING");
	    Assert.assertTrue(driver.getTitle().contains("ONLINE"));
	    driver.close();
	}

}
