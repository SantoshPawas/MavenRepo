package FileUpload_Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FileUpload_UtilityClass 
{
	WebDriver driver;
	@Test
	public static String getURLfromPF() throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\shree\\eclipse-workspace\\AdactinHotelAllTestCasses\\FileUpload.properties");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String url=prop.getProperty("URL");
		
		return url;
	}
	
}
