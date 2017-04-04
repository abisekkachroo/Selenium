package ReUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserFactory {

	WebDriver driver;
	@Test
	@Parameters("browser")
	public void VerifyPageTitle(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","C://chromedriver_win32(1)//chromedriver.exe");
			 driver = new ChromeDriver();
		}
		if(browsername.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver","C://IEDriverServer_x64_3.3.0//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		
		
		
	}
	
	
	
	
	
	



}
