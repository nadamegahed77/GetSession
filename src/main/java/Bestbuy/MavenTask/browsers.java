package Bestbuy.MavenTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class browsers
{
	
	void openbrowser(String name,String Url)
	{
		if(name == "chrome")
		{
		WebDriver driver= new ChromeDriver();
		String chromePath= System.getProperty("user.dir")+"\\Driver\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver",chromePath);
	   driver.navigate().to(Url);

	}
		else if (name == "firefox"){
			String fireFoxPath= System.getProperty("user.dir")+"\\Driver\\geckodriver.exe";
			WebDriver driver = new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver",fireFoxPath);
			driver.navigate().to(Url);

		}
	}
	
	
}