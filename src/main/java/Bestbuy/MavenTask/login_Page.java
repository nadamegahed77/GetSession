package Bestbuy.MavenTask;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.*;


public class login_Page {
	WebDriver driver= new ChromeDriver();

	@BeforeTest
	void openBrowser()
	{
		String chromePath= System.getProperty("user.dir")+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromePath);
	   driver.navigate().to("http://testfire.net/login.jsp");
	  

}
	@Test
	void login() {
		 WebElement username =driver.findElement(By.id("uid"));
		   username.sendKeys("admin");
		   WebElement password =driver.findElement(By.id("passw"));
		  password.sendKeys("admin");
		  WebElement btnLogin =driver.findElement(By.name("btnSubmit"));
		  btnLogin.click();
		  WebElement Home=driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/div/h1"));
	String Title= Home.getText();
		  assertEquals(Title, "Hello Admin User");
	}
	@AfterTest
	void closeBrowser()
	{
		driver.close();
	}
}
