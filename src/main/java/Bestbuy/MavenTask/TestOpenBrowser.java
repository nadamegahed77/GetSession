package Bestbuy.MavenTask;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestOpenBrowser extends browsers {
	@BeforeTest()
	void openDriver()
	{
		TestOpenBrowser browser = new TestOpenBrowser();
			browser.openbrowser("chrome", "http://testfire.net/login.jsp");


	}	
	

}
