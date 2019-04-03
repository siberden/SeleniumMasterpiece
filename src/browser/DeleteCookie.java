package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DeleteCookie {
	@Test
	public void deleteAllCookiesExample()
	{
		WebDriver driver= new FirefoxDriver();
		String URL="http://www.facebook.com";
		driver.navigate().to(URL);
		driver.manage().deleteAllCookies();
	}
}
