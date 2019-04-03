package excelData;


import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DataFromExcelDemo {

@Test
	
	public void checkValidLogin() throws IOException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		FileInputStream fis=new FileInputStream("F:\\hari vardhan\\Demo\\SeleniumDemo\\test data\\user.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheetAt(0);
		int i=sheet.getLastRowNum()+1;
		System.out.println(i);
		for(int j=0;j<i;j++)
		{
			XSSFRow row=sheet.getRow(j);
			String uname=row.getCell(0).getStringCellValue();
			String pwd=row.getCell(1).toString();
			System.out.println(uname+" "+pwd);
		
		   driver.findElement(By.id("email")).sendKeys("omhareram@gmail.com");
		   driver.findElement(By.id("pass")).sendKeys("0029587hari");
		   driver.findElement(By.id("loginbutton")).click();
		}
	}
}
