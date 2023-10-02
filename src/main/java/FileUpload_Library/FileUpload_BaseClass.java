package FileUpload_Library;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Adactin_Library.UtilityClass;


public class FileUpload_BaseClass 
{
	protected WebDriver driver;
	
	ChromeOptions co;
	public void initBrowser() throws IOException
	{
		co=new ChromeOptions();
		String s1=System.getProperty("user.dir")+"\\Download\\";
		
		HashMap mp=new HashMap();
		
		mp.put("download.default_directory", s1);
		
		co.setExperimentalOption("prefs", mp);
		
		
		
		
		
		driver=new ChromeDriver(co);
		
		
		String url=FileUpload_UtilityClass.getURLfromPF();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}

}
