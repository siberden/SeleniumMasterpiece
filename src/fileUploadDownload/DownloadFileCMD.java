package fileUploadDownload;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DownloadFileCMD
{
	//program to download a file directly through command line by bypassing all windows
	
	//not executed properly file was not downloaded
	@Test
	public void downLoadFile()
	{
    	String baseUrl = "http://www.seleniumhq.org/download/";
	    WebDriver driver = new FirefoxDriver();
	    driver.get(baseUrl);
	    WebElement downloadButton = driver.findElement(By.linkText("Download"));
	    String sourceLocation = downloadButton.getAttribute("href");
	    //file is dowload to F: drive
	    String wget_command = "cmd /c wget -P f: --no-check-certificate " + sourceLocation;
	 
	   try {
	       Process exec = Runtime.getRuntime().exec(wget_command);
	       //waitFOr() command wait until file is download
	       int exitVal = exec.waitFor();
	       System.out.println("Exit value: " + exitVal);
	       }
	   catch (InterruptedException | IOException ex)
	      {
	      System.out.println(ex.toString());
	      }
	driver.quit();
	}
}


