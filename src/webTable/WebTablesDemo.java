package webTable;



import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebTablesDemo {
	@Test
	public void WebTables() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.yatragenie.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("fromCity")).sendKeys("Hyderabad");
		driver.findElement(By.id("toCity")).sendKeys("Nellore");
	    driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("html/body/div[2]/div[1]/table/tbody/tr[3]/td[5]/button")).click();
		driver.findElement(By.id("yg_searchBuses")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int tablerow=driver.findElements(By.xpath("//table[@id='availableBusesTable']/tbody/tr")).size();
	
		int tablecolumn=driver.findElements(By.xpath("//table[@id='availableBusesTable']/tbody/tr[1]/td")).size();
		int tablerc=driver.findElements(By.xpath("//table[@id='availableBusesTable']/tbody/tr/td")).size();
		System.out.println(tablerc+" "+tablerow+" "+tablecolumn);
		for(int i=1;i<=tablerow;i++)
				System.out.print(driver.findElement(By.xpath("//table[@id='availableBusesTable']/tbody/tr["+i+"]")).getText());
		driver.quit();
	
		
	}

}
