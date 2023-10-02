package Fileupload_Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import FileUpload_Library.FileUpload_BaseClass;


public class Upload_Test extends FileUpload_BaseClass 
{
	
	
	@BeforeClass
	public void openBrowser() throws IOException
	{
		initBrowser();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
		
		
		
	}
	@BeforeMethod
	public void clickbutton()
	{
		
	}
	@Test(priority=1)
	public void selectpdf() throws AWTException
	{
		StringSelection ss=new StringSelection("C:\\Users\\shree\\eclipse-workspace\\AdactinHotelAllTestCasses&FileUploadDownload\\TestData\\15th April Morning - External_Mock_Group (1).pdf");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//press control +V
		
		Robot r1=new Robot();
		r1.delay(2000);
		
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_V);
		
		//key release
		
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_V);
		
		//press &release enter
		
		r1.keyPress(KeyEvent.VK_ENTER);
		
		r1.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}
	@Test(priority=2)
	public void clcikdownloadword()
	{
		driver.findElement(By.xpath("//*[text()='Convert to WORD']")).click();
	}
	

}
