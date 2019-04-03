package browser;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxProfile;
	import org.testng.annotations.Test;

	public class FirefoxProfileDemo {

	WebDriver driver;

	@Test
	public void testExamples(){
	FirefoxProfile profile = new FirefoxProfile();
	profile.setPreference("browser.startup.homepage",
	"https://www.google.co.in/");
	driver = new FirefoxDriver(profile);

	WebElement element = driver.findElement(By.name("q"));
	element.sendKeys("100");

	}
}
